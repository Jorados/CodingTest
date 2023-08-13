package programmers;
import java.util.*;

class Car{
    int time;
    String number;
    public Car (int time,String number){
        this.time = time;
        this.number = number;
    }
}

public class CarFee {
    static int[] fees;
    static String[] records;
    static int[] answer = {};
    static int lastTime = 0;
    static ArrayList<Car> list = new ArrayList<>();
    public static void solution(){
        //fees -> 1.기본시간 2.기본요금 3.단위시간 4.단위요금
        //records -> 커스텀클래스로.

        for(String s : records){
            String[] str = s.split(" ");

            // 시간 계산
            Integer a = Integer.valueOf(str[0].charAt(0))*600;
            Integer b = Integer.valueOf(str[0].charAt(1))*60;
            Integer c = Integer.valueOf(str[0].charAt(3))*10;
            Integer d = Integer.valueOf(str[0].charAt(4));
            int num = a+b+c+d;

            // 차번호
            String car_num = str[1];

            list.add(new Car(num,car_num));
        }

        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<list.size(); i++){
            boolean flag = false;
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i).number.equals(list.get(j).number)){
                    flag = true;
                    // 시간 계산
                    int sum = list.get(j).time - list.get(i).time;
                    // 요금 계산
                    int time = fees[1] + ((sum-fees[0]) / fees[2]) * fees[3];  //누적주차시간에서 - fees[0]을 해야하네.

                    map.put(list.get(j).number,map.getOrDefault(list.get(j).number,0) + time);

                    list.remove(j);
                    list.remove(i);
                    continue;
                }
            }
            if(!flag){
                int sum = lastTime - list.get(i).time;
                int time = fees[1] + ((sum-fees[0]) / fees[2]) * fees[3];
                map.put(list.get(i).number,map.getOrDefault(list.get(i).number,0)+time);
            }
        }

        for(String x : map.keySet()){
            System.out.println(map.get(x));
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        fees = new int[4];
        records = new String[9];

        for(int i=0; i<4; i++){
            fees[i] = sc.nextInt();
        }

        sc.nextLine();
        for(int j=0; j<9; j++){
            records[j] = sc.nextLine();
        }
        solution();
    }
}
