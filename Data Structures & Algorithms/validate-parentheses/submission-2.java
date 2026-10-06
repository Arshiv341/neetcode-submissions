class Solution {
    public static boolean match(char ch1, char ch2){
        if(ch1=='(' && ch2==')') return true;
        if(ch1=='['&& ch2==']') return true;
        if(ch1=='{'&&ch2=='}') return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                st.push(s.charAt(i));
            }
            else{
                char ch1= s.charAt(i);
                char ch2;
                if(st.isEmpty()){
                    return false;
                }
                 ch2=st.peek();
                if(!st.isEmpty() && match(ch2,ch1)){
                    st.pop();
                }
                else{
                    st.push(s.charAt(i));
                }
            }
        }
        if(st.isEmpty()) return true;
        return false;
    }
}
