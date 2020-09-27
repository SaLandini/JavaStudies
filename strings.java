import java.util.Scanner;
public class strings {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        //length
        String s = ler.next();
        System.out.println(s.length());

        //charAt
        s = "Alprazolam";
        System.out.println(s.charAt(0));

        //split
        s = "Alprazolam, Frontal Xr, 2mg";
        String[] split = s.split(",");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //toLowerCase e toUpperCase
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        //Integer.parseInt
        s = "124345";
        int num = Integer.parseInt(s);
        System.out.println(s);
    }
}