public class Solution {
    public boolean hotel(ArrayList<Integer> arr, ArrayList<Integer> dep, int a) {
         Collections.sort(arr);
        Collections.sort(dep);
        
        for(int i=0;i<arr.size();i++){
            if(i+a <arr.size() && arr.get(i+a)<dep.get(i)){
                return false;
            }
        }
        return true;
                     
                     
        
    }
}
