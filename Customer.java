package Project;

public class Customer {
    private int money;
    private boolean hasCoffee;
    String[] menuName = {"아메리카노", "헤이즐넛", "카페라떼"};
    String menu = "";

    public Customer(int money) {
        this.money = money;
        hasCoffee = false;
        //입력 파라미터에서 온 변수하고 상태 변수하고 구분한다.
        for (int i = 0; i < menuName.length; i++) {
            System.out.println(menuName[i]);
        }


    }

    public void print() {
        System.out.println(money);
        System.out.println(hasCoffee);
    }

    public int getMoney() {
        return money;
    }

    public int order(String menuName, int quantity) {
        System.out.println(menuName + " " + quantity + "잔 주문할게요");
        if (menuName.equals("아메리카노") || menuName.equals("헤이즐넛") || menuName.equals("카페라떼")) {
            menu = menuName;
            return quantity;
        } else {
            System.out.println("잘못 입력하셨습니다");
            return 0;
        }
    }

    // 바리스타가 알려준 가격만큼 돈을 낸다
    public void pay(int price) {
        if (price > 0 && money >= price) {
            money -= price;
            hasCoffee = true;
            System.out.println("주문 완료");
        } else if (price > 0) {
            System.out.println("잔액 없음");
        } else {
            System.out.println("주문 내역이 없습니다");
        }
    }
}
