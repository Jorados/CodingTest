package programmers;
import java.util.*;


public class chatting {
    static ArrayList<String> answer = new ArrayList<>();
    static Map<String,String> map = new HashMap<>();
    static String[] arr = new String[5];
    public static void solution(){
        // 다 돌리고나면 해당 아이디에 맞는 이름이 매칭 되어있을 것.
        for(String str : arr){
            String[] info = str.split(" ");

            if(info[0].equals("Leave")) continue;
            else if(info[0].equals("Enter")) map.put(info[1],info[2]);
            else map.put(info[1],info[2]); //덮어 씌움
        }

        // 해당아이디 이름 불러와서 answer에 저장
        for(String str : arr){
            String[] info = str.split(" ");
            String name = map.get(info[1]);

            if(info[0].equals("Enter")) answer.add(name + "님이 들어왔습니다.");
            else if(info[0].equals("Leave")) answer.add(name + "님이 나갔습니다.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++){
            arr[i] = sc.nextLine();
        }

        solution();
        for(String x : answer){
            System.out.println(x);
        }
    }
}
