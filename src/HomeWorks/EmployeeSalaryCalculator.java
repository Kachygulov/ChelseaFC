package HomeWorks;

public class EmployeeSalaryCalculator {

    private String name;
    private int employmentYear;
    private int age;
    private int workHour;
    private String location;
    public EmployeeSalaryCalculator(){
    }
    public EmployeeSalaryCalculator(String name,int employmentYear ){
        this.name=name;
        this.employmentYear=employmentYear;
    }
    public EmployeeSalaryCalculator(String name, int employmentYear, int age, int workHour, String location){
        this(name, employmentYear);
        this.age=age;
        this.workHour=workHour;
        this.location=location;

    }
    public int calculateSalary(){
        int calculateSalary=workHour*55;
        return calculateSalary;
    }
    public double yearlySalary(){
        double yearlySalary=calculateSalary()*26;
        return yearlySalary;
    }

}
