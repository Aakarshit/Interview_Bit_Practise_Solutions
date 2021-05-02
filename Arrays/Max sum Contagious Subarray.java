public class Solution {
    public int maxSubArray(final List<Integer> arr) {
        int max=Integer.MIN_VALUE,ans;
        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
             max=Math.max(sum,max);
            if(sum<=0){
                sum=0;
            }
           
        }
        return max;
    }
}
