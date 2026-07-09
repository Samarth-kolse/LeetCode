class Solution {
    public String interpret(String command) {
        int n=command.length();
        StringBuilder res=new StringBuilder();

        for(int i=0;i<=n-1;i++){
            char ch=command.charAt(i);
            if(ch=='G'){
                res.append("G");
            }else if(ch=='(' && command.charAt(i+1)==')'){
                res.append("o");
            }else if(ch=='(' && command.charAt(i+3)==')'){
                res.append("al");
            }
        }
        return res.toString();
    }
}