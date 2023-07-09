import java.util.ArrayList;

public class SubArrayWithSum {
    public static void main(String[] args) {
        int[] arr= {1,2,3,5,7};
        ArrayList<Integer> list =new ArrayList<>();
        int n=arr.length;
        int s=12;
        int r=0;
        int l=0;
        int sum=arr[0];
        boolean isFound=false;
        while(r<n){
            if(sum==s){
                isFound=true;
            }
            else if(sum<s) {
                r++;
                if(r<n) sum+=arr[r];
            }
            else{
                sum-=arr[l];
                l++;
            }
        }
        if(isFound){
            list.add(l+1);
            list.add(r+1);
            return list;
        }
        list.add(-1);
        return list;
        
    }
}
