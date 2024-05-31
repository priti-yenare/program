public class CheckPerfectNo {
    public static void main(String[] args) {
        int n=29;
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }

        }
        if(sum==n)
        {
            System.out.println("given no is perfect no:");
        }
        else{
            System.out.println("given no is not perfect no:");  
        }
    }
    
}
