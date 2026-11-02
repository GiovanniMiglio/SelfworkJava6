package it.aulab.dnd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.aulab.dnd.models.Armor;
import it.aulab.dnd.models.CharacterClass;
import it.aulab.dnd.models.Skill;
import it.aulab.dnd.models.Weapon;
import it.aulab.dnd.models.Character;

@Configuration
public class DndConfig {
    @Bean
    public Character assassin() {
        return new Character(
            "Crein",
            CharacterClass.ASSASSIN,
            new Weapon("Pugnale dell'oblio", 15),
            new Armor("Armatura di cuoio del troll", 9),
            new Skill("Backstab", 13, "stun"));
        }
        
        @Bean
        public Character necromancer() {
            return new Character(
                "Derghul",
                CharacterClass.NECROMANCER,
                new Weapon("Staffa di Lucan", 8),
                new Armor("Stracci di seta degl'inferi", 5),
                new Skill("Darkness", 19, "cecita'"));
            }
        }
        