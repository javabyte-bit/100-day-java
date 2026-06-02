public class sliding {
    public static void main(String[] args) {
        int arr[]={2,4,3,1,1,6};
        int k=3;
        int sum=0;
        int max=0;
        int r=k;
        int l=0;
        
        for(int i=0;i<k;i++){
            sum= sum+arr[i];
        }
         max=Math.max(max,sum);

         while (r<arr.length) {
            sum=sum-arr[l]+arr[r];
            max=Math.max(max,sum);
            r++;
            l++;

         }
        System.out.println(sum);
        System.out.println(max);
        
    }
}
