package CodingTest.DFS;


import java.util.Scanner;

// 가장 가까운 큰수
public class ex1 {
    static int answer=Integer.MAX_VALUE;
    static boolean flag = false;
    public static void DFS(char[] ctr,boolean[] ch,String tmp,int n){
        if(tmp.length()>=ctr.length && Integer.valueOf(tmp)>n){
            flag = true;
            answer = Math.min(answer,Integer.valueOf(tmp));
        }

        for(int i=0; i<ctr.length; i++){
            if(!ch[i]){
                ch[i]=true;
                DFS(ctr,ch,tmp+ctr[i],n);
                ch[i]=false;
            }
        }
    }
    public static int solution(int n){
        char[] ctr = Integer.toString(n).toCharArray();
        boolean[] ch = new boolean[ctr.length];

        DFS(ctr,ch,"",n);
        if(!flag) return -1;
        else return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
