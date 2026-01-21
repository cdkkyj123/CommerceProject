package commerce.step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        Product item1 = new Product("Galaxy s5", 1200000, "최신 안드로이드 스마트폰", 50);
        Product item2 = new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 40);
        Product item3 = new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 30);
        Product item4 = new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 70);

        products.add(item1);
        products.add(item2);
        products.add(item3);
        products.add(item4);

        System.out.println("상품을 조회하시겠습니까?");
        System.out.println("예: y, 아니오: any key");
        String confirmMenu = sc.next();
        if (confirmMenu.equals("y")) {
            System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
            for (int i = 0; i < products.size(); i++) {
                System.out.println((i + 1) + ". " + products.get(i));
            }
            System.out.println(0 + ". 종료 | 프로그램 종료");
            System.out.println("조회를 원하시는 상품의 번호를 입력하세요.");

            boolean run = true;
            while (run) {
                int selectedNum = sc.nextInt();
                if (selectedNum == 0) {
                    System.out.println("커머스 플랫폼을 종료합니다.");
                    run = false;
                } else if (selectedNum >= 1 && selectedNum <= products.size()) {
                    Product selected = products.get(selectedNum - 1);
                    System.out.println(selected);
                    System.out.println("해당 상품의 재고가 " + selected.getStock() + "개 남았습니다.");
                    System.out.println("다른 상품의 번호를 입력해주세요.");
                } else {
                    System.out.println("해당 번호의 상품이 없습니다.");
                    System.out.println("다른 상품의 번호를 입력해주세요.");
                }
            }
        } else {
            System.out.println("조회를 종료합니다.");
        }
    }
}
