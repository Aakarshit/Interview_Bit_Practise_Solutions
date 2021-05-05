public class Solution {
    public ArrayList<Integer> flip(String str) {
       int sum=0,max=0,temp_start=0,end=0,start=0;
       int arr[]=new int[str.length()];
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='1'){
               arr[i]=-1;
           }else{
               arr[i]=1;
           }
       }
       boolean flag=false;
       for(int i=0;i<arr.length;i++){
           if(sum+arr[i]<0){
               sum=0;
               temp_start=i+1;
           }else{
               sum+=arr[i];
           }
           
           if(sum>max){
               max=sum;
               flag=true;
               start=temp_start;
               end=i;
           }
       }
       ArrayList<Integer> ans=new ArrayList<Integer>();
       if(flag){
           ans.add(start+1);
           ans.add(end+1);
           return ans;
       }else{
           return ans;
       }
    }
}
