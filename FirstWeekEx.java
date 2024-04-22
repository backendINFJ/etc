import java.util.Scanner;

public class FirstWeekEx {

    public static void main(String[] args) {
        // Scanner 클래스 생성
        Scanner in = new Scanner(System.in);
        // 좋아하는 요리 매서드
        System.out.print("좋아하는 요리를 입력하세요: ");
        String foodName = in.nextLine();
        System.out.println("["+ foodName + "]");

        // 별점 매서드
        System.out.print("별점을 입력하세요: ");
        double foodScore = in.nextDouble();
        System.out.println("별점: "+ (int)foodScore);

        //레시피 매서드
        System.out.print("1.");
        String recipe1 = in.next();
        System.out.print("2.");
        String recipe2 = in.next();
        System.out.print("3.");
        String recipe3 = in.next();
        System.out.print("4.");
        String recipe4 = in.next();
        System.out.print("5.");
        String recipe5 = in.next();
        System.out.print("6.");
        String recipe6 = in.next();
        System.out.print("7.");
        String recipe7 = in.next();
        System.out.print("8.");
        String recipe8 = in.next();
        System.out.print("9.");
        String recipe9 = in.next();
        System.out.print("10.");
        String recipe10 = in.next();

    }
}
