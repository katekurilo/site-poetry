package by.katekurilo.sitepoems.dao;

import by.katekurilo.sitepoems.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
