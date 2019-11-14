package Variables;

public class Salary {

    public static void main(String[] args) {
        int payPerHour=60;
        int payPerDay=payPerHour*8;
        int payPerWeek=payPerDay*5;
        double annualSalary=payPerWeek*52;
        System.out.println("Annual salary of engeneer is $"+annualSalary);

        double stateTax=annualSalary*8/100d;
        double federalTax=annualSalary*11/100d;

        System.out.println("Ingeneer's payment for state tax is $"+stateTax);
        System.out.println("Ingeneer's payment for federal tax is $"+federalTax);

        double totalTaxAmount=stateTax+federalTax;
        System.out.println("Ingeneer's total payment for tax is $"+totalTaxAmount);

        double base=10;
        double height=12;
        double area=base*height/2;
        System.out.println("area of triangle is "+area);


    }


}
