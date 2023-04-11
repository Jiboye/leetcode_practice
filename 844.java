class Solution{
    public boolean backspaceCompare(String s, String t){
        String ss = helper(s);
        String tt = helper(t);
        return ss.equals(tt);
    }
    public String helper(String s){
        StringBuilder ss = new StringBuilder();
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i) == '#'){
                if(ss.length()>0){
                    ss.deleteCharAt(ss.length()-1);
                }
                else
                    continue;
            }
            else{
                ss.append(s.charAt(i));
            }
        }
        return ss.toString();
    }
}