package by.katekurilo.sitepoems.service;

/**
 * Service for Security.
 *
 * @author Kate Kurilo
 * @version 1.0
 */

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
