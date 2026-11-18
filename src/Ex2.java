import java.util.Scanner;
public class Ex2 {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int STUD_NUM = 5;
        int[] num = new int [STUD_NUM];
        int[] score = new int[STUD_NUM];
        //Todo: 점수를 키보드로 입력 받아야 함
        // score [0] = 90;
       //score [1] = 100;
        int sum = 0;

        for(int i=0; i < STUD_NUM; i++)
            num[i] = i + 1;
        for(int i = 0; i < STUD_NUM ; i++) {
            System.out.println("학생 " + num[i] + "의 자바 점수는: ");
            score[i] = sc.nextInt();
            sum = sum + score[i];
        }

        for(int i=0; i <STUD_NUM; i++)
            System.out.println( num[i] + "자바점수: " + score[i]);

        System.out.println("총점: " + sum);
    }
}
