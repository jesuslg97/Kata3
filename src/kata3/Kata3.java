package kata3;

public class Kata3 {
    
    public static void main(String[] args) {
        
     //HistogramDisplay histo = new HistogramDisplay("JFreeChart");
     //histo.execute();
        Histogram <String> histogram = new Histogram<>();
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("ull.es");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
     
        new HistogramDisplay("Hola", histogram).execute();
    }
    
}