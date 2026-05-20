import java.util.*;
public class ques {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp;
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            System.out.println(a+" ");
            temp=a+b;
            a=b;
            b=temp;
        }
//        int digit=0;
//        int rem;
//        int num=sc.nextInt();
//        int value=num;
//        while(num>0){
//             rem=num%10;
//             digit=digit*10+rem;
//             num/=10;
//        }
//        if(value==digit){
//            System.out.println(value+" is palindrome");
//        }
//        else{
//            System.out.println("It is not a palindrome");
//        }
//        boolean isPrime=true;
//        for(int n1=2;n1<num;n1++){
//            if(n1%num==0){
//                isPrime=false;
//                break;
//
//            }
//
//        }
//        if(isPrime){
//            System.out.println(num+" is prime");
//        }
//        int count=sc.nextInt();
//        int x=1;
//        while(count>0){
//            x*=count;
//            count--;
//        }
//        System.out.println(x);
//        int time=0;
//        int battery =10;
//        while(battery<100){
//            battery+=10;
//            time++;
//        }
//        System.out.println(time);
//        int sum=0;
//        for(int i=1;i<=20;i++){
//            sum+=i;
//        }
//        System.out.println(sum);
//        String user= sc.nextLine();
//        switch (user){
//            case "Admin":
//                System.out.println("Access granted to admin");
//                break;
//            case "student":
//                System.out.println("Access granted to student");
//                break;
//            case "Teacher":
//                System.out.println("Access granted to teacher");
//                break;
//            case "Guest":
//                System.out.println("Access granted to guest");
//                break;
//            default:
//                System.out.println("Access Denied");
//        }
//        int num=sc.nextInt();
//        switch (num){
//            case 1:
//                System.out.println("Jan");
//                break;
//            case 2:
//                System.out.println("Feb");
//                break;
//            case 3:
//                System.out.println("Mar");
//                break;
//            case 4:
//                System.out.println("Apr");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//            case 6:
//                System.out.println("Jun");
//                break;
//            case 7:
//                System.out.println("Jul");
//                break;
//            case 8:
//                System.out.println("Aug");
//                break;
//            case 9:
//                System.out.println("Sep");
//                break;
//            case 10:
//                System.out.println("Oct");
//                break;
//            case 11:
//                System.out.println("Nov");
//                break;
//            case 12:
//               System.out.println("Dec");
//                break;
//            default:
//                System.out.println("Invalid input");
//                break;
//        }
   }
}
