package LeetCodeJune;
public class SortColors {
    public void sortColors(int[] nums) {
        int start = 0; //starting of the array 
	int end = nums.length-1; // end of the array
	int index = 0; // current index for the array
	while(index<=end){
	    if(nums[index]==0){
		    nums[index] = nums[start]; 
		    nums[start++] = 0;
		}
		else if(nums[index]==2){
		    nums[index] = nums[end];
		    nums[end--] = 2;
		    continue;
            }
	index++;
	}
    }
}
