package Baekjoon;

import java.util.Scanner;

public class ex20310 {

    static String s;
    static int cnt1=0;
    static int cnt2=0;

    public static void solution(){


        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1') cnt1++;
            else cnt2++;
        }

        cnt1 = cnt1/2;
        cnt2 = cnt2/2;

        char[] ctr = s.toCharArray();
        for(int i=0; i<ctr.length; i++){
            if(ctr[i]=='1' && cnt1>0){
                cnt1--;
                ctr[i]='z';
            }
        }

        for(int i=ctr.length-1; i>=0; i--){
            if(ctr[i]=='0' && cnt2>0){
                cnt2--;
                ctr[i]='z';
            }
        }

        StringBuffer sb=  new StringBuffer();
        for(int i=0; i<ctr.length; i++){
            if(ctr[i] != 'z'){
                sb.append(ctr[i]);
            }
        }

        System.out.println(sb.toString());

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        solution();
    }
}
