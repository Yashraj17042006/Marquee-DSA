import java.util.Scanner;

public class reversePyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i =n; i>=1; i--) {
            for (int j =i ;j<=n-1; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}


