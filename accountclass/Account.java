public class Account {
private String id;
private String name;
private int balance;

//the default account
public Account(String id, String name)
{
this.id = id;
this.name = name;
this.balance = 0; //The default balance
}


public Account(String id, String name, int balance)
{
this.id = id;
this.name = name;
this.balance = balance; //The balance, now far less default than before
}

// Get the ID here
public String getID() {
    return id;

}

// Get the name here
public String getName() {
    return name;

}

// And get the balance here
public int getBalance() {
    return balance;

}

//Add amount to balance then return the balance
public int credit(int amount) {
    if (amount > 0) {
        balance += amount;
    }
    return balance;
}
//If amount <= balance, subtract from balance, else print the line, then return balance
public int debit(int amount) {
    if (amount <= balance) {
        balance -= amount;
    } else {
        System.out.println("amount exceeded balance");
    }
    return balance;
}

//Here is where it all comes together
@Override
public String toString() {
    return "ID#: " + this.id + " Name: " + this.name + " Balance: " + this.balance;}

}