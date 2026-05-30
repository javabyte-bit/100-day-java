public class rotateARRby1 {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,8};
        int temp=arr[0];            //saving the first index
        for(int i=1;i<=4;i++){      // shifting elements by one using for loop
            arr[i-1]=arr[i];
        }
        arr[4]=temp;                //putting arr[0] at the last

        for(int y=0;y<5;y++){
            System.out.print(arr[y] + " ");     //printing the rotate array 
        }
    }
}
