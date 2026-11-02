package it.aulab.dnd.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import it.aulab.dnd.models.Character;

@Repository

public class CharacterRepositoryImpl implements CharacterRepository {
    @Autowired
    @Qualifier("assassin")
    private Character character;

    @Override
    public void attack() {
        character.attack();

    }

    @Override
    public void defend() {
        character.defend();
    }

    @Override
    public void use() {
        character.use();
    }

    

}
