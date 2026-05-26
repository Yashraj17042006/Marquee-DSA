package Function;
import java.util.*;
public class sum {
    public static int even(int start,int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int result=even(start,end);
        System.out.println(result);
    }
}
