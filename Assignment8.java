import java.util.*;

public class Assignment8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array index at 1="+arr[1]);
    }
}
