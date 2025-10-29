package chap_01;

        /* 퀴즈 1
        버스 도착 정보를 출력하는 프로그램을 작성하시오.
        각 정보는 적절한 자료형의 변수에 정의합니다.

        - 버스 번호는 "1234", "상암08" 과 같은 형태
        - 남은 시간은 분 단위
        - 남은 거리는 km 단위
        */

public class _Quiz_01 {
    public static void main(String[] args) {

        //버스 번호
        String busNo = "나르09";

        //남은 시간
        int minute = 5;

        //남은 거리
        double distance = 1.5;

        //결과 출력
        System.out.println(busNo + "번 버스");
        System.out.println(busNo + "번 버스의 도착까지 남은 시간은 " + minute + "분 입니다.");
        System.out.println(busNo + "번 버스의 도착까지 남은 거리는 " + distance + "Km 입니다.");

    }
}
