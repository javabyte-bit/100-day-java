public class small_no_arr {
    public static void main(String[] args) {
        int arr[]={4,6,2,8,5};
        int small=arr[0];
        for(int i=0;i<=4;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }System.out.println("smallest number of the array " + small);}
}
