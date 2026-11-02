package it.aulab.dnd.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.aulab.dnd.repositories.CharacterRepository;

@Service
public class CharacterService {
    @Autowired
    private CharacterRepository characterRepository;
    public void combat(){
        characterRepository.attack();
        characterRepository.defend();
        characterRepository.use();
    }
    
}
