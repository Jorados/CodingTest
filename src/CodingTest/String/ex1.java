package CodingTest.String;


import java.util.*;

// 이진수 정렬

class Twin implements Comparable<Twin>{
    int x;
    int y;
    public Twin(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Twin o){
        if(this.y == o.y) return this.x - o.x;
        return this.y - o.y;
    }
}
public class ex1 {
    static int n;
    static int[] arr;
    public static void solution(){
        ArrayList<Twin> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            String str = Integer.toBinaryString(arr[i]);
            int cnt=0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)=='1'){
                    cnt++;
                }
            }
            list.add(new Twin(arr[i],cnt));
        }
        Collections.sort(list);
        for(Twin twin : list){
            System.out.print(twin.x + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        solution();
    }
}
