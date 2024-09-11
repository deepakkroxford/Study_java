package String;

public class Q4Palindrome {
    public static void main(String[] args) {
        String str = "civic";
        int i=0;
        int j = str.length()-1;
        int flag=0;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                flag =1;
                break;
            }
            i++;
            j--;
        }

        if(flag==0)
        {
            System.out.println("the given string {"+str+"} is palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
