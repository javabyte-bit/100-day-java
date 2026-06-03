public class dynamic_sliding {
    public static void main(String[] args) {
        int arr[]={2,3,1,5,2,3};
        int s=6;
        int min=100;
        int sum;

        for(int i=0;i<arr.length;i++){
                sum=0;              //reset the sum
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum>=s){
                    min=Math.min(min,j-i+1);   //to find the min subarray length 
                    break;
                }
            }
        }

        System.out.println(min);
    }
}
