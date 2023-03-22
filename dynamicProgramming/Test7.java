package dynamicProgramming;

import java.io.*;

public class Test7 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the input");
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        if (s.length() < 2) {
            System.out.println("-1");
            return;
        }
        int n = s.length();
        int[] pos = new int[26];
        for (int i = 0; i < 26; i++) {
            pos[i] = -1;
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            if (pos[index] != -1) {
                ans = Math.max(ans, i - pos[index] - 1);
            }
            pos[index] = i;
        }
        System.out.println(ans == -1 ? ans : ans + 1);
    }

}
