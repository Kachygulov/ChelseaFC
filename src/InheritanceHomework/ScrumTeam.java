package InheritanceHomework;

public class ScrumTeam {

    String teamName, projectName;

    public ScrumTeam(){

    }

    public ScrumTeam(String projectName){
        this.projectName=projectName;
    }

    public ScrumTeam(String teamName, String projectName){
        this.teamName=teamName;
        this.projectName=projectName;
    }

    public void progress(){
        System.out.println("Scrum team in progress");
    }

    public void work(){
        System.out.println("Scrum team is working");
    }

    public void sprint(){
        System.out.println("Scrum team on sprint");
    }

}
