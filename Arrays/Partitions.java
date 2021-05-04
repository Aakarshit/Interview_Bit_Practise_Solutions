public class Solution {
    public int solve(int n, ArrayList<Integer> a) {
        int count=0;
        int sum1=0;
        int sum2=0;
         int total=0;
        for(int i:a){
            total+=i;
        }
        if(total%3!=0){
            return 0;
        }
       int divsum=total/3;
       
        for(int i=0;i<a.size();i++){
            sum1+=a.get(i);
            sum2=Integer.MIN_VALUE;
            boolean sumcheck=false;
            for(int j=i+1;j<a.size()-1;j++){
               if(sum1==divsum && sumcheck==false){
                   sum2=0;
                   sumcheck=true;
               }
               if(sumcheck){
                   sum2+=a.get(j);
               }
               if(divsum == total-(sum1+sum2)){
                   count++;
               }
            }
        }
        return count;
        
    }
}