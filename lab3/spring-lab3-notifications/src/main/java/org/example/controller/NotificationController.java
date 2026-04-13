package org.example.controller;

import org.example.service.NotificationManager;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotificationController {

    private final NotificationManager notificationManager;

    public NotificationController(NotificationManager notificationManager) {
        this.notificationManager = notificationManager;
    }

    @GetMapping("/notify")
    public String notify(@RequestParam String message, @RequestParam String email, @RequestParam List<String> types) {
        notificationManager.notify(message, email, types);
        return "Запрос обработан для сервисвов: " + types;
    }
}