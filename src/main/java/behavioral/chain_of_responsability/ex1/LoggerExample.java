package behavioral.chain_of_responsability.ex1;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {
    private static final Logger logger = Logger.getLogger(LoggerExample.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.FINEST);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINEST);

        logger.addHandler(consoleHandler);

        logger.finest("FINEST");
        logger.finer("FINER");
        logger.fine("FINE");
    }
}
