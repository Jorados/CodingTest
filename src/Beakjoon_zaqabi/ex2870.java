package Beakjoon_zaqabi;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 수학 숙제 - 2870
public class ex2870 {

    public static void solution(int n, String[] arr){
        String answer="";
        ArrayList<BigInteger> list = new ArrayList<>();

        for(String s : arr){
            for(int i=0; i<s.length(); i++){
                if(!Character.isAlphabetic(s.charAt(i))){
                    answer+=s.charAt(i);
                }
                else if(Character.isAlphabetic(s.charAt(i)) && answer!=""){
                    list.add(new BigInteger(answer));
                    answer="";
                }
            }
            if(answer!=""){
                list.add(new BigInteger(answer));
                answer="";
            }
        }
        Collections.sort(list);
        for(BigInteger s : list){
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int n  = sc.nextInt();

        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.next();
        }
        solution(n,arr);
    }

}
