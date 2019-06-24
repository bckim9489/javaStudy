import java.util.Scanner;

public class GBBWithComputer {
    public static void main(String[] args){
        String[] arr = {"가위", "바위","보"};


        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while(true) {
            String result = "";
            System.out.print("가위 바위 보!>> ");
            Scanner scanner = new Scanner(System.in);
            String player = scanner.next();
            if(player.equals("그만")){
                break;
            }
            int n = (int) (Math.random() * 3);
            String com = arr[n];

            if(player.equals(com)){
                System.out.println("Player: "+player+", Com: "+com+" 비겼습니다.");
            }
            else {
                if (com.equals("가위")) {
                    if (player.equals("바위")){
                        System.out.println("Player: "+player+", Com: "+com+" Player 가 이겼습니다!");
                    }
                    else{
                        System.out.println("Player: "+player+", Com: "+com+" Com 가 이겼습니다!");
                    }
                }
                if(com.equals("바위")){
                    if(player.equals("보")){
                        System.out.println("Player: "+player+", Com: "+com+" Player 가 이겼습니다!");
                    }
                    else{
                        System.out.println("Player: "+player+", Com: "+com+" Com 가 이겼습니다!");
                    }
                }
                if(com.equals("보")){
                    if(player.equals("가위")){
                        System.out.println("Player: "+player+", Com: "+com+" Player 가 이겼습니다!");
                    }
                    else{
                        System.out.println("Player: "+player+", Com: "+com+" Com 가 이겼습니다!");
                    }
                }
            }
        }
        System.out.println("게임을 종료합니다...");
    }
}