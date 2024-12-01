package TrickyQuestion;

class solve{
    int x=10;

    static void dee(){
        //to access the non static varible in the static mehthod so we have to create a instace of 
        //solve 

        solve s = new solve();
        
        System.out.println(s.x);
    }
}
public class Q2 {
    public static void main(String[] args) {
        solve.dee();
    }
}
