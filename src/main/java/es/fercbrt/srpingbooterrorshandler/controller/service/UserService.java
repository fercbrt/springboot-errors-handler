package es.fercbrt.srpingbooterrorshandler.controller.service;

import es.fercbrt.srpingbooterrorshandler.models.User;

import java.util.List;

public interface UserService {

    List<User> findAll();
    User findById(Long id);
}
