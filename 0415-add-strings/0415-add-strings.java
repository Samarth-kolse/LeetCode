class Solution {
    public String addStrings(String num1, String num2) {
       int n=num1.length();
       int m=num2.length();
       StringBuilder res=new StringBuilder();
       int i=n-1;
       int j=m-1;
       int carry=0;
       int sum=0;
       while(i>=0 || j>=0 || carry>0){
        
        sum=carry;
        if(i>=0){
            sum+=num1.charAt(i)-'0';

        }
        if(j>=0){
            sum+=num2.charAt(j)-'0';
        }
        res.append(sum%10);
        carry=sum/10;
        i--;
        j--;
       }
       return res.reverse().toString();
    }
}