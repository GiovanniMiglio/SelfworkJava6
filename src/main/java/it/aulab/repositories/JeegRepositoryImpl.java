package it.aulab.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import it.aulab.models.Jeeg;

@Repository 
public class JeegRepositoryImpl implements JeegRepository{
    @Autowired 
    @Qualifier("steelJeeg")
    private Jeeg jeeg;

    @Override
    public void attack() {
        jeeg.attack();
    }

    @Override
    public void move() {
        jeeg.move();     
    }
    

}
