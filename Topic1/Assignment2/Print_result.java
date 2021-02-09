public class Print_result {
    public static void main(String args[])
    {
        int result1;
        double  result2,result3,result4;;
        int a=-5,b=8,c=6,d=55,e=9,f=20,g=-3,h=5,i=15,j=3,k=2,l=8;
        result1=a+b*c;
        result2=(d+e)%e;
        result3=f+g*h/b;
        result4=h+i/j*k-b%j;

        System.out.println("-5 + 8 * 6 = "+result1);
        System.out.println("(55+9) % 9 = "+result2);
        System.out.println("20 + -3*5 / 8 = "+result3);
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 = "+result4);

    }
}
