package Array;

import java.util.Scanner;

//5
//2 3 3 1 3
//1 1 2 2 3
//A B A B D
public class Array3 {

    public static char[] solution(int n, int[] A, int[] B){
        String answer = "";
        for(int i=0; i<n; i++){
            if(A[i] == B[i]){
                answer += 'B';
            }
            else if (A[i]==1 && B[i] == 3) answer += 'A';
            else if (A[i]==2 && B[i] == 1) answer += 'A';
            else if (A[i]==3 && B[i] == 2) answer += 'A';
            else answer += 'B';
        }
        char[] s = answer.toCharArray();
        return s;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] A = new int[n];
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        int[] B = new int[n];
        for(int i=0; i<n; i++){
            B[i] = sc.nextInt();
        }
        for(char s : solution(n,A,B)){
            System.out.println(s + " ");
        }

    }
}
