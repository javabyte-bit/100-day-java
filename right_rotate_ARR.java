public class right_rotate_ARR {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};// right rotate the array by 1
        
        int temp =arr[3];//saving the index of the last element
        
        for(int i=3;i>0;i--){ 
            arr[i]=arr[i-1];
        }
        
        arr[0]=temp;
        
        for(int y=0;y<4;y++){
            System.out.print(arr[y] + " ");
        }
    }
}
