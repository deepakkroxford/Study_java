package Arrays;

import java.util.Scanner;

public class Q8FindingtheGivenValue {
    public static void main(String[] args) {
     
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("input");
    for(int i=0;i<size;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("output");
    for(int i=0;i<size;i++){
      System.out.println(arr[i]);
    }
    
    
    System.out.println("enter the value that we have to find");
    int x= sc.nextInt();
    //output index 
    //output not available;

    int flag=0;
    int index=0;
    for(int i=0;i<size;i++)
    {
        if(arr[i]==x)
        {
            index=i;
            flag++;
            break;
        }
    
    }
    if(flag==0)
    {
        System.out.println("not found");
    }
    else{
        System.out.println("element found at ->> "+index);
    }
    
  }
}
    