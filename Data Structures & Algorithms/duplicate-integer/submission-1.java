class Solution {
    public boolean hasDuplicate(int[] nums) {

        for (int i = 0; i+1 < nums.length; i++) {
  
            if (nums[i] > nums[i+1]) {
                int copy = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = copy;
                for(int j = i; (j-1) >= 0; j--) {

                    if (nums[j] < nums[j - 1]) {
                        int save = nums[j - 1];
                        nums[j - 1] = nums[j];
                        nums[j] = save;
                    }   else {
                        break;
                    }                

                }
            
            }  

        }

                
        for(int i = 0; (i + 1) < nums.length; i++) {

            if (nums[i] == nums[i + 1]) {
                return true;
            }

        }

        return false;
    }
}