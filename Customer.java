public class Customer {
    private int money;
    private boolean hasCoffee;
    String menuName = "아메리카노";

    public Customer(int money){
        money = 10000;
        hasCoffee = false;
        this money = money;
       //입력 파라미터에서 온 변수하고 상태 변수하고 구분한다.

    }
    public void print(){
        System.out.println(money);
        System.out.println(hasCoffee);
    }
    public void order(String menuName){
        System.out.println("손님 "+ menuName +"한 잔 주세요");
    }
    public void pay(){

    }
    public Customer()

    void main(){


    }


}
