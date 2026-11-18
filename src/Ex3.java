public class Ex3 {

 /*   int total = 0;
    int price = 3000;
    int quantity = 2;
    void calcurateTotal(int price, int quantity){
        total = price * quantity;
    }
    void printTotal(){
        System.out.println("결제금액 "+ total);
    }
    void main(){
        calcurateTotal(price, quantity);
        printTotal();
    }

}*/
// 키오스크 만들기 프로그램
    String[] menuName = {"아메리카노", "카페라떼", "바닐라라떼"};
    int [] menuPrice = {3000, 4000, 5000};
    int ERROR = -9;
    final String ERROR_001 = "다시 입력하세요:";
    final String ERROR_002 = "입력이 잘못되었습니다";
    private int Price;

    public void main(){
        int menuChoice = 1; //카페라떼
        int menuSize = 1; //1:톨 2:그란테 3:벤티
        int menuPrice = getPrice(menuChoice);
        int sizePrice = getSizePrice(menuSize);
        if(menuPrice == ERROR || sizePrice == ERROR)
            System.out.println(ERROR_002);
        System.out.println("선택한 메뉴의 가격은: " + menuPrice);

    }
    int getPrice(int menu){
        if(menu < 0 || menu > menuName.length)
            return ERROR;
        return menuPrice[menu];
    }
    int getSizePrice(int size){
       int price = 0;
       if(size <= 0 || size >3)
            return ERROR;
       switch(size){
           case 1:
                price = 500;
                break; 
            case 2:
                price = 1000;
                break;
            case 3:
                price = 1500;
                break;
            default:
                price = ERROR;
            }
        return price;
    }
}
