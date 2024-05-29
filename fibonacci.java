import java.util.*;
class fibonacci
{
    public static void main(String[]args)
    {
    int n ,i=0,j=1,add;
    Scanner sc=new Scanner(System.in);

    System.out.println("enter no");
    n=sc.nextInt();
    while(j+i<n)
    {
        add=i+j;
        i=j;
        j=add;
        
        System.out.println(add);


    }

    }}
