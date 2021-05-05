public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
      int top=0;
      int left=0;
      int down=a.size()-1;
      int right=a.get(a.size()-1).size()-1;
      int dir=0;
      while(top<=down && left<=right){
          if(dir==0){
              for(int i=left;i<=right;i++){
                  ans.add(a.get(top).get(i));
              }
              dir=1;
              top++;
          }
          else if(dir==1){
              for(int i=top;i<=down;i++){
                  ans.add(a.get(i).get(right));
              }
              dir=2;
              right--;
          }
          else if(dir==2){
              for(int i=right;i>=left;i--){
                  ans.add(a.get(down).get(i));
              }
              dir=3;
              down--;
          }
          else if(dir==3){
              for(int i=down;i>=top;i--){
                  ans.add(a.get(i).get(left));
              }
              dir=0;
              left++;
          }
      }
      return ans;
    
}}