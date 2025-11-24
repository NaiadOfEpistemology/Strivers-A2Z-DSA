public class Main
{
	public static void main(String[] args) {
		int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
		int n=mat.length;
		for(int i=0;i<mat.length;i++){
		    for(int j=i+1;j<mat.length;j++){
		        int temp=mat[i][j];
		        mat[i][j]=mat[j][i];
		        mat[j][i]=temp;
		    }
		}
		for(int i=0;i<mat.length;i++){
		    int l=0, r=n-1;
		    while(l<r){
		        int temp=mat[i][l];
		        mat[i][l]=mat[i][r];
		        mat[i][r]=temp;
		        l++;
		        r--;
		    }
		}
		for(int i=0;i<mat.length;i++){
		    for(int j=0;j<mat.length;j++){
		        System.out.print(mat[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
