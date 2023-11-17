package Baekjoon;


import java.util.*;

// 수 이어 쓰기
public class ex1515 {
    static String str="";
    static ArrayList<Character> list = new ArrayList<>();
    static long answer=0;
    public static void solution(){
//        long cnt=0;
//        while (list.size()>0){
//            char[] chars = Long.toString(cnt).toCharArray();
//            for(char ctr : chars){
//                // 여기서 같은거 있으면 지우자.
//                if(list.size()>0 && ctr == list.get(0)){
//                    list.remove(0);
//                }
//            }
//            cnt++;
//        }
//        answer=cnt-1;

        int cnt=0;
        int idx=0;
        while (true){
            cnt++;
            String tmp = Integer.toString(cnt);
            for(int i=0; i<tmp.length(); i++){
                if(tmp.charAt(i) == str.charAt(idx)){
                    idx++;
                }
                if(idx == str.length()){
                    System.out.println(cnt);
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        str = sc.next();
        for(int i=0; i<str.length(); i++){
            list.add(str.charAt(i));
        }

        solution();
    }
}
