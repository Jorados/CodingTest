package CodingTest.DFS;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// IP주소 - DFS -> 잘 모르겠다.
public class ex5 {

    static String n;
    static ArrayList<String> answer = new ArrayList<>();
    static ArrayList<String> list = new ArrayList<>();

    public static void DFS(int s){
        if(list.size()==4 && s == n.length()){
            String Ts = "";
            for(String x : list) Ts += x + ".";
            answer.add(Ts.substring(0,Ts.length()-1)); //끝에 "." 자르기
        }

        for(int i=s; i<n.length(); i++){
            if(n.charAt(s)=='0' && i>s) return; // 0으로 시작하면서 2자리 이상이면 재귀 x
            String num = n.substring(s,i+1);
            if(Integer.valueOf(num)>255) return;
            list.add(num);
            DFS(i+1);
            list.remove(list.size()-1); // 전역으로 선언돼서 직접 뺴줘야함.
        }
    }
    public static void solution(){
        DFS(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextLine();
        solution();

        for(int i=0; i<answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }
}
