package it.aulab.dnd.models;

public class Character {
    private String name;
    private CharacterClass characterClass;
    private Weapon weapon;
    private Armor armor;
    private Skill skill;
    public Character(String name, CharacterClass characterClass, Weapon weapon, Armor armor, Skill skill) {
        this.name = name;
        this.characterClass = characterClass;
        this.weapon = weapon;
        this.armor = armor;
        this.skill = skill;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public CharacterClass getCharacterClass() {
        return characterClass;
    }
    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }
    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public Armor getArmor() {
        return armor;
    }
    public void setArmor(Armor armor) {
        this.armor = armor;
    }
    public Skill getSkill() {
        return skill;
    }
    public void setSkill(Skill skill) {
        this.skill = skill;
    }
public void attack(){
    System.out.println(name + " attacca" );
    weapon.attack();
}
public void defend(){
    System.out.println(name + " si difende " );
    armor.defend();
}
public void use(){
    System.out.println(name + " usa la skill ");
    skill.use();
}

}
