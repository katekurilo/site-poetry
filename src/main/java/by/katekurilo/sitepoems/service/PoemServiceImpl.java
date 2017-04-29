package by.katekurilo.sitepoems.service;

import by.katekurilo.sitepoems.dao.PoemDao;
import by.katekurilo.sitepoems.model.Poem;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by user on 20.02.2017.
 */
@Service
public class PoemServiceImpl implements PoemService {

    @Autowired
    private PoemDao poemDao;


    @Override
    public void save(Poem poem) {
        poemDao.save(poem);
    }

    @Override
    public List<Poem> findAll() {
        return Lists.newArrayList(poemDao.findAll());
    }

    @Override
    public Poem findByName(String name) {
        return poemDao.findByName(name);
    }
}
