package Function;

public class secondlastDigit {
    public static boolean isEven(int n){
        int secondLastDigit = (n/10)%10;
        return secondLastDigit%2==0;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(isEven(n));
    }
}
