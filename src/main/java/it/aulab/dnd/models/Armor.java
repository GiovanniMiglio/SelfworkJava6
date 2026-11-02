package it.aulab.dnd.models;

public class Armor {
    private String name;
    private Integer defense;

    public Armor(String name, Integer defense) {
        this.name = name;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDefense() {
        return defense;
    }

    public void setDefense(Integer defense) {
        this.defense = defense;
    }

    public void defend() {
        System.out.println("Si protegge con " + name + " e para " + defense + " danni!");
    }
}
