import java.util.Scanner;

public class GBBGameApp {

    public static void main(String[] args) {
        System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.print("철수 >> ");
        Scanner scanner = new Scanner(System.in);
        String player1 = scanner.next();
        System.out.print("영희 >> ");
        Scanner scanner2 = new Scanner(System.in);
        String player2 = scanner2.next();

        if(player1.equals(player2)){
            System.out.println("비겼습니다.");
        }

        else{
            if(player1.equals("가위")){
                if(player2.equals("바위")){
                    System.out.println("영희가 이겼습니다.");
                }
                else{
                    System.out.println("철수가 이겼습니다.");
                }
            }
            else if(player1.equals("바위")){
                if(player2.equals("보")){
                    System.out.println("영희가 이겼습니다.");
                }
                else{
                    System.out.println("철수가 이겼습니다.");
                }
            }
            else if(player1.equals("보")){
                if(player2.equals("가위")){
                    System.out.println("영희가 이겼습니다.");
                }
                else{
                    System.out.println("철수가 이겼습니다.");
                }
            }
        }
    }
}