package Solutions;

public class HalvesAlike {
    public static void main(String[] args) {

        Solution1704 s = new Solution1704();
        System.out.println(s.halvesAreAlike("TextBook"));
        
    }
    
}


class Solution1704{

    public boolean halvesAreAlike(String s) {

        int mid = s.length()/2;

        String left = s.substring(0,mid);
        String right = s.substring(mid,s.length());

        return countVowels(left.toLowerCase()) == countVowels(right.toLowerCase());

    }

    private int countVowels(String s){

        int vowels = 0;
        for (char j : s.toCharArray()){

            if ((j == 'a')||(j == 'e')||(j == 'i')||(j == 'o')||(j == 'u')){
                vowels++;
            }
      

        }

        return vowels;
    }
}
