class Solution {
    public int calPoints(String[] operations) {
        Stack<String>st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            String s1 = operations[i];
            if(s1.equals("C") && !st.isEmpty()){
                st.pop();
            }
            else if(s1.equals("D")){
                int n =st.size();
                int mul=1;
                mul=2*Integer.parseInt(st.peek());
                st.push(""+mul);
            }
            else if(s1.equals("+")){
                String s2=st.peek();
                st.pop();
                String s3=st.peek();
                st.pop();
                st.push(s3);
                st.push(s2);
                st.push(Integer.parseInt(s2)+Integer.parseInt(s3)+"");
            }
            else{
                st.push(s1);
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum=sum+Integer.parseInt(st.peek());
            st.pop();
        }
        return sum;
    }
}