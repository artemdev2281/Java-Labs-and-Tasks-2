package su.mtuci;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Приложение запущено");

        try {
            JsonDemo.main(args);
        } catch (Exception e) {
            logger.error("Ошибка при выполнении JsonDemo: ", e);
        }

        logger.info("Работа приложения завершена");
    }
}