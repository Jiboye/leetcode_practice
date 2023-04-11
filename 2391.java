import java.util.*;
import java.io.*;

class Solution{
    public String RemoveStarsStackMethod(String s){
        Stack<Character> st = new Stack<Character>();
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i) == '*')
                st.pop();
            else
                st.push(s.charAt(i));
        }
        char[] result = new char[st.size()];
        for(int j = st.size() -1;j >=0;j--){
            result[j] = st.pop();
        }
        return new String(result);
    }
    public String RemoveStarsStringMethod(String s){
        int j = 0;
        StringBuilder str = new StringBuilder();
        for(int i = 0;i < s.length() ; i++){
            if(s.charAt(i) == '*'){
                str.deleteCharAt(str.length()-1);
            }
            else{
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}