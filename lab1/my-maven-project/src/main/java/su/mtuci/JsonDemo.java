package su.mtuci;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonDemo {
    private static final Logger logger = LoggerFactory.getLogger(JsonDemo.class);
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            // Создаем объект класса User
            User user = new User("Студент МТУСИ", 20);

            // Сериализация (Object -> JSON)
            String json = mapper.writeValueAsString(user);
            logger.info("Объект преобразован в JSON: {}", json);

            // Десериализация (JSON -> Object)
            User deserializedUser = mapper.readValue(json, User.class);
            logger.info("Объект восстановлен из JSON: {}", deserializedUser.toString());

        } catch (Exception e) {
            logger.error("Ошибка при работе с JSON: ", e);
        }
    }
}