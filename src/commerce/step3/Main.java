package commerce.step3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CommerceSystem system = new CommerceSystem();

        // 전원 버튼이라는 느낌으로 이정도는 남겨두었음.
        System.out.println("목록을 조회하시겠습니까?");
        System.out.println("예: y, 아니오: any key");
        String confirmMenu = sc.next();
        if (confirmMenu.equals("y")) {
            system.start();
        } else {
            System.out.println("조회를 종료합니다.");
        }
    }
}
