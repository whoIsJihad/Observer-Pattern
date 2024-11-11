public interface LogObserver{
    void update(String logMessage);
}
class ConsoleLogObserver implements LogObserver{
    public void update(String logMessage){
        System.out.println("Console logger :"+logMessage);
    }
}
class FileLogObserver implements LogObserver {
    public void update(String logMessage){
        System.out.println("File logger :"+logMessage);
    }
    
}