package sec02.chap03;

public class Ex05 {
    public static void main(String[] args) {

        //  💡 final 연산자 : 변수의 값을 바꾸지 못하게 만듦
        final int INT_NUM = 1;
//        INT_NUM = 2; // ⚠️ 불가

        // 자바의 final은 '상수'보다는 "한 번만 값을 넣을 수 있는 주머니"
        // 상수의 변수명은 "대문자"로 명칭하는것이 관례이다.

        //  사용 가능
        int yalco, _yalco, $yalco, 얄코;

        // 사용 불가
//        int 1yalco;   // 숫자로 시작해선 안된다.
//        int yal co;   // 공백이 들어가선 안된다.
//        int #yalco;   // $,_ 를 제외한 다른 특수문자는 들어가선 안된다.

        // 사용 불가
//        int double;
//        boolean instanceof;
//        char new;
    }
}
