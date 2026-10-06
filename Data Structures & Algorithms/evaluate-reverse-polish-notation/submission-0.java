class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String oprator="*/+-";
        for(int i=0;i<tokens.length;i++){
            if(oprator.contains(tokens[i])){
                int val2=stack.pop();
                int val1=stack.pop();
                int res;
                if(tokens[i].equals("*")){
                    res=val1*val2;
                }
                else if(tokens[i].equals("/")){
                    res=val1/val2;
                }
                else if(tokens[i].equals("+")){
                    res=val1+val2;
                }
                else{
                    res=val1-val2;
                }
                stack.push(res);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}
