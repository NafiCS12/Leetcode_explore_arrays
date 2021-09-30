import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class ArraysRemoval
{

    public static int[] removeDuplicates(int[] nums)
    {
        /*


        int nextUniqueIndex = 1;
        int elem = nums.length;

        for(int i=0; i<elem-1; i++)
        {


            if( i < elem-1 && nums[i] == nums[i+1])
            {
                //System.out.println("for i = " + i + "found duplicate");
                continue;
            }

            //this is a unique number
            nums [nextUniqueIndex] = nums [i+1];
            nextUniqueIndex++;

        }

         */
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        int nextUniqueIndex = 0;
        int totalUniqueNumber = 0;

        for(int i : nums)
        {
            lhs.add(i);
        }
        // O( n )

        totalUniqueNumber = lhs.size();
        for(Integer in : lhs)
        {
            nums[ nextUniqueIndex] = in;

            nextUniqueIndex++;
        }
        // O( n )
        System.out.println("total Unique number : " + totalUniqueNumber );
        return nums;

    }
    public static boolean checkIfExist(int[] arr)
    {
        boolean found = false;
        /*
        int idx = 0;
        for(int c : arr)
        {
            arr[idx] = Math.abs(c);
            idx++;
        }
        Arrays.sort(arr);


        for(int i=0; i < arr.length; i++)
        {
            int M = arr[i];
            for(int j=i+1; j < arr.length; j++)
            {
                int N = arr[j];

                if( N == M*2)
                {
                    System.out.printf("MATCH FOR m is %d and n is %d \n", M, N);
                    found = true;
                    break;
                }
            }
        }
        */
        HashMap<Integer, Integer> doubled = new HashMap<Integer, Integer>(arr.length);

        int totalNumberOfZeroes = 0;
        for(int c : arr)
        {
            if(c == 0 )
            {
                totalNumberOfZeroes++;
                if(totalNumberOfZeroes==2)
                {
                    found = true;
                    System.out.printf("found two zeroes \n");
                    break;
                }
            }

            doubled.put(c, 2*c);
        }

        System.out.println(doubled);

        for(int small : arr)
        {
            Integer half = doubled.get(small);

            System.out.printf("Key is %d and value is %d \n", small, half);

            //see if this half value is stored in map
            if(half != null && half != 0)
            {
                System.out.printf("MATCH FOR m is %d and n is %d \n", half, small);
                found = true;
                break;
            }
        }

        return found;

    }

    public static void duplicateZeros(int[] arr)
    {

        for(int i=0; i<arr.length;i++)
        {
            if(arr[i] == 0)
            {
                for(int j= arr.length-1; j>i; j--)
                {
                    arr[j ] = arr[j-1];
                }
                i++; // for one extra 0 added
            }

        }

        System.out.println("print");
        for (int x : arr)
            System.out.println(x );

    }
    public static void main(String [] args) {
        int[] arr1 = {-2,0,10,-19,4,6,-8};
        int[] arr2 = {1,0,0,12,15,18,4};
        int[] arr3 = {11, 12, 12,12,12,20};
        int[] arr4;
        System.out.println("start");

        //System.out.println(removeDuplicates(arr1));
        duplicateZeros(arr2);
        //boolean ans = (checkIfExist(arr2));

        /*
        System.out.println("print");
        for (int x : arr4)
            System.out.println(x );
         */
        //System.out.println("end ? " + ans);
    }
}
