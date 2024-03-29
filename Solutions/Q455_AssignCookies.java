package Solutions;
import java.util.Arrays;

public class Q455_AssignCookies{
    public static void main(String[] args) {

        Solution455 s = new Solution455();
        int[] k = {10,9,8,7};
        int[] m = {5,6,7,8};
        System.out.println(s.findContentChildren(k,m));
    }
    
}


class Solution455 {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(s);
        Arrays.sort(g);
        
        int content = 0;
        

        for (int i = 0; i < s.length && content < g.length; i++){
            if(s[i] >= g[content]){
                content++;
            }
            
        }
        
        return content;
    }
}