import java.util.*;
class GenerateTableForNo
{
    public static void main(String[]args)
    {
    int n ,num;
    Scanner sc=new Scanner(System.in);

    System.out.println("enter no");
    n=sc.nextInt();
    for(int i=1;i<=10;i++)
    {
       num=n*i;
    
       System.out.println(num);
    }
    }
}
