public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> arr) {
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i+=2){
            int temp=arr.get(i);
        arr.set(i,arr.get(i+1));
        arr.set(i+1,temp);
        }
        return arr;
    }
   
}
