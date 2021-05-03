public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n=a.size();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                //tansposing
                int el=a.get(i).get(j);
                int inverse=a.get(j).get(i);
                a.get(i).set(j,inverse);
                a.get(j).set(i,el);
            }
            Collections.reverse(a.get(i));
        }
    }                                  
}



