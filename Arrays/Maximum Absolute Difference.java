public class Solution {
    public int maxArr(ArrayList<Integer> a) {
        int maxsum1=Integer.MIN_VALUE;
        int maxsum2=Integer.MIN_VALUE;
        int minsum1=Integer.MAX_VALUE;
        int minsum2=Integer.MAX_VALUE;
        for(int i=0;i<a.size();i++){
            maxsum1=Math.max(maxsum1,a.get(i)+i);
            maxsum2=Math.max(a.get(i)-i,maxsum2);
            minsum1=Math.min(minsum1,a.get(i)+i);
            minsum2=Math.min(minsum2,a.get(i)-i);
            
        }
        int ans=Math.max(maxsum1-minsum1,maxsum2-minsum2);
        return ans;
    }
}
