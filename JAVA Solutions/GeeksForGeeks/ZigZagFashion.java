class Solution{
    static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=arr[i];
    }
    public void zigZag(int a[], int n){
        // Code your solution here. 
        int flag=1;
        for(int i=0;i<n-1; i++){
            if(flag==1){
                if(a[i]>a[i+1]){
                swap(a,i,i+1);
            }
            flag=0;
            }
            else{
                if(a[i]<a[i+1]){
                swap(a,i,i+1);
            }
            flag=1;
            }
        }
        
    }
}