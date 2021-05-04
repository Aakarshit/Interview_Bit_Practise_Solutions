public class Solution {
    public int pascal(int n,int r){
        if(n==0||r==0||n==r){
            return 1;
        }
        return pascal(n-1,r-1)+pascal(n-1,r);
    }
    public ArrayList<Integer> getRow(int a) {
        ArrayList<Integer> al=new ArrayList<>();
          for(int i=0;i<=a;i++){
              al.add(pascal(a,i));
              
          }
          return al;
    }
}
