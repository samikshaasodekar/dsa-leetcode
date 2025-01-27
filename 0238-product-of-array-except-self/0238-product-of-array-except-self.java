class Solution {
    public int[] productExceptSelf(int[] nums) {
        //nums = [1,2,3,4] res: [0, 0, 0, 0] ==> [1,1,1,1] ==> [1,1,2,6] ==> [24,12,8,6] prefix and postfix reverse multiply. Tc: O(2n) sc: O(1)
        int[] res = new int[nums.length];
        Arrays.fill(res,1);
        int pre=1, post=1;
        for(int i=0; i<nums.length; i++){
            res[i] = pre;
            pre = nums[i] * pre;
        }
        for(int i=nums.length-1; i>=0; i--){
            res[i] = res[i] * post;
            post = post * nums[i];
        }
        return res;
    }
}

/*You must write an algorithm that runs in O(n) time and without using the division operation.As it would have make it easy like Input: nums = [1,2,3,4] product is 24 and dividing 24 by 1,2,3,4 gives Output: [24,12,8,6]

brute - O(n^2)
better - Input: nums = [1,2,3,4]
         Prefix: [1,1,2,6]
         Postfix: [24,12,4,1] 1 as consider 1 at the end
         Ans(product): [24,12,8,6]
         tc:O(3n) sc:O(n)
   */