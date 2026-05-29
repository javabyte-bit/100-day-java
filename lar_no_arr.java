public class lar_no_arr{
    public static void main(String[] args) {
        
        int arr[]={2,4,1,5,0};
        int lar=arr[0];
        for(int i=0;i<=4;i++){
         
         if(lar<arr[i]){
             lar=arr[i];
             
         }
    }System.out.println("largest number/element in the array " + lar);
}
}
    