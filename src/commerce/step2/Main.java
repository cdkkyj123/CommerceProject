package commerce.step2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CommerceSystem system = new CommerceSystem();

        System.out.println("상품을 조회하시겠습니까?");
        System.out.println("예: y, 아니오: any key");
        String confirmMenu = sc.next();
        if (confirmMenu.equals("y")) {
            system.start();

            boolean run = true;
            while (run) {
                try {
                    int selectedNum = sc.nextInt();
                    if (selectedNum == 0) {
                        System.out.println("커머스 플랫폼을 종료합니다.");
                        run = false;
                    } else if (selectedNum >= 1 && selectedNum <= system.getProductCount()) {
                        Product selected = system.getProducts(selectedNum - 1);
                        System.out.println(selected);
                        System.out.println("해당 상품의 재고가 " + selected.getStock() + "개 남았습니다.");
                        System.out.println("다른 상품의 번호를 입력해주세요.");
                    } else {
                        System.out.println("해당 번호의 상품이 없습니다.");
                        System.out.println("다른 상품의 번호를 입력해주세요.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("숫자를 입력해주세요.");
                    sc.nextLine();
                }
            }
        } else {
            System.out.println("조회를 종료합니다.");
        }
    }
}
