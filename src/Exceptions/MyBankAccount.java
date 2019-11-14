package Exceptions;

public class MyBankAccount {

    public void transaction(int amount) throws Exception{

        System.out.println("Your transaction is over the balance");
        throw new Exception("Your transaction is over the balance");
    }

    public void deposit(int amount) throws NullPointerException{
        System.out.println("Your deposit is less than $10");
        throw new NullPointerException("Your deposit is less than $10");
    }

    public void withDraw(int amount)throws RuntimeException{
        System.out.println("You are withDraw more than your balance.");
        throw new RuntimeException("You are withDraw more than your balance.");
    }





}
