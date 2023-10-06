package CodingTest.DataStructure;


// CPU 스케줄링

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Task implements Comparable<Task>{
    int a; //호출시간
    int b; //실행시간
    int idx; //작업번호?
    public Task(int a,int b,int idx){
        this.a = a;
        this.b = b;
        this.idx = idx;
    }
    @Override
    public int compareTo(Task o){
        if(this.a==o.a) return this.b - o.b;
        return this.a - o.a;
    }
}
public class ex5 {
    // 한번에 한개
    // 1.실행시간짧은 순 2.작업번호가 작은 순
    // 작업이 끝나는 동시에 다른작업가능
    static int n;
    static int[][] tasks;
    static ArrayList<Task> list = new ArrayList<>();
    static ArrayList<Integer> answer = new ArrayList<>();

    public static void solution(){
        for(int i=0; i<n; i++){
            list.add(new Task(tasks[i][0],tasks[i][1],i));
        }

        // 한 스케줄링이 끝나고, 여러 개의 스케줄링이 가능한 상황이라면
        // 실행시간이 짧은 순으로 해줘야 한다.
        Collections.sort(list);

        for(Task x : list){
            System.out.println(x.a + " " + x.b + " " + x.idx);
        }
        System.out.println();

        int cnt=1;
        while(list.size()>0){
            if(list.size()==0) break;
            int index=0;
            int min=Integer.MAX_VALUE;
            int realIndex=0;
            for(int i=0; i<list.size(); i++){
                // 실행 가능한 것들 중에서 실행시간 비교.
                if(list.get(i).a <= cnt){
                    // 실행시간 같으면 작업 번호(인덱스) 낮은 순 먼저.
                    if(list.get(i).b == min){
                        //작업번호 작은 순
                        if(list.get(i).idx < realIndex){
                            min = list.get(i).b;
                            index = i;
                        }
                    }
                    else if(list.get(i).b < min){
                        min = list.get(i).b;
                        index = i; // 지워야하는 list 번호
                        realIndex = list.get(i).idx; // 실제 작업번호
                    }
                }
            }
            cnt+=min;
            answer.add(list.get(index).idx);
            list.remove(index);
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        tasks = new int[n][2];
        for(int i=0; i<n; i++){
            tasks[i][0] = sc.nextInt();
            tasks[i][1] = sc.nextInt();
        }
        solution();

        for(int x : answer){
            System.out.print(x + " ");
        }
    }
}
