class Solution {
    public int[] twoSum(int[] nums, int target) {
        //optimal - tc: O(n) sc: O(n) and val gets stored in key value pair
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i]; 
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}

        /*brute force - O(n^2 )
          Ex : [1,8,15,2,5] traverse
          Target = 13 - 8;
          Remaining = 5;
          [1,4] as 8 and 5 both sum up to 13
          
          better - O(nlogn)
          sort by performing binary search*/