package by.katekurilo.sitepoems.service;

import by.katekurilo.sitepoems.model.Poem;

import java.util.List;

/**
 * Created by user on 20.02.2017.
 */
public interface PoemService {
    void save(Poem poem);

    List <Poem> findAll();

    Poem findByName (String name);
}
