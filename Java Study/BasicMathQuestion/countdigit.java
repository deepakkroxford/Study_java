package BasicMathQuestion;

public class countdigit {
    public static void main(String[] args) {
        int n = 1322345;

    //optimized 
    int count1 = (int) (Math.log10(n))+1;
    System.out.println("using log base 10 we can also find the number of digit"+count1);


    //2nd way
        int count =0;
        //output = 5;
        while(n!=0)
        {
            int rem = n%10;
          
            n=n/10;
            count++;
        }
        System.out.println(count);

       
       
       

    }
}
