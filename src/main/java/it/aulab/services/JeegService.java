package it.aulab.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.aulab.repositories.JeegRepository;

@Service 
public class JeegService {
    @Autowired 
    private JeegRepository jeegRepository;
    public void fight(){
    jeegRepository.attack();
    jeegRepository.move();
    }
}
