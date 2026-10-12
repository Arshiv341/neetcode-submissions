class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        for(int i=0;i<logs.length;i++){
            String s1=logs[i];
            if(st.size()==0 && s1.equals("../")) continue;
            if(s1.equals("../") && !st.isEmpty()){
                st.pop();
            }
            else if(s1.equals("./")){
                continue;
            }
            else{
                st.push(s1);
            }
        }
        return st.size();
    }
}