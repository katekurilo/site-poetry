package by.katekurilo.sitepoems.dao;

import by.katekurilo.sitepoems.model.Poem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoemDao extends JpaRepository<Poem, Long> {
    Poem findByName (String name);
}
