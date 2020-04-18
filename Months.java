import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String monthName = scanner.nextLine();
        int days=0;

        if (monthName.equals("Януари")) {
            days=31;
        } else if (monthName.equals("Февруари")) {
            days=28;
        } else if (monthName.equals("Март")) {
            days=31;
        } else if (monthName.equals("Април")) {
            days=30;
        } else if (monthName.equals("Май")) {
            days=31;
        } else if (monthName.equals("Юни")) {
            days=30;
        } else if (monthName.equals("Юли")) {
           days=31;
        } else if (monthName.equals("Август")) {
            days=31;
        } else if (monthName.equals("Септември")) {
           days=30;
        } else if (monthName.equals("Октомври")) {
           days=31;
        } else if (monthName.equals("Ноември")) {
            days=30;
        } else if(monthName.equals("Декември")){
            days=31;
    }

    System.out.println("Месец " + monthName + " има "+ days +" дни");

    }

}