package Baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ex1427 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        String s = sc.next();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int n = Character.getNumericValue(c);
            arr.add(n);
        }
        Collections.sort(arr);

        for(int i=arr.size()-1; i>=0; i--){
            System.out.print(arr.get(i));
        }
    }
}
