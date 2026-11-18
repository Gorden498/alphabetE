public class Barista {
    private int coffeePrice;
    private int beanCount;
    private int cashBox;
    public Barista(int coffeePrice, int beanCount) {
        this coffeePrice = coffeePrice;
        this.beanCount = beanCount;
        this.cashBox = 0;
    }
    public int getCoffeePrice(){

    }
    public String makeCoffee(String menu){
        beanCount --;
        System.out.println("[바리스타]" + beanCount + "가 남았습니다.");
        System.out.println("[바리스타]" + menu + "를 만들었습니다.");
        return "커피를 만들었습니다";

    }
    public String takeOrder(){
        System.out.println("[바리스타] " +menu + "가 주문되었습니다");
        System.out.println("[바리스타] " + money + "을 받았습니다");
        if(isBean() == true){
            System.out.println("[바리스타] 원두가 없어서 주문이 불가능합니다.");
            return 0;
        }
        cashBox = cashBox + money;
        System.out.println("[바리스타]" + cashBox + "원을 금고에 보관하였습니다.");
        String madeCoffee =makeCoffee();
    }
    public boolean isBean() {
        if (beanCount <= 0) {
            return true;
        else
            return false;
        }
    }

}
