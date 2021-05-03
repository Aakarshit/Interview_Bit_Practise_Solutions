public class Solution {
    public int solve(ArrayList<Integer> arr) {
        if(arr.size()==1){
            return 1;
        }
        int n=arr.size();
        int result=0;
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even+=arr.get(i);
            }else{
                odd+=arr.get(i);
            }
        }
        int keven=0;
        int kodd=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                if((even-(arr.get(i)+keven)+kodd) == ((odd-kodd) +keven)){
                    result++;
                } 
                keven+=arr.get(i);
            }else{
                if((odd-(arr.get(i)+kodd) +keven)== ((even-keven) +kodd)){
                    result++;
                }
                kodd+=arr.get(i);
            }
        }
        return result;
      
    }
}
