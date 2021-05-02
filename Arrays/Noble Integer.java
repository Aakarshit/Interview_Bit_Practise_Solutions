public class Solution {
    public int solve(ArrayList<Integer> arr) {
        
        Collections.sort(arr);
        if(arr.get(arr.size()-1)==0){
            return 1;
        }
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)!=arr.get(i+1)){
                if(arr.get(i)== arr.size()-i-1){
                    return 1;
                }
            }
        }
        return -1;
    }
}
