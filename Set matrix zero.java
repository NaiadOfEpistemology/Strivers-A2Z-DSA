import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[][] matrix={{1,1,1},{1,1,0},{1,1,1}};
        int m=3;
        int n=3;
        int[] row=new int[m];
        int[] col=new int[n];
 		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        if(matrix[i][j]==0){
		            row[i]=1;
		            col[j]=1;
		        }
		    }
		}
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        if(row[i]==1||col[j]==1){
                    matrix[i][j]=0;
                }
		    }
		}
		for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
	}
}
