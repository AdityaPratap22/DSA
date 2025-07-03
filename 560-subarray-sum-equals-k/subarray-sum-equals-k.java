class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        int presum = 0;
        for(int i = 0; i<n; i++){
            presum+=nums[i];

            if(map.containsKey(presum-k)){
                count+=map.get(presum-k);
            }
            map.put(presum, map.getOrDefault(presum,0)+1);
        }
        return count;
    }
}