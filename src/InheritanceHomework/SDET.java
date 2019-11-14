package InheritanceHomework;

public class SDET extends ScrumTeam{

    @Override
    public void progress() {
        System.out.println("SDET is on progress");
    }

    @Override
    public void work() {
        System.out.println("SDET is working");
    }

    @Override
    public void sprint() {
        System.out.println("SDET is working");
    }

    public SDET(String projectName){
        super(projectName);
    }

    public SDET(String teamName, String projectName){
        this(projectName);
    }

}
