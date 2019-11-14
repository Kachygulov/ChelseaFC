package ConstructorPractice;

public class Computer {

   private String name;
   private String operatingSystem;
   private String brand;
   private String model;
   private int year;
   private int memory;
   private int inch;

public Computer(){

}

    public Computer(String name,String operatingSystem,String brand,String model){
        this.name=name;
        this.operatingSystem=operatingSystem;
        this.brand=brand;
        this.model=model;

    }

    public Computer(int sYear,int sMemory,int sInch){
        year=sYear;
        memory=sMemory;
        inch=sInch;


    }

    public Computer(String name,String operatingSystem,String brand,String model,int year,int memory,int inch){

        this(name,operatingSystem,brand,model);
        this.year=year;
        this.memory=memory;
        this.inch=inch;
    }

    public String getName(){

    return name;

    }

    public String getOperatingSystem(){

    return operatingSystem;

    }

    public String getBrand(){

    return brand;

    }

    public String getModel(){

    return model;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}






