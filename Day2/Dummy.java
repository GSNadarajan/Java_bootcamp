import java.util.Scanner;
public class Dummy
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in)  ;
        int num1,num2,num3;
        num1=s.nextInt();
        num2=s.nextInt();
        num3=s.nextInt();
        int mul=0,i;
        System.out.print(num1);
        System.out.print(" "+num2);
        for(i=0;i<num3;i++)
        {
            mul=num1*num2;
            num2=mul;
            System.out.print(" "+mul);
        }
    }
}