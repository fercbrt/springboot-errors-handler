package es.fercbrt.srpingbooterrorshandler.service.impl;

import es.fercbrt.srpingbooterrorshandler.service.UserService;
import es.fercbrt.srpingbooterrorshandler.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final List<User> users;

    public UserServiceImpl() {
        users = List.of(
            new User(1L, "John", "Doe", null),
            new User(2L, "Jane", "Doe", null),
            new User(3L, "Alice", "Smith", null)
        );
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }
}
