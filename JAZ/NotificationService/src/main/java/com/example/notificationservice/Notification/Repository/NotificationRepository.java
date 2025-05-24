package com.example.notificationservice.Notification.Repository;

import com.example.notificationservice.Notification.Model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
