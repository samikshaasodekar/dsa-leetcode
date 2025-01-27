class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //Sliding window: building your solution upon already calculated values and a hashmap. tc:O(n) sc:O(k)
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i-k]);
            //[0,1,3,4,1,5] k=3 for second slide remove 0 the first number and do everytime as we want speoific in k itself.
            }
        } return false;
    }
}

/* better O(nlogk) by sorting*/