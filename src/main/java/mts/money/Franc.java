package mts.money;

public class Franc extends Money {

    Franc(int amount){
        this.amount= amount;
    }

    Franc times(int multiplier){
        return new Franc(amount * multiplier);
    }

    public boolean equals(Object object){
        Franc Franc= (Franc) object;
        return amount == Franc.amount;
    }
}
