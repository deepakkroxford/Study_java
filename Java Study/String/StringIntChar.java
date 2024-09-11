package String;

public class StringIntChar {
    public static void main(String[] args) {
        String str = "abc";
        str = str+"xyz";
        str+='y';
        str+=123;
        System.out.println(str);

        System.out.println("abc"+10+20);
        System.out.println(10+20+"abc");

    }
}
