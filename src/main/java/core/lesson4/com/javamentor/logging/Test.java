package core.lesson4.com.javamentor.logging;

import java.util.logging.Logger;

public class Test {

    public static void main(String[] args) {
        logging();
    }

    public static void logging() {
        final Logger LOGGER = Logger.getLogger("com.javamentor.logging.Test");
        LOGGER.info("Все хорошо");
        LOGGER.warning("Произошла ошибка" );

    }
}
