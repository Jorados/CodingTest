package String;


import java.util.Scanner;

//가장 짧은 문자 거리
public class ex10 {
    public static int[] solution(String s, char c){
        int[] answer=new int[s.length()];
        int cnt=0;
        //1.e 왼쪽으로
        //2.e 오른쪽으로 하면서 더 낮은값 저장?
        for(int i=s.length()-1; i>=0; i--){
            cnt++;
            if(s.charAt(i)==c){
                answer[i]=0;
                cnt=0;
            }
            answer[i]=cnt;
        }

        for(int i=0; i<s.length(); i++){
            cnt++;
            if(s.charAt(i)==c){
                answer[i]=0;
                cnt=0;
            }
            answer[i]=Math.min(answer[i],cnt);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        for(int x : solution(s,c)){
            System.out.print(x + " ");
        }
    }
}
