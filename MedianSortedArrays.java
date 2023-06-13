class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	//If either array is empty, then return the median of the other array.
        if(nums2.length == 0) {
            return (nums1[nums1.length / 2] + nums1[(nums1.length - 1) / 2]) / 2.0;
        }
        else if(nums1.length == 0) {
            return (nums2[nums2.length / 2] + nums2[(nums2.length - 1) / 2]) / 2.0;
        }
        int i1 = 0; //Keeps track of index of nums1
        int i2 = 0; //Keeps track of index of nums2

        int[] both = new int[nums1.length + nums2.length]; //This array will be a sorted array of elements from both arrays
	
        for(int i = 0; i < both.length; i++) {

	    //If nums1 has been entirely traced or if element at i2 is less than element at i1
            //insert element at i2 in the merged array
            if(i1 >= nums1.length || (i2 < nums2.length && nums2[i2] < nums1[i1])) {
                both[i] = nums2[i2];
                i2++;
            }
	    //Otherwise, insert element at i1 in merged array
            else {
                both[i] = nums1[i1];
                i1++;
            }

        }
	//Return the median of the merged array
        return (both[both.length / 2] + both[(both.length - 1) / 2]) / 2.0;
    }
}