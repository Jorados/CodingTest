package DFS_BFS;

import java.util.*;

public class ex7 {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();

        for(int i=0; i<c.length; i=i+2){
            c[i] = Character.toUpperCase(c[i]);
        }
        return answer;
    }

}
