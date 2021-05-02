public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> arr) {
        int count=0;
        
        
        
        ArrayList<Integer> a=new ArrayList<Integer>();
        
        
        if(arr.size()==1 && arr.get(0)==0){
            a.add(1);
            return a;
        }
        
        int p=0;
        for( ;p<arr.size();p++){
            if(arr.get(p)==0){
                count++;
            }else{
                break;
            }
        }
        for(;p<arr.size();p++){
            a.add(arr.get(p));
        }
       
        
        int size=a.size();
        
        for(int i=size-1;i>=0;i--){
            if(a.get(i)==9){
                int j=i;
                while(a.get(j)==9 && j>0){
                    a.set(j,0);
                    j--;
                }
                if(a.get(j)+1 == 10 ){
                    a.set(0,1);
                    for(int k=1;k<size;k++){
                        a.set(k,0);
                    }
                    a.add(0);
                    
                }else{
                
                  a.set(j,a.get(j)+1);
                    
                }
                break;
            }else{
                a.set(i,a.get(i)+1);
                break;
            }
        }
        return a;
    }
}
