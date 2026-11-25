package Project;

public class Barista {
    private int coffeePrice;
    private int beanCount;
    private int cashBox;

    public Barista(){
        coffeePrice = 3000;
        beanCount = 10;
        cashBox = 0;
    }
    public Barista(int coffeePrice, int beanCount) {
        this.coffeePrice = coffeePrice;
        this.beanCount = beanCount;
        this.cashBox = 0;
    }
    public void makeCoffee(){
        // 커피 한 잔에 원두 1개를 쓴다
        beanCount--;
        System.out.println("커피 완성");
    }
    public void takeOrder(Customer customer, String menuName, int quantity){
        int count = customer.order(menuName, quantity);
        int price = coffeePrice * count;

        if (price > 0 && customer.getMoney() >= price && beanCount >= count) {
            customer.pay(price);
            cashBox += price;
            for (int i = 0; i < count; i++) {
                makeCoffee();
            }
        } else {
            System.out.println("주문 실패");
        }
    }
    public void checkBeanCount(){
        System.out.println("남은 원두: " + beanCount);
    }
    void main(){
        Customer customer = new Customer(10000);
        Barista barista = new Barista();

        barista.takeOrder(customer, "아메리카노", 2);
        barista.checkBeanCount();
        customer.print();
    }

}
