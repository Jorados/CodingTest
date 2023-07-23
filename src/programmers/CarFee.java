package programmers;
import java.util.*;

class Car{
    int time;
    int number;
    int state;
    public Car (int time,int number,int state){
        this.time = time;
        this.number = number;
        this.state = state;
    }
}

public class CarFee {
    static int[] fees;
    static String[] records;
    static int[] answer = {};
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
            int car_num = Integer.valueOf(str[1]);

            // 상태 계산
            int state=1; //'IN'->1;
            if(str[2] == "OUT") state=0;

            list.add(new Car(num,car_num,state));
        }

        for(Car x : list){
            System.out.println(x.time + " " + x.number + " " + x.state);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        fees = new int[4];
        records = new String[9];

        for(int i=0; i<4; i++){
            fees[i] = sc.nextInt();
        }
        for(int j=0; j<9; j++){
            records[j] = sc.nextLine();
        }
        solution();
    }
}
