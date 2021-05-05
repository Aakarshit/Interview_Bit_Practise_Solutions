public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> a) {
        if(a.size()<=1 || a==null){
            return 0;
        }
       int max=Collections.max(a);
       int min=Collections.min(a);
       int n=a.size();
       int buckets=n-1;
       int gap=(max-min-1)/(n-1) + 1;
        //System.out.println(gap);
       int minArray[]=new int[buckets];
       int maxArray[]=new int[buckets];
       int bucket;
       Arrays.fill(minArray,Integer.MAX_VALUE);
       Arrays.fill(maxArray,Integer.MIN_VALUE);
       for(int i=0;i<n;i++){
           int num=a.get(i);
           if(num==max || num==min){
               continue;
           }
           bucket=(num-min)/gap;
           //System.out.println(bucket);
           minArray[bucket]=Math.min(minArray[bucket],num);
           maxArray[bucket]=Math.max(maxArray[bucket],num);
       }
       int res=0;
       int maxVal=max;
       for(int i=0;i<buckets;i++){
           max=minArray[i];
           if(max!=Integer.MAX_VALUE){
               res=Math.max(res,max-min);
           }
           if(maxArray[i]!=Integer.MIN_VALUE){
               min=maxArray[i];
           }
       }
        res=Math.max(res,maxVal-min);
        return res;
    }
    
}
 