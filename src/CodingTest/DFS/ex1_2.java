package CodingTest.DFS;


import java.util.Scanner;

// 가장 가까운 큰수
public class ex1_2 {

    static int n,answer=Integer.MAX_VALUE;
    static boolean[] ch;
    static boolean flag;
    public static void DFS(char[] ctr,String tmp){
        if(Integer.toString(n).length() == tmp.length() && Integer.valueOf(tmp) > n ){
            answer = Math.min(answer,Integer.valueOf(tmp));
            flag = true;
        }

        for(int i=0; i<ctr.length; i++){
            if(!ch[i]){
                ch[i] = true;
                DFS(ctr,tmp + ctr[i]);
                ch[i] = false;
            }
        }
    }
    public static void solution(){
        char[] ctr = Integer.toString(n).toCharArray();
        ch = new boolean[ctr.length];
        DFS(ctr,"");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        solution();

        if(flag) System.out.println(answer);
        else System.out.println(-1);
    }
}
