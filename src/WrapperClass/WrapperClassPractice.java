package WrapperClass;

public class WrapperClassPractice {

    public static void main(String[] args) {

        Byte by=new Byte((byte)12);

        Short sh=new Short((short)20);

        Integer in=new Integer(50);

        Long ln=new Long(56040);

        Double db=new Double(50.9);

        Float fl=new Float(43.89f);

        Boolean bl=new Boolean(true);

        Character ch=new Character('P');


        Byte by1=new Byte("12");

        Short sh1=new Short("44");

        System.out.println(by1);

        System.out.println(sh1);


// THIRD WAY

        Integer num=198;
        Short num1=54;


        int number=55;

        Integer computers=null;

       // number=computers;

        System.out.println(number);


        String values="455";


        int valueInt=Integer.parseInt(values);

        System.out.println(valueInt);



        String convertBl="true";

        boolean convert=Boolean.parseBoolean(convertBl);

        System.out.println(convert);


        String intValue="900";

        int vl=Integer.parseInt(intValue);

        String table="true";

        Boolean tb=Boolean.valueOf(table);

        System.out.println(tb);


        String chair="C";
        Character ch2='C';

        Integer phone=Integer.valueOf("12.50");

        System.out.println(phone);



        int mouse=6;

        Integer mouse1=mouse;

        System.out.println(mouse1);


        


    }
}
