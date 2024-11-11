public interface LogObserver{
    void update(String logMessage);
}
class ConsoleLogObserver implements LogObserver{
    public void update(String logMessage){
        System.out.println("console logger :"+logMessage);
    }
}
class FileLogObserver implements LogObserver {
    public void update(String logMessage){
        System.out.println("console logger :"+logMessage);
    }
    
}