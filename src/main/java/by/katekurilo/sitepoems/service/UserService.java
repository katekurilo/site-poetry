package by.katekurilo.sitepoems.service;

import by.katekurilo.sitepoems.model.User;

/**
 * Service class for {@link by.katekurilo.sitepoems.model.User}
 *
 * @author Kate Kurilo
 * @version 1.0
 */

public interface UserService {

    void save(User user);


    User findByUsername(String username);
}
