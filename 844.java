class Solution{
    public boolean backspaceCompare(String s, String t){
        String ss = helper(s);
        String tt = helper(t);
        return ss.equals(tt);
    }
    public String helper(String s){
        StringBuilder ss = new StringBuilder();
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i) == '#'){ // Check if Character is BackSpace
                if(ss.length()>0){
                    ss.deleteCharAt(ss.length()-1); //if string is not empty, delete the last Character in string
                }
                else
                    continue; // If String is empty, do nothing.
            }
            else{
                ss.append(s.charAt(i)); //Add Character into string
            }
        }
        return ss.toString();
    }
}