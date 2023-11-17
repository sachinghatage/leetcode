import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        List<int[]> result = twosum(a);
        if(result!=null){
//            System.out.println(result[0]);
//            System.out.println(result[1]);
           for(int[] pair:result){
               System.out.println("["+pair[0]+","+pair[1]+"]");
           }
        }else{
            System.out.println("no elements found");
        }
    }

    public static List<int[]> twosum(int[] a) {
        int target = 8;
        List<int[]> pairs=new ArrayList<>();
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == target) {
                    pairs.add(new int[] {i,j});
                }
            }
        }
        return pairs;
    }
}
