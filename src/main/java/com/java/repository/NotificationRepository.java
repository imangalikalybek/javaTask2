package com.java.repository;

import com.java.model.Notification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NotificationRepository extends CrudRepository<Notification,Long> {

    List<Notification> findAll();
}
