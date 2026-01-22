package commerce.step3;

import java.util.*;

public class CommerceSystem {

    Scanner sc = new Scanner(System.in);

    private List<Category> categories;

    static Category elecCategory = new Category("전자제품", Category.initElectronics());
    static Category clothCategory = new Category("의류", Category.initClothes());
    static Category foodCategory = new Category("식품", Category.initFood());

    public CommerceSystem() {
        // 새로운 목록으로 초기화
        this.categories = initCategory();
    }

    private static List<Category> initCategory() {
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(elecCategory);
        categoryList.add(clothCategory);
        categoryList.add(foodCategory);
        return categoryList;
    }


    // 입력과 반복 로직 관리
    public void start() {
        boolean run = true;
        while (run) {
            try {
                System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
                for (int i = 0; i < initCategory().size(); i++) {
                    System.out.println((i + 1) + ". " + initCategory().get(i).getCategoryName());
                }
                System.out.println(0 + ". 종료 | 프로그램 종료");
                System.out.println("조회를 원하시는 카테고리의 번호를 입력하세요.");

                int selectedCateNum = sc.nextInt();
                if (selectedCateNum == 0) {
                    System.out.println("커머스 플랫폼을 종료합니다.");
                    run = false;
                } else if (selectedCateNum >= 1 && selectedCateNum <= getCategoryCount()) {
                    Category selectedCate = getCategory(selectedCateNum - 1);
                    System.out.println("[ 실시간 커머스 플랫폼 - " + selectedCate.getCategoryName() + " ]");
                    for (int i = 0; i < selectedCate.getProductCount(); i++) {
                        System.out.println((i + 1) + ". " + selectedCate.getProducts(i));
                    }
                    System.out.println(0 + ". 뒤로 가기");
                    System.out.println("조회를 원하시는 상품의 번호를 입력하세요.");
                    int selectedProductNum = sc.nextInt();
                    if (selectedProductNum == 0) {
                        System.out.println("----------------------------------");
                    } else if (selectedProductNum >= 1 && selectedProductNum <= selectedCate.getProductCount()) {
                        try {
                            Product selected = selectedCate.getProducts(selectedProductNum - 1);
                            System.out.println(selected);
                            System.out.println("해당 상품의 재고가 " + Objects.requireNonNull(selected).getStock() + "개 남았습니다.");
                            System.out.println("다른 상품의 번호를 입력해주세요.");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("해당 번호의 상품이 없습니다.");
                            System.out.println("다른 상품의 번호를 입력해주세요.");
                        }
                    } else {
                        System.out.println("해당 번호의 상품이 없습니다.");
                        System.out.println("다른 상품의 번호를 입력해주세요.");
                    }
                } else {
                    System.out.println("해당 번호의 카테고리가 없습니다.");
                    System.out.println("다른 카테고리의 번호를 입력해주세요.");
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요.");
                sc.nextLine();
            }
        }
    }

    // Main에서 직접 Product에 조회하는 것이 아닌
    // CommerceSystem를 통해 Category에 경유하여 조회하도록 수정
    public Category getCategory(int index) {
        return categories.get(index);
    }

    public int getCategoryCount() {
        return categories.size();
    }
}
