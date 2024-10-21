package operator;

public class arothmatic {
    public static void main(String[] args) {
        
     /*
      * Arathmetic operator
      five types of arithmatic operator 

      + addition 
      - subtraction
      * multiplication
      / division
      % modulus


      */

      int a =10;
      int b = 10;

      a=a+20+10;// a= a+a+20
      b+=b+30;
      a=a-b;
      System.out.println(a);
      System.out.println(b);
      //addition 
      int  c =a%b;
      
      //relational operator
      /*
       * < less than 
       * <= less than equal to 
       * > greater than 
       * >= greater than equal to 
       * == equal to 
       * != not equal to 
       */
      // ==  = 
     
       System.out.println(a<b);   //true
       System.out.println(a<=b); //true 
       System.out.println(a==b); //false
       System.out.println(a>b); //fasle
       System.out.println(a>=b); //false
       System.out.println(a!=b);//false

    
      
       
      //System.out.println("subtraction of a and b -> "+c);
    }
}
/*
 * what is java?
 * sol -> java is a object oriented language .
 * Java is a general purpose , compiled, interpretade , static;
 */
