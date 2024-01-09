package lk.mydentist.api.service;

import lk.mydentist.api.model.User;

import java.util.List;


public interface UserService {
    User findByUsername(String username);

    List<User> getAll();
}

