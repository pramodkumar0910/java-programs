import java.util.Scanner;
public class BinarySearchAscending
{
    public static void main(String[] args) {
        int num[]={2,5,9,12,17,37,86};
        int i,x,f,S,E,M;
        Scanner sc=new Scanner(System.in);
        System.out.print("array: ");
        for(i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
        System.out.print("\n\nEnter number to search: ");
        x=sc.nextInt();
        f=0;
        S=0;
        E=num.length-1;
        while(S<=E)
        {
            M=(S+E)/2;
            if(x==num[M])
            {
                System.out.print("number found at index:"+M);
                f=1;
                break;
            }
            else if(x>num[M])
            {
               S=M+1;
            }
            else if(x<num[M])
            {
                E=M-1;
            }
        }
        if(f==0)
        {
            System.out.print("number not found");
        }
    }
}