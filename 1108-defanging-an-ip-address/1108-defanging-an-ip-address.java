class Solution {
    public String defangIPaddr(String address) {
        StringBuilder res=new StringBuilder();

        int n=address.length();
        for(int i=0;i<n;i++){
            char ch=address.charAt(i);
            if(ch=='.'){
                res.append("[.]");
            }else{
                res.append(ch);
            }
        }
        return res.toString();
    }
}