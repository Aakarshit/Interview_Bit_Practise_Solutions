public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> a) {
        Stack<Integer> stack=new Stack<Integer>();
        ArrayList<Integer> ans=new ArrayList<>();
        stack.push(a.get(a.size()-1));
        for(int i=a.size()-2;i>=0;i--){
            if(a.get(i)>stack.peek()){
                stack.push(a.get(i));
            }
        }
        while(!stack.isEmpty()){
            ans.add(stack.pop());
        }
        Collections.reverse(ans);
        return ans;
    }
}
