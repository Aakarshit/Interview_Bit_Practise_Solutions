public class Solution {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> a) {
        
        int n=a.size();
        int i=n-1;
        while(i>0 && a.get(i-1)>=a.get(i)){
            i--;
        }
        if(i<=0){
            Collections.reverse(a);
            return a;
        }
        int j=n-1;
        while(a.get(i-1)>=a.get(j)){
            j--;
        }
        swap(a,i-1,j);
        reverse(a,i,n-1);
        return a;
        
        
    }
    public static void reverse(ArrayList<Integer> a,int start,int end){
        while(start<end){
            swap(a,start,end);
            start++;
            end--;
        }
    }
    public static void swap(ArrayList<Integer> a,int i,int j){
        int temp=a.get(i);
        a.set(i,a.get(j));
        a.set(j,temp);
    }
}

