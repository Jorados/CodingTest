import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public String solution(String[] survey, int[] choices) {
        String[] answer = new String[4];
        int cnt=0;
        // R T // C F // J M // A N
        for(String s : survey){
            char[] c = s.toCharArray();
            if(choices[cnt] <= 3){
                if(c[0] == 'R' && c[0]=='T'){
                    answer[0]+=c[0];
                }
                else if(c[0] =='C' && c[0] =='F'){
                    answer[1]+=c[0];
                }
                else if(c[0]=='J' && c[0] =='M'){
                    answer[2]+=c[0];
                }
                else if(c[0]=='A' && c[0] =='N'){
                    answer[3]+=c[0];
                }
            }
            else if(choices[cnt] >=4){
                if(c[1] == 'R' && c[1]=='T'){
                    answer[0]+=c[1];
                }
                else if(c[1] =='C' && c[1] =='F'){
                    answer[1]+=c[1];
                }
                else if(c[1]=='J' && c[1] =='M'){
                    answer[2]+=c[1];
                }
                else if(c[1]=='A' && c[1] =='N'){
                    answer[3]+=c[1];
                }
            }
            cnt++;
        }
        String answer2 = "";
        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
        return answer2;
    }
}
