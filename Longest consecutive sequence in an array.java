import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={3, 8, 5, 7, 6};
		int c=1;
		int mc=1;
		Arrays.sort(arr); // {3,5,6,7,8}
		for(int i=1;i<arr.length;i++){
		        if(arr[i]-arr[i-1]==1){
		            c++;
		        }
		        else if(arr[i]-arr[i-1]!=1){
		            c=1;
		        }
		        if(c>mc){
		            mc=c;
		        }
		    }
		System.out.println(mc);
	}
}
