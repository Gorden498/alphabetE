public class Ex5 {
    String[] screenTypes = {"일반 2D", "3D 입체", "IMAX", "4DX"};
    int[] basePrices = {14000, 16000, 22000, 20000};
    int selectedScreen = 0;
    int timeCode = 1;

    int getBasePrice(int selectedScreen){
        int prices = 0;
        if (selectedScreen < 0 | selectedScreen > 3)
            return -1;
        prices = basePrices[selectedScreen];
        return prices;
    }

    int getTimeOptionPrice(int timeCode) {
        int timePrices = 0;
        switch (timeCode) {
            case 1:
                System.out.println("1: 조조 할인 (-3,000원)");
                timePrices = -3000;
                break;
            case 2:
                System.out.println("2: 프라임 타임/주말 피크 (+2,000원");
                timePrices = -3000;
                break;
            case 3:
                System.out.println("심야 할인 (-2,000원)");
                timePrices = -2000;
                break;
            case 4:
                System.out.println("일반 시간대 (0원)");
                timePrices = 0;
                break;
            default:
                timePrices = -1;
        }
        return timePrices;
    }

    String getTimeOptionName(int timeCode){
        String timeName = "";
        switch(timeCode) {
            case 1:
                System.out.println(" 1 → 조조 할인");
                timeName = "조조할인";
                break;
            case 2:
                System.out.println("2 → 프라임 타임");
                timeName = "프라임 타임";
                break;
            case 3:
                System.out.println("3 → 심야 할인");
                timeName = "심야 할인";
                break;
            case 4:
                System.out.println("4 → 일반");
                timeName = "일반";
                break;
            default:
                timeName = "ERROR";
        }
    return timeName;
    }

    void printTicketReceipt(String screenType, String timeOption, int basePrice, int optionPrice, int count){

        System.out.println("상영종류:" + screenType + "\n 관람시간:" + timeOption + "\n 예매 매수:" + count);
        System.out.println("총 결제 금액:" + (basePrice + optionPrice) * count);
    }
    void main(){
        String screenType = screenTypes[selectedScreen];
        String timeOption = getTimeOptionName(timeCode);
        int basePrice = getBasePrice(selectedScreen);
        int optionPrice = getTimeOptionPrice(timeCode);
        int count = 1;
        printTicketReceipt(screenType, timeOption, basePrice, optionPrice, count);
    }
}
