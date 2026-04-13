package org.example.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String recepient) {
        System.out.println("EMAIL to " + recepient + ": " + message);
    }
}
