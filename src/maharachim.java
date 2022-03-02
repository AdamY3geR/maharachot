import java.util.Scanner;

public class maharachim
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1,num2=0;
        System.out.println("How much products have you ordered");
        num1 = input.nextInt();
        int [] a;
        a=new int[num1];
        for (int i=0; i< a.length;i++)
        {
            System.out.println("how much the product costs?");
            a[i]= input.nextInt();
            num2=num2+a[i];
        }
        tf(num2);
    }
    public static void tf (int a)
    {
        if (a >= 150)
            System.out.println("false");
        else
            System.out.println("true");
    }
}