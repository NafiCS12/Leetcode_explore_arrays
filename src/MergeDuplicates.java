import java.util.PriorityQueue;

public class MergeDuplicates
{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if(n==0) {return;}
        if(m==0)
        {
            for(int i=0;i<n;i++)
            {
                nums1[i]=nums2[i];
            }
        }
        else
        {
            PriorityQueue priorityQueue = new PriorityQueue();
            int firstLoaded = 0;
            for(int e : nums1)
            {
                priorityQueue.add(e);
                firstLoaded++;
                if(firstLoaded==m){break;}
            }
            for(int f : nums2)
            {
                priorityQueue.add(f);
            }
            /// n lgn

            int idx=0;
            while (!priorityQueue.isEmpty())
            {
                int q = (int) priorityQueue.poll();
                //System.out.println(q);
                nums1[idx] = q;
                idx++;
            }
            System.out.println("print");
            for (int x : nums1)
                System.out.println(x );


        }
    }
    public static boolean validMountainArray(int[] arr)
    {
        int left = 0;

        int right = arr.length-1;

        while(left < (arr.length-1) && arr[left] < arr[left + 1])
        {
            left++;
        }


        while(right > (0) && arr[right] < arr[right - 1])
        {
            right--;
        }

        if(left>0 && left==right && right< arr.length-1)
        {
            return true;
        }

        return false;
    }
    public static void main(String [] args) {
        int[] arr1 = {0,3,4,5,6,3,1};
        int[] arr2 = {0,3,4,4,3,5,2};
        int[] arr3 = {11, 12, 12, 12, 12, 20};
        int[] arr4;
        System.out.println("start");

        int n = arr2.length;

        int m = arr1.length;
        //System.out.println(removeDuplicates(arr1));
        //merge(arr1, m, arr2, n);
        System.out.println(validMountainArray(arr1) );
        System.out.println(validMountainArray(arr2) );

    }

    }
