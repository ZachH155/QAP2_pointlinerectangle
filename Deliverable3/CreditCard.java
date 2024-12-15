package Deliverable3;

public class CreditCard {
    private Money balance = new Money(0);
    private Money creditLimit = new Money(0);
    private Person owner = new Person(null, null, null);

    //constructor
    public CreditCard(Person newOwner, Money creditLimit) {
        this.owner = newOwner;
        this.creditLimit = creditLimit;
    }

    //getters and setters
    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    public String getPersonals() {
        Address home = owner.getHome();

        return owner.getFirstName() + " " + owner.getLastName() + ", " + home.getStreet() + ", "
        + home.getCity() + ", " + home.getState() + " " + home.getZip();
    }
    
    public void charge(Money amount) {
        if (balance.compareTo(amount) < 0) {
            System.out.println(creditLimit.compareTo(balance));
            if (creditLimit.compareTo(balance) < 0) {
                System.out.println("Exceeds credit limit");
            } else {
                creditLimit = creditLimit.subtract(amount);
                balance = balance.add(amount);
            }
        } else {
            balance = balance.subtract(amount);
        }

        
    }

    public void payment(Money amount) {
        balance = balance.add(amount);
    } 

    @Override
    public String toString() {
        return balance.toString() + ", Limit: " + creditLimit;
    }

}
