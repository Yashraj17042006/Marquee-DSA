package Function;

public class Binarytodecimal {

    public static int binaryToDecimal(int n){
        int decimal = 0;
        int power = 1;
        while (n>0) {
            int lastDigit = n%10;
            decimal += lastDigit*power;
            power*=2;
            n/=10;
        }
        return decimal;
    }
    public static void main(String[] args) {
        int n = 15;
        System.out.println(binaryToDecimal(n));
    }
}
