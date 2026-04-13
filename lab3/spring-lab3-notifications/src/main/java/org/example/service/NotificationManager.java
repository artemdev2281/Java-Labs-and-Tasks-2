package org.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NotificationManager {
    // Ключ - имя бина (напр. "emailService"), значение - сам объект
    private final Map<String, MessageService> servicesMap;

    @Autowired // можно опустить, если конструктор один
    // Конструктор для внедрения зависимости
    public NotificationManager(Map<String, MessageService> servicesMap) {
        this.servicesMap = servicesMap;
    }

    public void notify(String message, String recipient, List<String> serviceTypes) {
        for (String type : serviceTypes) {
            MessageService service = servicesMap.get(type);

            if (type != null) {
                service.sendMessage(message, recipient);
            } else {
                System.out.println("Сервис не найден: " + type);
            }
        }
    }
}
