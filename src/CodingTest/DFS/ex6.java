package CodingTest.DFS;


import java.util.Scanner;

// 알파코드 - 모르겠음
public class ex6 {

    static String s;
    static int answer=0;
    public static void DFS(int start){
        if(start == s.length()){
            answer++;
        }

        for(int i=start; i<s.length(); i++){
            if(i<s.length()-1 && Integer.valueOf(s.substring(i,i+2)) <=26){
                Integer num = Integer.valueOf(s.substring(i, i + 2));
                char ctr = (char)(num+'0');
                DFS(start+=2);
            }

            if(s.charAt(i)!='0'){
                DFS(start+=1);
            }
        }
    }
    public static void solution(){
        DFS(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        solution();
        System.out.println(answer);
    }
}
