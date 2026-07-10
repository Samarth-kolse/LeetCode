class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder res=new StringBuilder();
        int n=s.length();
        int i=0;
        int count=1;
        while(count<=k && i<n){
            char ch=s.charAt(i);

            if(ch==' ') count++;
            if(count>k) break;
            res.append(ch);
            i++;
        }
        return res.toString();
    }
}