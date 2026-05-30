package Array;

import java.util.Scanner;

public class sumArray {
    public static int[] sumarray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] result = new int[n + 1];

        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int sum = arr1[i] + arr2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }

        result[0] = carry;

        return result;
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int [] arr1=new int[n];
    int [] arr2=new int[n];
    int[] sumResult = sumarray(arr1, arr2);
    System.out.println(sumResult);

}

}
