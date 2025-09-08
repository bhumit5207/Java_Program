package Prectice;

// OOPS Concepts: Polymorphism & Encapsulation

// ---------- Encapsulation Example ----------
// Encapsulation = hiding data (private variables) + providing controlled access via getters/setters
class BankAccount {
    // Private variables → data hiding
    private String accountHolder;
    private double balance;

    // Constructor → initialize object
    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter method → allows controlled access to accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter method → allows controlled update to accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter method → allows controlled access to balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money (with validation)
    public void deposit(double amount) {
        if (amount > 0) { // Only positive values allowed
            balance += amount;
            System.out.println(amount + " deposited. New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
}

// ---------- Polymorphism Example ----------
// Polymorphism = one method behaves differently depending on the object

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class overriding sound() → Runtime Polymorphism
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another child class overriding sound()
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// ---------- Main Class ----------
public class Polymorphism_Encapsulation {
    public static void main(String[] args) {
        
        // ===== Encapsulation Demo =====
        System.out.println("=== Encapsulation Demo ===");

        // Creating a bank account object
        BankAccount acc = new BankAccount("Bhumit", 1000);

        // Accessing data using getter methods (not directly accessing private variables)
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Initial Balance: " + acc.getBalance());

        // Deposit money → using controlled method
        acc.deposit(500);  // Valid deposit
        acc.deposit(-100); // Invalid deposit (rejected)

        // Updating account holder name → using setter method
        acc.setAccountHolder("Bhumit Kotadiya");
        System.out.println("Updated Account Holder: " + acc.getAccountHolder());

        // ===== Polymorphism Demo =====
        System.out.println("\n=== Polymorphism Demo ===");

        // Reference of parent class, but object of child class → Runtime Polymorphism
        Animal a;

        a = new Dog();  // Dog object
        a.sound();      // Dog's version of sound() is called

        a = new Cat();  // Cat object
        a.sound();      // Cat's version of sound() is called
    }
}


