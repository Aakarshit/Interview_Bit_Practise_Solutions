public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int a) {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        int arr[][]=new int[a][a];
        int t=0,b=a-1,l=0,r=a-1,d=0,count=1;
        while(l<=r && t<=b){
            if(d==0){
                for(int i=l;i<=r;i++){
                    arr[t][i]=count;
                    count++;
                }
                t++;
                d=1;
            }else if(d==1){
                for(int i=t;i<=b;i++){
                    arr[i][b]=count;
                    count++;
                }
                d=2;
                r--;
            }else if(d==2){
                for(int i=r;i>=l;i--){
                    arr[b][i]=count;
                    count++;
                }
                d=3;
                b--;
            }else if(d==3){
                for(int i=b;i>=t;i--){
                    arr[i][l]=count;
                    count++;
                }
                d=0;
                l++;
            }
        }
        for(int i=0;i<a;i++){
            ArrayList<Integer> temp=new ArrayList<Integer>();
            for(int j=0;j<a;j++){
                temp.add(arr[i][j]);
            }
            ans.add(temp);
        }
        return ans;
    }
}

