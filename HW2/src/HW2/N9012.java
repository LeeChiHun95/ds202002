package HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class N9012{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int i;
        while(n-->0){
            boolean isVPS = true;
            String input = br.readLine();
            Stack<Character> stack = new Stack<>();
            
            char temp;
            for(i=0;i<input.length();i++){
                temp = input.charAt(i);
                
                if(temp =='('){
                    stack.push(temp);
                }
                else if(temp==')'){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }else{
                        isVPS = false;
                        break;
                    }
                } 
            }
            if(!stack.isEmpty()) {
                isVPS = false;
            }
            if(isVPS){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}