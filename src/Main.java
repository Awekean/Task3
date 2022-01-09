import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму вклада в руб:");
        float money = in.nextFloat();

        System.out.print("Введите кол-во месяцев вклада:");
        int time = in.nextInt();

        Investment investment = new Investment(money,time, (float) 0.07);
        int t = 1;
        for (int i = t; i <=time; i++){
            float newMoney = investment.calculateMoney();
            investment.setMoney(newMoney);
            System.out.println(t++ +"."+"месяц:" + investment.getMoney());
        }

        in.close();
    }
}

