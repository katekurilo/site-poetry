package by.katekurilo.sitepoems.dao;

import by.katekurilo.sitepoems.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
