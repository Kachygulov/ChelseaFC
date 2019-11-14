package WrapperClass;

public class HwWrapper {

    public void Integer(String str) {
        String nums = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch))
                nums = nums + ch;
        }
        int valueint = Integer.parseInt(nums);
        System.out.println(nums);
    }


    public static void main(String[] args) {
        HwWrapper hw = new HwWrapper();
        hw.Integer("hdhfdjkhdkf8779huhknk56");

    }








}
