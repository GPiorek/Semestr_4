package com.example.notificationservice.Notification.Service;

import com.example.notificationservice.Notification.Model.Notification;
import com.example.notificationservice.Notification.Repository.NotificationRepository;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

@Service
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void notificationPrint(Notification notification) {
        Logger logger = LoggerFactory.getLogger(NotificationService.class);
        logger.debug(notification.toString());
        }

}
