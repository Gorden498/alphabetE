public class Customer {
    private int money;
    private boolean hasCoffee;
    String menuName = "아메리카노";

    public Customer(int money){
        this. money = 10000;
        this. hasCoffee = false;
        this money = money;
       //입력 파라미터에서 온 변수하고 상태 변수하고 구분한다.

    }
    public void print(){
        System.out.println(money);
        System.out.println(hasCoffee);
    }
    public void order(Barista barista, String menuName){
        System.out.println("손님 "+ menuName +"한 잔 주세요");
        if(isError == -9){
            System.out.println("손님 돈이 없습니다");
            return;
        }
        String coffee = barista.takeOrder(menuName, price);
        takeCoffee(coffee);
    }
    public void takeCoffee()

    public void pay(int money){

        if(this.money < money){

        }
        this.money = this.money - money;

    }
    public Customer();

    void main(){


    }


}
