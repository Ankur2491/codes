package basePackage;

import java.util.Random;

public class MaxSubarray {
    static int findMaxSubArray(int arr[]){
        int max = 0;
        for(int i=0;i<arr.length-2;i++){
            max = Math.max(max,arr[i]+arr[i+1]+arr[i+2]);
        }
        return max;
    }

    public static void main(String[] args) {
        //int a[] = {1,3,5,7,12,14,2,4,6};
        Random r = new Random();
        int[] a = new int[100];
        for(int i=0;i<100;i++){
            a[i] = r.nextInt();
        }
        long start = System.currentTimeMillis();
        int max = findMaxSubArray(a);
        System.out.println("Maximum: "+max+",Time Taken: "+(System.currentTimeMillis()-start));
    }
}
