public class dynamic_sliding_optimal {
    public static void main(String[] args) {
        int arr[]={1,2,1,4,2,3};
        int s=7; // to find a len of min sub array whose sum>=7
        int sum=0;
        int l=0;
        int min=100;
        int i;
        for(i=0;i<arr.length;i++){
            sum=sum+arr[i];
        
        while(sum>=s){
            min=Math.min(i-l+1,min);
            sum=sum-arr[l];
            l++;
        }}
        System.out.println(min);
    }
}
