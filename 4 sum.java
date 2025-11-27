import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={4,3,3,4,4,2,1,2,1,1};
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    for(int l=k+1;l<arr.length;l++){
                        if(arr[i]+arr[j]+arr[k]+arr[l]==9){
                        int a=arr[i], b=arr[j], c=arr[k], d=arr[l];
                        int[] t={a,b,c,d};
                        Arrays.sort(t);
                        String key=t[0]+","+t[1]+","+t[2]+","+t[3];
                        if(!set.contains(key)){
                            set.add(key);
                            ArrayList<Integer> quadruplet=new ArrayList<>();
                            quadruplet.add(t[0]);
                            quadruplet.add(t[1]);
                            quadruplet.add(t[2]);
                            quadruplet.add(t[3]);
                            ans.add(quadruplet);
                            }
                        }
                    }
                    
                }
            }
        }
        System.out.println(ans);
    }
}
