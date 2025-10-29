package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "030903-4165411"; // 주민등록번호 13자리
        System.out.println(id.substring(0,8)); // 0 위치부터 8 위치 직전까지
        System.out.println(id.substring(0, id.indexOf("-") + 2));
    }
}
