package com.java.services;

import com.java.model.Notification;
import com.java.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServices {

    private final NotificationRepository notificationRepository;

    public NotificationServices(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<Notification> getAll(){
        return notificationRepository.findAll ();
    }

    public Notification getById(Long id){
        return notificationRepository.findById ( id ).orElse ( null );
    }

    public Notification create(Notification notification){
        return notificationRepository.save ( notification );
    }

    public Notification update(Notification notification){
        return notificationRepository.save ( notification );
    }

    public void delete(Long id){
        notificationRepository.deleteById ( id );
    }
}
