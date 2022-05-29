package ObserverPattern;

public class GrabStocks {

    public static void main(String[] args) {

        // Create the Subject object
        // It will handle updating all observers 
        // as well as deleting and adding them
        StockGrabber stockGrabber = new StockGrabber();

        // Create an Observer that will be sent updates from Subject
        StockObserver observers[] = new StockObserver[10];

        for (int i = 0; i < observers.length; i++) {
                observers[i]=new StockObserver(stockGrabber);
        }

          stockGrabber.setAAPLPrice(100);
          stockGrabber.setGOOGPrice(150);
          stockGrabber.setIBMPrice(200);
          
          
    }

}
