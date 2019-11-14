package Encapsulation;

public class HR {

    public static void main(String[] args) {

        Employee employee=new Employee();
        employee.setFirstName("John");
        employee.setLastName("DOE");
        employee.setAge(25);
        employee.setEmployeeID("A23444");
        employee.setSSN(12345677);
        employee.setGender('M');
        employee.setSalary(120000);
        System.out.println(employee.getAge());
    }
}
