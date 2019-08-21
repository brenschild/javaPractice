package practiceconcepts;

/**
 *
 * @author Brennan
 */
public class Arrays {
    
    
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int total = nums1.length + nums2.length;
       double median = 0;
       System.out.println(total);
       
       
       
       // if even
       if(total % 2 == 0)
       {
           int targetA = (int)Math.ceil(total/2) - 1;
           int targetB = targetA + 1;
           System.out.println("nums1 length:" + nums1.length + "\nnums2 length:" + nums2.length);
           System.out.println(targetA + " - " + targetB);
           // if both in first array
           if(targetB < nums1.length)
           {
               System.out.println("left side");
               median = (nums1[targetA] + nums1[targetB])/2;
           }
           
           // if seperated
           else if(targetA < nums1.length && targetB >= nums1.length)
           {
               System.out.println("seperated");
               median = (nums1[targetA] + nums2[nums1.length - targetB]) /2.0;
           }
           
           // if both in second array
           else if(targetA >= nums1.length)
           {
               System.out.println("right side");
               targetA = nums1.length - targetA;
               targetB = nums1.length - targetB;
               median = (nums2[targetA] + nums2[targetB])/2.0;
           }
       }
       // else odd
       else
       {
           // find number in position Ceiling (total / 2)
           int target = (int)Math.ceil(total/2) - 1;
           
            median =  (target < nums1.length-1) ? median = nums1[target] : nums2[(target - nums1.length-1)];
           
       }
       
       System.out.println(median);
       return median;
    }
}
