package lk.mydentist.api.service.impl;

import lk.mydentist.api.model.User;
import lk.mydentist.api.repository.UserRepo;
import lk.mydentist.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }
}
