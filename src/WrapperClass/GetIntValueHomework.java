package WrapperClass;

public class GetIntValueHomework {

    public Integer name(String value){
        String nums="";
        for(char i=0;i<value.length();i++){
            char ch=value.charAt(i);
            if(Character.isDigit(ch)){
                nums+=ch;
            }
        }
        int result=Integer.parseInt(nums);
        return result;
    }
    public static void main(String[] args) {
        GetIntValueHomework hm=new GetIntValueHomework();
        System.out.println(hm.name("09/05/2019-Tech13a"));
        System.out.println(hm.name("74b-DevTeam205s"));
    }

}
