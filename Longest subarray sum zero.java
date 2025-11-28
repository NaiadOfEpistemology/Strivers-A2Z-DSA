import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr={6, -2, 2, -8, 1, 7, 4, -10};
		ArrayList<Integer> newarr=new ArrayList<>();
		int n=8, ml=0;
		for(int i=0;i<arr.length;i++){
		    int sum=0;
		    for(int j=i;j<arr.length;j++){
		        sum+=arr[j];
		        newarr.add(arr[j]);
		        if(sum==0){
		            ml=Math.max(ml,j-i+1);
		        }
		    }
		}
		System.out.println(ml);
		for(int i=0;i<newarr.size();i++){
		    System.out.print(newarr.get(i)+" ");
		}
	}
}
