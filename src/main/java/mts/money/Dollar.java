package mts.money;

public class Dollar extends Money {

    Dollar(int amount, String currenry){
        this.amount = amount;
        this.currency= currenry;
    }

    Money times(int multiplier){
        return Money.dollar(amount * multiplier);
    }

}