package PolymorphismOOP2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class family {

    public static void main(String[] args) {

        human h=new baby();
        h.eat();
        h.shave();
        h.walk();
        ((baby)h).crawl();
        ((dad)h).feed();

        System.out.println("======================");



        men m=new boy();
        m.playSport();
        ((boy)m).cry();
        ((human)m).eat();
        m.humanMethod();

        System.out.println("================================");


        dad d=new baby();
        d.feed();
        ((boy)d).run();


        Collection coll=new ArrayList();
        coll.add(2);
        coll.add(5);
        coll.add(10);

        

















    }
}







