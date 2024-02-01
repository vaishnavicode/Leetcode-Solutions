package Q_1239_Maximum_Unique_Length;

import java.util.List;

public class MaximumUniqueLength {
    public static void main(String[] args) {

        Solution1239 s = new Solution1239();
        List<String> arr = List.of("un","iq","ue");
        System.out.println(s.maxLength(arr));
        
    } 
}

class Solution1239 {

    public int solve(String strs[], int no, int a[], int index, int c) {
        if(index==c)
            return 0;
        int x=no & a[index];
        if(x==0)        
            return Math.max(strs[index].length()+solve(strs,no^a[index],a,index+1,c),solve(strs,no,a,index+1,c));
        else
            return solve(strs,no,a,index+1,c);
    }

    public int maxLength(List<String> arr) {
        int a[]=new int[arr.size()];int c=0;String strs[]=new String[a.length];
        for(String s:arr) {
            int x=0,fl=0;
            for(char ch:s.toCharArray()) 
            {
                int z=x|(1<<(ch-96));
                if(x==z)
                {
                    fl=1;break;                
                }
                x=z;
            }
            if(fl==0)
            {
                a[c]=x;
                strs[c++]=s;
            }
        }
        return solve(strs,0,a,0,c);
    }
}
