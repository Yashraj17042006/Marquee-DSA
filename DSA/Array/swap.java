package Array;

import java.util.Scanner;

public class swap {
    public static void swap(int[]arr,int i,int j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] arr={1,2,3};
        swap(arr,1,2);
        System.out.println(arr[1]+" "+ arr[2]);
    }
}
