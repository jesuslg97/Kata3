package kata3;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    
    private final Histogram <String> histogram;
    
    public HistogramDisplay(String title, Histogram <String> histogram) {
        super("HISTOGRAMA");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
    }
    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel (createChart(createDatase()));
        setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart", "Dominios email", "Nº de emails", dataSet, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
                return chart;
    }
    
    private DefaultCategoryDataset createDatase() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for (String key : histogram.keySet()) {
            dataSet.addValue(histogram.get(key), "", key);
        }
        return dataSet;
    }
}