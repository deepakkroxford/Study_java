package loops;

public class forEachs {
    public static void main(String[] args) {
        int arr[] ={2,34,56,63,21};
        // for(int i =0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]);
        // }


        //for each
        for (int i : arr) {
            System.out.println(i);
        } 

        String names[] = { "Geek", "Geeks", "Geeksfor","GeeksforGeeks", "GeeksforGeekk" };

        for (String i : names) {
            System.out.println(i);
        }
        
    }
}
