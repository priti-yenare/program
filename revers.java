import java. util. Scanner;
class revers
{
    public static void main(String[]args)
    {
        int n,rev;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no you want to revers");
        n=sc.nextInt();
        while(n>0)
        {
            rev=n%10;
            System.out .print(rev);
            n=n/10;
        }

    }
}
