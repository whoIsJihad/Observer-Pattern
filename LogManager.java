import java.util.ArrayList;
import java.util.List;

public class LogManager {
    private List<LogObserver> observers = new ArrayList<>();

    public void addObserver(LogObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(LogObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String logMessage) {
        for (LogObserver observer : observers) {
            observer.update(logMessage);
        }
    }

    public void log(String message) {
        System.out.println("LogManager: New log entry - " + message);
        notifyObservers(message);
    }
}
