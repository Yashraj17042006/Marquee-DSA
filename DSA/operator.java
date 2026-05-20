public class operator {
    public static void main(String[] args){
        double d1=99.999;
        int d2=(int)d1;
        System.out.println(d2);
        int a=66;
        char ch=(char) a;
        System.out.println(ch);

        int x=5;
        int y=7;
        int z=8;
        int max=(x>y && a>z)?x:(y>z&& y>x) ?y:z;
        System.out.println(max);
        int age=19;
        System.out.println(age>=18?"Eligible":"non-eligible");

        int num1=45;
        System.out.println(num1++);
        System.out.println(++num1);
        System.out.println(--num1+(num1--));


       // int result=x>y  ?a:y;
        //System.out.println(result >z ? "result":"c");

    }
    public static void output1(){
        int x=5;
        if(x<2)
            System.out.println(x<10 ? "A":"B");
        else
            System.out.println("Outside else");
        System.out.println("Inside else");

    }

}
