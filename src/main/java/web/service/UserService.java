package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public interface UserService {
    User getUserById(Long id);

    void saveUser(User user);

    void deleteUser(Long id);

    List<User> findAllUsers();
}
