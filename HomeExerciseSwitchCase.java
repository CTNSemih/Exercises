package mypack;

import java.util.Scanner;

class HomeExerciseSwitchCase {
    
	public static void main(String[] args) {

        System.out.println("Please write a number :");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
            	System.out.println("Invalid Day ! ");
            
        }
    }
}
