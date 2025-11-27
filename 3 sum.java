import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        int a=arr[i], b=arr[j], c=arr[k];
                        int[] t={a,b,c};
                        Arrays.sort(t);
                        String key=t[0]+","+t[1]+","+t[2];
                        if(!set.contains(key)){
                            set.add(key);
                            ArrayList<Integer> triplet=new ArrayList<>();
                            triplet.add(t[0]);
                            triplet.add(t[1]);
                            triplet.add(t[2]);
                            ans.add(triplet);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
