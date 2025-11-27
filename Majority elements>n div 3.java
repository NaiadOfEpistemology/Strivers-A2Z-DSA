import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={1, 2, 1, 1, 1, 2, 2, 3, 3, 2};
        int n=arr.length/3;
        HashMap<Integer, Integer> map=new HashMap<>();
        ArrayList<Integer> newarr=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>n){
                newarr.add(key);
            }
        }
        for(int i=0;i<newarr.size();i++){
            System.out.print(newarr.get(i)+" ");
        }
    }
}
