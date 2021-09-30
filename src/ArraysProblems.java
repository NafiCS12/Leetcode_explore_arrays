import java.util.PriorityQueue;
/**
public class ArraysProblems
{

    public static int findNumbers(int[] nums)
    {

        int count = 0;

        for(int n : nums)
        {
            int dig = (int) Math.log10(n)+1;
            //System.out.printf("dig cnt : %d \n", dig);

            if( (dig % 2)==0 )
            {
                count ++;
            }
        }

        return count;
    }
    public static int[] sortedSquares(int[] nums)
    {
        int siz = nums.length;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(siz);

        int[] ret = new int[siz];

        for(int n : nums)
        {
            priorityQueue.add((n*n));
        }
        /// n lgn

        int idx=0;
        while (!priorityQueue.isEmpty())
        {
            Integer in = priorityQueue.poll();

            ret[idx] = in;
            idx++;
        /// n lgn
        return ret;
    }


    public static void main(String [] args)
    {
        int[] arr1 = {-1,1};
        int[] arr2 = {-4,-1,0,3,10};
        int[] arr3 = {-7,-3,2,3,11};
        int[] arr4;


        System.out.println( findNumbers(arr1) );
        System.out.println( findNumbers(arr2) );
        System.out.println( findNumbers(arr3) );
        System.out.println( findNumbers(arr4) );

        arr4 = ( sortedSquares(arr1) );
        for (int a:arr4)
        {
            System.out.println(a);
        }

        arr4 = ( sortedSquares(arr2) );
        for (int a:arr4)
        {
            System.out.println(a);
        }
        arr4 = ( sortedSquares(arr3) );
        for (int a:arr4)
        {
            System.out.println(a);
        }

    }
}
**/