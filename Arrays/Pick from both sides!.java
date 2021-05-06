public class Solution {
    public int solve(ArrayList<Integer> a, int b) {
        int n=a.size();
        int sum=0;
        for(int i=0;i<b;i++){
            sum+=a.get(i);
        }
        int maxsum=sum;
        for(int i=b-1,j=n-1;i>-1;i--,j--){
            sum-=a.get(i);
            sum+=a.get(j);
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
       
        
    }
}
