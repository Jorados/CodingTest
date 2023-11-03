package Baekjoon;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 창고 다각형
class Container implements Comparable<Container>{
    int x;
    int y;
    public Container(int x,int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Container o){
        return this.x - o.x;
    }
}
public class ex2304 {
    static int n , answer=0;
    static int maxX=0,maxY=0;
    static ArrayList<Container> list = new ArrayList<>();
    public static void solution() {
        Collections.sort(list);

        // 2 4 5 8 11 13 15 -> x
        // 4 6 3 10 4  6  8 -> y
        for(Container c : list){
            if(c.y>=maxY){
                maxX = c.x;
                maxY = c.y;
            }
        }

        int nowH=0;
        int nowX=0;
        boolean flag = false;
        for(int i=0; i<list.size(); i++){
            if(list.get(i).y >= nowH){
                answer += (list.get(i).x - nowX) * nowH;
                nowX = list.get(i).x;
                nowH = list.get(i).y;
            }

            if(nowH == maxY && nowX == maxX){
                flag = true;
                break;
            }
        }

        int nowH2=0;
        int nowX2=0;
        if(flag){
            for(int i=list.size()-1; i>=0; i--){
                if(list.get(i).y >= nowH2){
                    answer += Math.abs(list.get(i).x - nowX2) * nowH2;
                    nowX2 = list.get(i).x;
                    nowH2 = list.get(i).y;
                }

                if(nowH2 == maxY && nowX2 == maxX){
                    break;
                }
            }
        }

        // 마지막 최고높이 기둥 더해주기
        answer += maxY;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // (x2 - x1) * x2의 높이  // 더 높은 기둥이 나올때까지
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Container(x,y));
        }
        solution();
        System.out.println(answer);
    }
}
