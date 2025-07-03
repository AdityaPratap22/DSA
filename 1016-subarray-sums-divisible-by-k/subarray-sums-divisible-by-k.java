class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      int n = nums.length;
        int count = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        int presum = 0;
        for(int i = 0; i<n; i++){
            presum+=nums[i];
            int mod = presum % k;
            if(mod< 0){
                mod=mod+k;
            }
            if(map.containsKey(mod)){
                count+=map.get(mod);
            }
            map.put(mod, map.getOrDefault(mod,0)+1);
        }
        return count;

    }
}