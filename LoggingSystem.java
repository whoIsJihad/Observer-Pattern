public class LoggingSystem {
    public static void main(String[] args) {
        LogManager logManager=new LogManager();
        LogObserver consoleLogger=new ConsoleLogObserver();
        LogObserver fileLogger=new FileLogObserver();
        logManager.addObserver(fileLogger);
        logManager.addObserver(consoleLogger);
        logManager.log("Lets put a smile on that face ");
    }
}
