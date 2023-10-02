package CodingTest.Hashing;


import java.util.*;

// 경고 메일
public class ex7 {
    static int n;
    static String[] reports;
    static int time;
    static ArrayList<String> answer = new ArrayList<>();
    static Map<String,Integer> map = new HashMap<>();
    static Map<String,Integer> storage = new HashMap<>();
    public static void solution(){
        for(String report : reports){
            String[] divide = report.split(" ");
            int startTime = 0;
            int endTime = 0;
            if(divide[2].equals("in")){
                String[] divide_Time = divide[1].split(":");
                startTime = (Integer.valueOf(divide_Time[0]) * 60) + Integer.valueOf(divide_Time[1]);
                map.put(divide[0],startTime);
            }
            else if(divide[2].equals("out")){
                String[] divide_Time = divide[1].split(":");
                endTime = (Integer.valueOf(divide_Time[0]) * 60) + Integer.valueOf(divide_Time[1]);

                Integer st = map.get(divide[0]);
                int totalTime = endTime - st;
                storage.put(divide[0],storage.getOrDefault(divide[0],0)+totalTime);
                map.remove(divide[0]);
            }
        }

        for(String x : storage.keySet()){
            if(storage.get(x)>=time){
                answer.add(x);
            }
        }
        Collections.sort(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        reports = new String[n];

        sc.nextLine();
        for(int i=0; i<reports.length; i++){
            reports[i] = sc.nextLine();
        }

        time = sc.nextInt();
        solution();

        for(String x : answer){
            System.out.print(x + " ");
        }
    }
}
