import java.util.ArrayList;


public class divisior {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n =10;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                ans.add(i);
            }
        }
        System.out.println(ans);
    }
}
