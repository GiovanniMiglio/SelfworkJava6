package it.aulab.models;

public class Leg {
private Side side;

public Leg(Side side) {
    this.side = side;
}

public Side getSide() {
    return side;
}

public void setSide(Side side) {
    this.side = side;
}
public void move (){
    if (this.side == Side.SX) {
        System.out.println("Mi sposto indietro!");
        
    } else {
        System.out.println("Mi sposto in avanti!");
    }
}
}
