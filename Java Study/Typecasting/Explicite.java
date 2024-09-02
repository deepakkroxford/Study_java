package Typecasting;

public class Explicite {
    public static void main(String[] args) {
        int a = 257;
        byte b = (byte)a;
        System.out.println(b);

        int c = 12;
        // byte y = c; // not work we can not assing integer to byte;
        byte y = (byte)c;
        System.out.println(y);

        float f = 6.9f;
        int j = (int)f;
        System.out.println(j); // we loss the data of 0.6

        //type promotion

        byte d = 12;
        byte g  = 12;
        int res = d*g;
        System.out.println(res);


      
        





    }
}
