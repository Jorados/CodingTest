package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex10867 {

    static int n;
    static ArrayList<Integer> arr = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        n = sc.nextInt();
        for(int i=0; i<n; i++){
            int s = sc.nextInt();
            if(!arr.contains(s)){
                arr.add(s);
            }

        }

        Collections.sort(arr);

        for(int x : arr){
            System.out.print(x + " ");
        }


    }
}
