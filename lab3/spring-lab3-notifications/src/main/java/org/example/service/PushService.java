package org.example.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class PushService implements MessageService {
    @Override
    public void sendMessage(String message, String recepient) {
        System.out.println("PUSH notification to " + recepient + ": " + message);
    }
}
