package Solutions;

public class Q451_SortCharactersByFrequency{
    public static void main(String[] args) {

        Solution451 s = new Solution451();
        System.out.println(s.frequencySort("tree"));
        
    }
}

class Solution451 {

    public String frequencySort(String s) {
    
       char[] str=s.toCharArray();
        int[] freq=new int[128];
        
        for(int i=0;i<str.length;i++) freq[str[i]]++;

        for(int i=0;i<str.length;){
            char cmax=',';
            
            for(int j=0;j<128;j++){
                if(freq[j]>freq[cmax]) cmax=(char)j;
            }
            while(freq[cmax]!=0){
                str[i++]=cmax;
                freq[cmax]--;
            }
        }
        return new String(str);
    }
}