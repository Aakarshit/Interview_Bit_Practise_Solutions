public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> a) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        int l=-1,r=-1;
        int n=a.size();
        int min[]=new int[n];
        int max[]=new int[n];
        max[0]=a.get(0);
        min[n-1]=a.get(n-1);
        int i=1,j=n-2;
        while(i<n && j>=0){
            max[i]=Math.max(max[i-1],a.get(i));
            min[j]=Math.min(min[j+1],a.get(j));
            i++;
            j--;
        }
        int k=0;
        for(;k<n;k++){
            if(a.get(k)!=min[k]){
                l=k;
                break;
            }
        }
        if(k==n){
            ans.add(-1);
            return ans;
        }
        for(k=n-1;k>=0;k--){
            if(a.get(k)!=max[k]){
                r=k;
                break;
            }
        }
        ans.add(l);
        ans.add(r);
        return ans;
    }
}
