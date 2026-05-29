public class second_lar_arr {
    public static void main(String[] args) {
        int arr[]={3,5,1,6,7,8};
        int lar=arr[0];
        int slar=-1;
        for(int i=0;i<=5;i++){// to find the largest element
         
         if(lar<arr[i]){
             lar=arr[i];
             
         }
    }

    for(int i=0;i<=5;i++){// to find the second largest element
        if(arr[i]>slar && arr[i] !=lar){
            slar=arr[i];
        }
    } System.out.println("second largest element of the array is " + slar);
    }
}
