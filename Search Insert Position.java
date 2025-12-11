public class Main{
    public static void main(String[] args){
        int[] arr={1,2,4,7};
        int x=6, low=0, high=arr.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(x==arr[mid]){
                System.out.println("Found at index : "+mid);
                return;
            }
            else if(x>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(low);
    }
}
