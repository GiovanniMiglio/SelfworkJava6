package it.aulab.models;

public class Arm {
public Arm(Side side) {
        this.side = side;
    }

private Side side;

public Side getSide() {
    return side;
}

public void setSide(Side side) {
    this.side = side;
}
public void attack(){
    System.out.println("Attacca con il braccio " + this.side);
}
}
