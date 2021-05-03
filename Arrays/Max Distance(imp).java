
class Pair implements Comparable<Pair>{
    int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(Pair p){
        return this.x-p.x;
    }
}
public class Solution {
    
    public int maximumGap(final List<Integer> arr) {
        Pair p[]=new Pair[arr.size()];
        for(int i=0;i<arr.size();i++){
            p[i]=new Pair(arr.get(i),i);
        }
        Arrays.sort(p);
        int ans=0;
        int min=p[0].y;
        for(int i=0;i<arr.size();i++){
            ans=Math.max(p[i].y-min,ans);
            min=Math.min(min,p[i].y);
        }
        return ans;
        
    }
}


