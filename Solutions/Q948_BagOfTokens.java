package Solutions;

import java.util.Arrays;

public class Q948_BagOfTokens {
    public static void main(String[] args) {

        Solution948 s = new Solution948();
        int[] tokens = {100,200,300,400};
        System.out.println(s.bagOfTokensScore(tokens, 200));
        
    }
}

class Solution948 {
    public int bagOfTokensScore(int[] tokens, int power) {
       int maxScore = 0;
       int score = 0;
       int len = tokens.length;

       Arrays.sort(tokens);
       int i = 0;
       int j = len - 1;

       while(i <= j){

           if(power >= tokens[i]){

               power = power - tokens[i];
               score++;
               i++;

               maxScore = Math.max(maxScore,score);
           }
           else if(score >=1){

               power = power+tokens[j];
               score--;
               j--;
               maxScore = Math.max(maxScore,score);
               
           }
           else{
               return maxScore;
           }
       }
       return maxScore;

   }
}