package commerce.step3;

import java.util.ArrayList;
import java.util.List;

public class Category {
    String categoryName;

    // 여기서 관리하겠다 선언
    private List<Product> products;

    // 생성자
    public Category(String categoryName, List<Product> list) {
        this.categoryName = categoryName;
        this.products = list;
    }

    // 메서드 생성
    public static List<Product> initElectronics() {
        List<Product> elecList = new ArrayList<>();
        elecList.add(new Product("Galaxy s5", 1200000, "최신 안드로이드 스마트폰", 50));
        elecList.add(new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 40));
        elecList.add(new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 30));
        elecList.add(new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 70));
        return elecList;
    }

    public static List<Product> initClothes() {
        List<Product> clothList = new ArrayList<>();
        clothList.add(new Product("회색 맨투맨", 12000, "편하게 입는 맨투맨", 200));
        clothList.add(new Product("진한 청바지", 54000, "기본 청바지", 120));
        clothList.add(new Product("고급 롱패딩", 720000, "겨울철 필수템 롱패딩", 40));
        clothList.add(new Product("나이키 슈즈", 140000, "그녀가 신은 핑크색", 70));
        return clothList;
    }

    public static List<Product> initFood() {
        List<Product> foodList = new ArrayList<>();
        foodList.add(new Product("치즈버거", 9000, "아이언맨 1픽 버거", 20));
        foodList.add(new Product("포케", 12000, "건강과 맛을 둘 다 잡은 완전 식품", 30));
        foodList.add(new Product("국밥", 11000, "든든한 국밥", 40));
        foodList.add(new Product("두쫀쿠", 7000, "살면서 한번은 먹어봐야 할 디저트", 10));
        return foodList;
    }

    public String getCategoryName() {
        return categoryName;
    }

    // Main에서 직접 Product에 조회하는 것이 아닌
    // CommerceSystem를 통해 Category에 경유하여 조회하도록 수정
//    public static Category getCategories(int index) {
//        if (index >= 0 && index < products.size()) {
//            return products.get(index);
//        }
//        return null;
//    }

    public Product getProducts(int index) {
        if (index >= 0 && index < products.size()) {
            return products.get(index);
        }
        return null;
    }
    public int getProductCount() {
        return products.size();
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                '}';
    }
}
