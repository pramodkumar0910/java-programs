public class Week2f{
    public static void main(String[] args){
        int num=3;
        long factorial=1;
        for(int i=1;i<=num;++i)
        {
            factorial*=i;
        }
        System.out.println("factorial of "+num+" = "+factorial);
    }
}