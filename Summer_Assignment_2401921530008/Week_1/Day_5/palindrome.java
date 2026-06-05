class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String a = "";
        for(int i = s.length()-1;i>=0;i--){
           a = a+s.charAt(i);
        }
        if(a.equals(s)){
            return true;
        }else{
        return false;
    }}
}
