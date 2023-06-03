package Baekjoon;


import java.util.*;

// 국영수 - 정렬

class Sum implements Comparable<Sum>{
    String name;
    int a; //국어
    int b; //영어
    int c; //수학

    public Sum(String name, int a, int b, int c) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int compareTo(Sum o) {
        if(this.a == o.a) {
            if(this.b == o.b){
                if(this.c == o.c){
                    return this.name.compareTo(o.name);
                }
                return o.c - this.c;
            }
            return this.b - o.b;
        }
        return o.a - this.a;
    }
}
public class ex10825 {

    // 국어 내림차순
    // 국어 같으면 영어 오름차순
    // 국어,영어 같으면 수학 내림차순
    // 모든 점수 같으면 이름 오름차순

    // 이름 국어 영어 수학 순으로 입력
    static int n;
    static ArrayList<Sum> list = new ArrayList<>();

    public static ArrayList<Sum> solution(){
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        n = sc.nextInt();


        for(int i=0; i<n; i++){
            String name = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c =  sc.nextInt();

            list.add(new Sum(name,a,b,c));
        }

        for(Sum x : solution()){
            System.out.println(x.name);
        }
    }

}
