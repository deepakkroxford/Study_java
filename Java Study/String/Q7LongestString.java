package String;

public class Q7LongestString {
    public static void main(String[] args) {
        String names[] = { "Geek", "Geeks", "Geeksfor","GeeksforGeeks", "GeeksforGeekk" };

        int maxlength =0;
        int index=-1;
        for(int i=0;i<names.length;i++)
        {
            String s = names[i];//0
            if(maxlength<s.length())
            {
                maxlength = s.length();
                index=i;//0,1,2,3,4
            }
        }
        System.out.println(names[index]);

        


    }
}
