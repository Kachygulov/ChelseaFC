package InheritanceHomework;

public class ScrumMaster extends ScrumTeam {

    @Override
    public void progress() {
        System.out.println("Scrum Master is on progress");
    }

    @Override
    public void work() {
        System.out.println("Scrum master is working");
    }

    @Override
    public void sprint() {
        System.out.println("Scrum master is working");
    }

    public ScrumMaster(String projectName){
        super(projectName);
    }

    public ScrumMaster(String teamName, String projectName){
        this(projectName);
    }

}
