public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
        StringBuilder sb=new StringBuilder();
        List<Integer> arr=A;
        Collections.sort(arr, new myComparator());
        if(arr.get(0).intValue()==0) return "0";
        for(Integer i:arr){
            sb.append(Integer.toString(i.intValue()));
        }
        return sb.toString();
    }
}
class myComparator implements Comparator<Integer>{
    
    public int compare(Integer o1,Integer o2){
        return Long.compare(check(o2.intValue(),o1.intValue()),check(o1.intValue(),o2.intValue()));
    }
    public long check(int x,int y){
        return Long.parseLong(String.valueOf(x)+String.valueOf(y));
    }
}

