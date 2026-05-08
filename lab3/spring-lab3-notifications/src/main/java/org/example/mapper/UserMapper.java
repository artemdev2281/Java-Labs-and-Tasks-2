package org.example.mapper;

import org.example.model.dto.UserDto;
import org.example.model.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDto toDto(User entity) {
        if (entity == null) {
            return null;
        }

        return UserDto.builder()
                .name(entity.getName())
                .email(entity.getEmail())
                .phone(entity.getPhone())
                .telegramChatId(entity.getTelegramChatId())
                .deviceToken(entity.getDeviceToken())
                .createdAt(entity.getCreatedAt())
                .build();
    }
}
