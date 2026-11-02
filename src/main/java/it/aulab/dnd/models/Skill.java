package it.aulab.dnd.models;

public class Skill {
    private String name;
    private Integer damage;
    private String effect;
    
    public Skill(String name, Integer damage, String effect) {
        this.name = name;
        this.damage = damage;
        this.effect = effect;
    }
    
    public void use() {
        System.out.println(
            "Usa l'abilita' " + name + " e infligge " + damage + " danni e lo stato " + effect + " al nemico ");
        }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public Integer getDamage() {
            return damage;
        }
        
        public void setDamage(Integer damage) {
            this.damage = damage;
        }
        
        public String getEffect() {
            return effect;
        }
        
        public void setEffect(String effect) {
            this.effect = effect;
        }
    }
    