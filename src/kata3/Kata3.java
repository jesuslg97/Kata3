package kata3;

public class Kata3 {
    
    public static void main(String[] args) {
        
     //HistogramDisplay histo = new HistogramDisplay("JFreeChart");
     //histo.execute();
        Histogram <String> histogram = new Histogram<>();
        histogram.increment("gmail.com", 4);
        histogram.increment("ulpgc.es", 4);    
        histogram.increment("ull.es", 3);        
        histogram.increment("hotmail.com", 2);
     
        new HistogramDisplay("Hola", histogram).execute();
    }
    
}