public class Solution {
   
    public ArrayList<Integer> findPerm(final String str, int a) {
        int low=1;
        ArrayList<Integer> ans=new ArrayList<>();
        int high=a;
        for(int i=0;i<a-1;i++){
            if(str.charAt(i)=='I'){
                ans.add(low);
                low++;
            }
            if(str.charAt(i)=='D'){
                ans.add(high);
                high--;
            }
        }
        ans.add(low);
        return ans;
        
    }
}
