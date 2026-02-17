package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();

    User findById(Long id);

    void saveUser(User user);

    void deleteUser(Long id);
}
