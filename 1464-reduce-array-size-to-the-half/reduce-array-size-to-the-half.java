class Solution {
    public int minSetSize(int[] arr) {
        int ans=0;
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element :arr){
            map.put(element, map.getOrDefault(element,0)+1);
        }

        int[] count = new int [map.size()];
        int i = 0;
        for(int a :map.keySet()){
            count[i]=map.get(a);
            i++;
        }   
        Arrays.sort(count);

        int eleToRemove=n/2;
        for(int j=count.length-1; j>=0;j--){
            if(eleToRemove <= 0){
                break;
            }
            ans++;
            eleToRemove-=count[j];
        }
        return ans;
    }
}