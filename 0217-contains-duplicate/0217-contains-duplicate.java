class Solution {
    public boolean containsDuplicate(int[] nums) {
        //tc: O(n) sc:O(n)
        Set<Integer> visited = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(visited.contains(nums[i])){
                return true;
            }
            else{
                visited.add(nums[i]);
            }
        }
        return false;
    }
}

/*brute O(n^2) 
  better O(nlogn) : sorting
   */