package Solutions;

public class Q2540_MinimumCommonValue {
    public static void main(String[] args) {

        Solution2540 s = new Solution2540();
        int[] nums1 = {1,2,3,6};
        int[] nums2 = {2,3,4,5};
        System.out.println(s.getCommon(nums1, nums2));
        
    }
}

class Solution2540 {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0, j=0;
        int length1=nums1.length;
        int length2= nums2.length;
        // For faster solution
        if (nums1[length1-1] < nums2[0] || nums2[length2-1] < nums1[0])
            return -1;

        // Two pointer approach
        while (i<length1 && j<length2) {
            if (nums1[i] == nums2[j]) return nums1[i];
            else if (nums1[i] > nums2[j]) j++;
            else i++;
        } return -1;
    }
}