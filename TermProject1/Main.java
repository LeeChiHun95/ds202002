package TermProject;
import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws IOException {
      // TODO Auto-generated method stub

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      Random random = new Random(100);
      long [] arr = new long [n+1];
      for(int i=1;i<=n;i++) {
         arr[i] = random.nextInt();
      }
      
      Arrays.sort(arr);
      
      int k = Integer.parseInt(br.readLine());
      for(int i=0;i<k;i++) {
         String [] str = br.readLine().split(" ");
         int sta = Integer.parseInt(str[0]); 
         int fin = Integer.parseInt(str[1]);
         long sum = 0;
         
         for(int j=sta;j<=fin;j++)
            sum += arr[j];
         
         System.out.println(arr[sta]+" "+arr[fin]+" "+sum);
      }
   }
}