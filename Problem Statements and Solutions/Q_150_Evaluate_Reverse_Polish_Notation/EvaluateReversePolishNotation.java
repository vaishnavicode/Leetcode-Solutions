package Q_150_Evaluate_Reverse_Polish_Notation;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {

        Solution150 solution150 = new Solution150();
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(solution150.evalRPN(tokens));

    }

}

class Solution150 {
    int pos;
    public int evalRPN(String[] tokens) {
        this.pos = tokens.length-1;
        return evaluate(tokens);
    }

    public int evaluate(String[] t){
        String token = t[pos];
        pos--;
        if(token.equals("+")){
            return evaluate(t) + evaluate(t); 
        }else
        if(token.equals("*")){
            return evaluate(t) * evaluate(t);
        }else 
        if(token.equals("-")){
            return -evaluate(t) + evaluate(t);
        }else
        if(token.equals("/")){
            int right = evaluate(t);
            return evaluate(t) / right;
        }else{
            return Integer.parseInt(token);
        }
    }
}
