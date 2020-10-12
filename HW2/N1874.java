package lecture6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class N1874{
    public static int n;
    public static int num = 1;
    
    public static int [] arr;
    public static Stack<Integer> stack;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        stack = new Stack<Integer>();
        
        boolean isAble = true;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
            
            if(isAble){
                if(num <= arr[i]){
                    while(num<=arr[i]){
                        stack.push(num++);
                        sb.append("+ \n");
                    }
                }
                if(stack.isEmpty()) 
                    isAble = false;
                else{
                    while(stack.peek() >= arr[i]){
                        stack.pop();
                        sb.append("- \n");
                        if(stack.isEmpty()){
                            break;
                        }
                    }
                }
            }
        }
            if(isAble){
                System.out.println(sb.toString());
            }
            else{
                System.out.println("NO");
            }
        }
  
    }