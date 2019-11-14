package ConstructorPractice;

import java.util.concurrent.Callable;

public class Company {

    String name;
    String location;
    String area;
    int employeeNumber;
    int budget;

   public Company(){

   }

   public Company(String name,String location,String area){

       this.name=name;
       this.location=location;
       this.area=area;
   }


   public Company(String name,String location,String area,int employeeNumber,int budget){

       this.name=name;
       this.location=location;
       this.area=area;
       this.employeeNumber=employeeNumber;
       this.budget=budget;

   }

   public void displayCompanyInfo(){

       System.out.println("Company name "+name);
       System.out.println("Company location "+location);
       System.out.println("Company are "+area);
       System.out.println("Employee number "+employeeNumber);
       System.out.println("Company budget "+budget);

   }


    public static void main(String[] args) {

        Company company=new Company();

        Company company1=new Company("Zara", "Shaumburg", "Retail");

        System.out.println(company1.name);
        System.out.println(company1.employeeNumber);
        company1.employeeNumber=50;
        System.out.println(company1.employeeNumber);

        Company company2=new Company("Chase","Chicago","Finance",400,20000);

           company2.displayCompanyInfo();

        }

    }




