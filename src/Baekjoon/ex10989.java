package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 수 정렬하기 3 - 정렬 - B1
public class ex10989 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n= sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }

        Collections.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int x : arr){
            sb.append(x).append("\n");
        }
        System.out.println(sb);
    }
}
