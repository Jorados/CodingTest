package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

// 빗물
class Rain{
    int h;
    int y;
    public Rain(int h, int y){
        this.h = h;
        this.y = y;
    }
}
public class ex14719 {
    static int sum=0;
    static int h,w;
    static int[] arr;
    static int maxH = Integer.MIN_VALUE;
    static int maxY = Integer.MIN_VALUE;
    static ArrayList<Rain> list = new ArrayList<>();
    public static void solution(){
        // 가장 높은 곳까지 갔다가 다시 뒤에서 시작.
        for(Rain x : list){
            if(x.h >= maxH){
                maxH = x.h;
                maxY = x.y;
            }
        }

        int nowH = list.get(0).h;
        boolean flag = false;
        for(int i=0; i<list.size(); i++){
            if(nowH >= list.get(i).h && nowH>0){
                sum += nowH - list.get(i).h;
            }
            else if(nowH < list.get(i).h){
                nowH = list.get(i).h;
                if(nowH == maxH && i == maxY){
                    flag = true;
                    break;
                }
            }
        }

        int nowH2 = list.get(list.size()-1).h;
        if(flag){
            for(int i=list.size()-1; i>=0; i--){
                if(nowH2 == maxH && i==maxY-1){
                    break;
                }
                else if(list.get(i).h <= nowH2){
                    sum += nowH2 - list.get(i).h;
                }
                else if(list.get(i).h > nowH2){
                    nowH2 = list.get(i).h;

                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();


        for(int i=0; i<w; i++){
            list.add(new Rain(sc.nextInt(),i));
        }
        solution();
        System.out.println(sum);
    }
}
