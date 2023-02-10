package Recursive_Tree_Graph;


import java.util.Scanner;

//부분 집합구하기
public class ex6 {
    static int n;
    public static int[] DFS(int L){
        int[] answer =new int[L+1];
        String tmp="";
        if(L>n){
            for(int i=1; i<=n; i++){
                if(answer[i]==1) tmp += i + " ";
            }
            if(tmp.length()>0) System.out.println(tmp);
        }
        else{
            answer[L]=1;
            DFS(L+1);
            answer[L]=0;
            DFS(L+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        DFS(1);
    }


}
