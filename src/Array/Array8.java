package Array;


import java.util.Scanner;

//5
//87 89 92 100 76
// -> 4 3 2 1 5
public class Array8 {
    public static int[] solution(int n,int[] arr){
        int[] answer = new int[n];
        int cnt;
        for(int i=0; i<arr.length; i++){
            cnt = 1;
            for(int j=0; j<arr.length; j++){
                if(arr[i] < arr[j]) cnt++;
            }
            answer[i] += cnt;
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        for(int x : solution(n,arr)){
            System.out.print(x + " ");
        }
    }

}
