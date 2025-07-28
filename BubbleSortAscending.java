public class BubbleSortAscending
{
    public static void main(String[] args) {
        int num[]={12,9,37,86,2,17,5};
        int i,j,t;
        System.out.println("Array before Bubble sort : ");
        for(i=0;i<num.length;i++)
        {
            System.out.print(num[i]+ " ");
        }
        for(i=0;i<num.length-1;i++)
        {
            for(j=0;j<num.length-1-i;j++)
            {
                if(num[j]>num[j+1])
                {
                    t=num[j];
                    num[j]=num[j+1];
                    num[j+1]=t;
                }
            }
        }
        System.out.print("\n\n Array after Bubble sort:\n ");
        for(i=0;i<num.length;i++)
        {
            System.out.println(num[i]+" ");
        }
    }
}