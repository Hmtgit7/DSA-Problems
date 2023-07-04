import java.util.HashSet;

public class IntersectionOfTwoArrays{
    public static void main(String[] args){
        int[] nums1=new int[];
        int[]

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        set1.retainAll(set2);
        
        int[] ans = new int[set1.size()];
        int i = 0;
        
        for (int num : set1) {
            ans[i++] = num;
        }
    }
}