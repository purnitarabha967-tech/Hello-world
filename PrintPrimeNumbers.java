import java.util.Scanner;
public class PrintPrimeNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int n=sc.nextInt();
        System.out.println("The prime numbers upto " + n + " range are:");
        for(int i=1;i<=n;i++){
            int c==0;
            for(int j=1;j<=i;j++){
                if(i%j==0)
                c++;
            }
            if(c==2)
            System.out.println(i);
        }
    }

}
