

public class Week2h{
    public static void main(String[] args) {
        int n=4,firstTerm=0,secondTerm=1;
        System.out.print("Fibonacci series till "+n+" terms:\n");
        for (int i = 1; i <=n ; ++i) {
            System.out.println(firstTerm+",");
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
}