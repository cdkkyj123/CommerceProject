package commerce.step2;

import java.util.ArrayList;
import java.util.List;

public class CommerceSystem {

    // 여기서 관리하겠다 선언
    private List<Product> products;

    // 생성자
    public CommerceSystem() {
        // 새로운 목록으로 초기화
        this.products = new ArrayList<>();
        // 새로운 메서드 호출
        initProducts();
    }

    // 메서드 생성
    private void initProducts() {
        products.add(new Product("Galaxy s5", 1200000, "최신 안드로이드 스마트폰", 50));
        products.add(new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 40));
        products.add(new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 30));
        products.add(new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 70));
    }

    // 입력과 반복 로직 관리
    public void start() {
        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
        System.out.println(0 + ". 종료 | 프로그램 종료");
        System.out.println("조회를 원하시는 상품의 번호를 입력하세요.");
    }

    // Main에서 직접 Product에 조회하는 것이 아닌
    // CommerceSystem을 경유하여 조회하도록 수정
    public Product getProducts(int index) {
        if (index >= 0 && index < products.size()) {
            return products.get(index);
        }
        return null;
    }
    public int getProductCount() {
        return products.size();
    }
}
