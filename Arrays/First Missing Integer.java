public class Solution {
    public int firstMissingPositive(ArrayList<Integer> arr) {
        int n=arr.size();
        for(int i=0;i<n;i++){
            if(arr.get(i)<=0 || arr.get(i)>n){
                arr.set(i,n+1);
            }
        }
        
        for(int i=0;i<arr.size();i++){
            if(Math.abs(arr.get(i)) ==n+1){
                continue;
            }
            int num=Math.abs(arr.get(i));
            if(arr.get(num-1) >0){
                arr.set(num-1,arr.get(num-1)*-1);
            }
        }
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0){
                return i+1;
            }
        }
        return n+1;
        
    }
}

  