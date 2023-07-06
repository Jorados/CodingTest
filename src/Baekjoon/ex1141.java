package Baekjoon;


import java.util.*;

// 접두사 - 정렬 - S1
// indexOf는 특정 문자나 문자열이 있는지 없는지 검사하여 인덱스를 리턴하는 함수.
// 없으면 -1 반환
// 접두사는 어떠한 단어로 시작하는 단어면 접두사인거임
public class ex1141 {

    static int n;
    static String[] arr;

    public static void solution(){
        Arrays.sort(arr, new Comparator<String>() {
            @Override // 길이 내림차순
            public int compare(String o1, String o2) {
                return Integer.compare(o2.length(),o1.length());
            }
        });

        ArrayList<String> list = new ArrayList<>();
        for(String s1 : arr){
            if(list.size()==0){
                list.add(s1);
            }

            boolean flag = true;
            for(String s2 : list){
                if(s2.indexOf(s1)==0) {
                    flag = false;
                    break;
                }
            }
            if(flag) list.add(s1);

        }

        System.out.println(list.size());
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        arr = new String[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.next();
        }
        solution();
    }
}
