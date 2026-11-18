public class Ex4 {
    String[] menuNames = {"김치찌개", "수제 돈까스", "제육볶음"};
    int[] menuPrices = {8000, 9500, 9000};
    String[] optionNames = {"계란후라이 추가", "곱빼기", "선택안함"};
    int [] optionPrices = {1000, 2000, 0};
    int menuChoice = 1;
    int optionChoice = 1;
    int quantity = 2;

    int getBestPrice(int menuChoice){
        if (menuChoice < 0 || menuChoice > 2)
            return -1;
    return menuPrices[menuChoice];
    }

    int getOptionPrice(int optionChoice){
        int optionPrice = 0;
        switch (optionChoice) {
            case 0:
                optionPrice = 1000;
                break;
            case 1:
                optionPrice = 2000;
                break;
            case 2:
                optionPrice = 0;
                break;
            default:
                optionPrice = -1;
        }
    return optionPrice;
    }

    void main(String[] args){
        int menuPrices = getBestPrice(menuChoice);
        int optionPrice = getOptionPrice(optionChoice);
        if (menuPrices == -1 || optionPrice == -1){
            System.out.println("잘못 입력했습니다, 프로그램을 종료합니다");
            return;
        }
        System.out.println("주문 메뉴: " + menuNames[menuChoice]);
        System.out.println("선택 옵션: " + optionNames[optionChoice]);
        System.out.println("주문 수량:" + quantity);
        System.out.println("총액: " + (menuPrices + optionPrice) * quantity);
    }
}
