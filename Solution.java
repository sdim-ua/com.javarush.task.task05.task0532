

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(reader.readLine());
        int maximum = n;
        
        for (int i = 0; i <= (n - 1); i++){
         int num = Integer.parseInt(reader.readLine());  
         if (i == 0) maximum = num;
         if (num > maximum) maximum = num;
        }
        
        //напишите тут ваш код

       System.out.println(maximum);
    }
}
