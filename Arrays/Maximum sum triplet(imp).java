public class Solution {
    public int solve(ArrayList<Integer> a) {
        int n=a.size();
        int suffix[]=new int[n+1];
        suffix[n]=0;
        for(int i=n-1;i>=0;i--){
            suffix[i]=Math.max(a.get(i),suffix[i+1]);
        }
        int ans=0;
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(Integer.MIN_VALUE);
        for(int i=0;i<n-1;i++){
            if(suffix[i+1]>a.get(i)){
                ans=Math.max(ans,set.lower(a.get(i))+a.get(i)+suffix[i+1]);
                set.add(a.get(i));
            }
        }
        return ans;
    }
}
