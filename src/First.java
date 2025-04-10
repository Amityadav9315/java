import java.util.Scanner;

public class First {


    static  void  secondLargest(int n,int arr[]){
        int max=0;
        int max1=0;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                max=arr[i];
            }


        }
        for(int i=0; i<n; i++){
            if(arr[i]>max1&&arr[i]!=max){
                max1=arr[i];
            }
        }
        System.out.println(max1);
        System.out.println();



    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]  arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        secondLargest(n,arr);


    }
}
