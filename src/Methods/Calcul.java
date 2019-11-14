package Methods;

public class Calcul {

    public int sum(int num1, int num2){
        int sum=num1+num2;
        return sum;

    }

   public int substruct(int num1, int num2){

        int substract=num1-num2;
        return substract;
       }

public int multiply(int num1, int num2){
        return num1*num2;
}

public int division(int num1, int num2){
        return num1/num2;

}
public int remainder(int num1, int num2){
        return num1%num2;
}

public int calculator(int num1, int num2, String operator) {
    if (operator.equals("+")) {
        return sum(num1, num2);

    } else if (operator.equals("-")) {
        return substruct(num1, num2);

    } else if (operator.equals("*")) {
        return multiply(num1, num2);

    } else if (operator.equals("/")) {
        return division(num1, num2);

    }else {
        System.out.println("Your operator is invalid");
        return -1;
    }


}}