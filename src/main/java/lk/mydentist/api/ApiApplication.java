package lk.mydentist.api;

import jakarta.annotation.PostConstruct;
import lk.mydentist.api.model.User;
import lk.mydentist.api.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class ApiApplication {

    @Autowired
    private UserRepo userRepo;

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User(1L, "hotcat", "1234", "Admin", "hotcat@gmail.com")).collect(Collectors.toList());
        userRepo.saveAll(users);
    }

}
