package Methods;

public class BankAccount {

  String name;
  String bankName;
  int AccountNumber;
  double balance;
  int expirationYear;


  public void displayInfo(){


      System.out.println(name);
      System.out.println(bankName);
      System.out.println(AccountNumber);
      System.out.println(balance);
      System.out.println(expirationYear);
  }

    public double deposit(int depositAmount){

      balance=balance-depositAmount;
      return balance;
  }


  public double withdraw(int withdrawAmount){

      balance=balance-withdrawAmount;

      return balance;
  }


  public static void main (String[] args){

      BankAccount ba=new BankAccount();

      ba.name="Erkin";
      ba.AccountNumber=23243434;
      ba.bankName="Chase";
      ba.expirationYear=2021;
      ba.balance=10;

      ba.displayInfo();

      ba.deposit(1000);

      ba.displayInfo();


      ba.withdraw(300);

      ba.displayInfo();

  }











}
