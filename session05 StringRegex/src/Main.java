import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) {
        // String
        String string = "khanh ta";
        String string1 = "khanh ta";
        // khoi tao doi tuong
        String str = new String("khanh ta");
        System.out.println(string);
        System.out.println(str);
        // goi pthuc string
        String newstring = changeString(string);
        System.out.println("chuoi cu :" + string);
        System.out.println("chuoi moi :" + newstring);
        System.out.println("so sanh chuoi " + (string.equals(string1)));
    }
    public static String changeString(String oldStr) {
        oldStr = "new" + oldStr;
        return oldStr;
    }
}