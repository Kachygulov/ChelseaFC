package InterviewTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Collection;

public class ProgrammerTeacher extends Programmer {

    List<String>teacherLanguages=new ArrayList<String>();

    @Override
    public Collection<String> getAllLanguage(){
        return teacherLanguages;

    }

    @Override
    public void addLanguages(String language){
        teacherLanguages.add(language);
    }


    public boolean teach(Programmer programmer,String language){
        for(String teacherL: teacherLanguages){
            if(teacherL==language){
                programmer.addLanguages(language);
                return true;
            }
        }
        return false;
    }





}
