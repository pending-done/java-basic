package oop1.ex2;

public class Account {

    int balance;

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        
        if (balance >= amount){
            this.balance -= amount;    
        }else{
            System.out.println("출금 불가");
        }
        
    }


}
