package Beakjoon_zaqabi;


import java.util.*;

// 빈도 정렬 - S3
// 1순위 갯수가 많으면 젤앞에
// 2순위 갯수가 같으면 --> 먼저 나온 순으로
public class ex2910 {

    static int n,m;
    static Integer[] arr;
    public static void solution(){

        HashMap<Integer,Integer> map = new LinkedHashMap<>();

        for(int x : arr) map.put(x,map.getOrDefault(x,0)+1);

        // List 에다가 map 을 담아서 내림차순 정렬
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        // 내림차순 정렬
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                //list.get(b) 와 list.get(a)의 위치가 바뀌면 오름차순이 된다.
                return Integer.compare(map.get(b), map.get(a));
            }
        });

        for(int x : list){
            for(int i=0; i<map.get(x); i++){
                if(x>0){
                    System.out.print(x + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();
        m=sc.nextInt();

        arr=new Integer[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        solution();
    }
}
