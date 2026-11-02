package it.aulab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.aulab.models.Arm;
import it.aulab.models.Jeeg;
import it.aulab.models.Leg;
import it.aulab.models.Side;

@Configuration
public class AppConfig {
    @Bean
    public Jeeg woodenJeeg() {
        
        return new Jeeg(
            "Jeeg di legno",
            new Arm(Side.SX),
            new Arm(Side.DX),
            new Leg(Side.SX),
            new Leg(Side.DX));
        }
        
        @Bean
        public Jeeg steelJeeg() {
            
            return new Jeeg(
                "Jeeg di Ferro",
                new Arm(Side.SX),
                new Arm(Side.DX),
                new Leg(Side.SX),
                new Leg(Side.DX));
            }
            
        }
        