package Array;

import java.util.Scanner;

public class ex3 {

    public static char[] solution(int n,int[] arr,int[] brr){
        char[] answer = new char[n];
        //1:가위 2:바위 3:보
        for(int i=0; i<n; i++){
            if(arr[i]==1 && brr[i]==3) answer[i] += 'A';
            else if(arr[i]==2 && brr[i]==1) answer[i] += 'A';
            else if(arr[i]==3 && brr[i]==2) answer[i] += 'A';
            else if(arr[i] == brr[i]) answer[i] += 'D';
            else{
                answer[i] += 'B';
            }
        }
        return  answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        int[] brr = new int[n];
        for(int i=0; i<n; i++){
            brr[i]=sc.nextInt();
        }

        for(char x : solution(n,arr,brr)){
            System.out.println(x + " ");
        }
    }
}
