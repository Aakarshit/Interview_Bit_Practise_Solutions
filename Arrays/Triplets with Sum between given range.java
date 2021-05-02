public class Solution {
    public int solve(ArrayList<String> arr) {
        double sum=0;
       ArrayList<Double> pq = new ArrayList<Double>();
        for(String s:arr){
            double val=Double.parseDouble(s);
            if(pq.size()<3){
                pq.add(val);
                sum+=val;
            }else if(pq.size()==3 && sum>2 && pq.get(2)>val){
                sum-=pq.get(2);
                pq.remove(2);
                pq.add(val);
                sum+=val;
            }else if(pq.size()==3 && sum<1 && val>pq.get(0)){
                sum-=pq.get(0);
                pq.remove(0);
                pq.add(val);
                sum+=val;
            }
            Collections.sort(pq);
            
            if(sum<2 && sum>1 && pq.size()==3){
                return 1;
            }
        }
        if(sum<2 && sum>1 && pq.size()==3){
                return 1;
            }
            
            
            return 0;
    }
}
