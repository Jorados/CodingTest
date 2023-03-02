package Baekjoon;


import java.util.Scanner;

//백준 1759 - 암호 만들기
public class ex7 {

    static int n,m;
    static String answer="";
    static int[] ch;
    public static void DFS(int L,String answer,String[] arr,int s){
        if(L==m){
            System.out.print(answer);
        }
        else{
            for(int i=s; i<arr.length; i++){
                if(ch[i]==0){
                    ch[i]=1;
                    DFS(L+1,answer+arr[i],arr,i+1);
                    ch[i]=0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);

        n=sc.nextInt();
        m=sc.nextInt();
        ch = new int[m];
        //n->L

        String[] arr = new String[m];
        for(int i=0; i<m; i++){
            arr[i] = sc.next();
        }

        DFS(0,"",arr,0);
    }
}
