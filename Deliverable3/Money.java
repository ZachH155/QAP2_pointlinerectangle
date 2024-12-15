package Deliverable3;

public class Money {
    private double amount = 0;

    //constructors
    public Money(double amount) {
        this.amount = amount;

    }

    public Money(Money otherObject) {
        amount = otherObject.amount;
    }
    

    //methods
    public Money add(Money otherObject) {
        double amount = this.amount + otherObject.amount;

        return new Money(amount);
    }

    public Money subtract(Money otherObject) {
        double amount = this.amount - otherObject.amount;
        return new Money(amount);

    }

    public double compareTo(Money otherObject) {
        double amount = this.amount - otherObject.amount;
        return amount;
    }

    @Override
    public String toString() {
        return "" + amount;
    }
}
