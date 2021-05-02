public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            if(set.contains(i)){
                return i;
            }else{
                set.add(i);
            }
        }
        return -1;
    }
    
}
