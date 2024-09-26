package String;

class answer 
{
    public boolean isVowel(char c)
     {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'i' || c == 'E' || c == 'o' || c == 'I' || c == 'O' || c == 'u'
                || c == 'U') {
            return true;
        }
        return false;
    }

    public char[] reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i<j)
        {
            if(isVowel(ch[i]) && isVowel(ch[j]))
            {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            else if(!isVowel(ch[i]))
            {
                i++;
            }
            else{
                j--;
            }
        }
        return ch;
        
}
}

public class Q10ReverseVowelString {
    public static void main(String[] args) {

        answer ans = new answer();
        
        String input = "leetcode";

        //AceCreIm
        //leotcede
        char[] reversedVowels = ans.reverseVowels(input);
        
        // Convert the char array back to a string and print the result
        String result = new String(reversedVowels);
        System.out.println("Original String: " + input);
        System.out.println("String after reversing vowels: " + result);

    }
}
