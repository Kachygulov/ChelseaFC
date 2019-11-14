package InheritanceHomework;

public class Developer extends ScrumTeam {

    @Override
    public void progress() {
        System.out.println("Developer is on progress");
    }
    @Override
    public void work() {
        System.out.println("Developer is working");
    }
    @Override
    public void sprint() {
        System.out.println("Developer is working");
    }
    public Developer(String projectName){
        super(projectName);
    }
    public Developer(String teamName, String projectName){
        this(projectName);
    }
}
