package programmers;

import java.util.*;

public class Homework {
    public static int ToSec(String time) {
        String[] t = time.split(":");
        int sum = Integer.valueOf(t[1]) + (Integer.valueOf(t[0]) * 60);
        return sum;
    }

    public ArrayList<String> solution(String[][] plans) {
        ArrayList<String> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        int nowT = 0;
        int allT = 0;
        String nowP = "";

        Arrays.sort(plans, (o1, o2) -> ToSec(o1[1]) - (ToSec(o2[1])));

        // 가장 최근에 멈춘 걸 시작해야한다.
        for (int i = 0; i < plans.length - 1; i++) {

            String[] time = plans[i][1].split(":");
            nowP = plans[i][0];
            nowT = Integer.valueOf(time[1]) + (Integer.valueOf(time[0]) * 60);
            allT = Integer.valueOf(plans[i][2]);

            // 다음 시간이 언제인지 파악해야한다.
            String[] time2 = plans[i + 1][1].split(":");
            String nowP2 = plans[i + 1][0];
            int nowT2 = Integer.valueOf(time2[1]) + (Integer.valueOf(time2[0]) * 60);

            // 진행 시간이 다음 시간보다 빠른 경우
            if (allT <= (nowT2 - nowT)) {
                // 정답에 추가
                answer.add(plans[i][0]);
                // 남은 시간 map에서 꺼내와서 쫌 처리해줘야한다.
                if ((nowT2 - nowT) - allT > 0) {
                    int restT = (nowT2 - nowT) - allT;
                    if (!map.isEmpty()) {
                        String key = "";
                        for (String str : map.keySet()) {
                            key = str;
                            if (map.get(key) - restT <= 0) map.remove(key);
                            else map.replace(key, map.get(key) - restT);
                            break;
                        }
                    }
                }
                // 마지막 처리
                if (i == plans.length - 2) answer.add(plans[i + 1][0]);
                continue;
            } else {
                map.put(nowP, allT - (nowT2 - nowT));
            }
        }

        // 나머지 map 처리
        for (String sss : map.keySet()) answer.add(sss);

        return answer;
    }
}