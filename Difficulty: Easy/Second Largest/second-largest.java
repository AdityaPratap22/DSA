class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int first = -1, second = -1;
        
        for(int nums : arr){
            if(nums>first){
                second = first;
                first = nums;
            }
            else if(nums<first && nums>second){
                second = nums;
            }
        }
        return second;
    }
}