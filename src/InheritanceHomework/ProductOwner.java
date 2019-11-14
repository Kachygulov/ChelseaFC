package InheritanceHomework;

public class ProductOwner extends ScrumTeam {

    @Override
    public void progress() {
        System.out.println("Product owner is on progress");
    }

    @Override
    public void work() {
        System.out.println("Product owner is working");
    }

    @Override
    public void sprint() {
        System.out.println("Product owner is working");
    }

    public ProductOwner(String projectName){
        super(projectName);
    }

    public ProductOwner(String teamName, String projectName){
        this(projectName);
    }

}
