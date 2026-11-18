public class EX1 {
    void main() {
        int score = 34;
        String ERROR_001 = "Error001 : 점수를 0~100까지만 입력하세요";
        if (score < 0 || score > 100) {
            System.out.println(ERROR_001);
            return;
        }
        String grade = "";
        switch (score / 10) {
            case 10:
                grade = "A";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade= "F";
                break;
        }
        System.out.println(grade);

    }
}