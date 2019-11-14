package Exceptions;

public class CreditCardAccount  extends MyBankAccount {

    @Override
    public void transaction(int amount) throws Exception {
        System.out.println("Your crossing credit card limit ");
        throw new Exception("Your crossing credit card limit ");
    }

    @Override
    public void deposit(int amount)throws NullPointerException{
        System.out.println("Paying off my balance .");
    }

    @Override
    public void withDraw(int amount)throws RuntimeException{
        System.out.println("I am withdrawing money.");


    }


}
