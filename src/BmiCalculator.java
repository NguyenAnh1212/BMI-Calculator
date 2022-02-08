import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        double weight, hieght, bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight (in kilogram): ");
        weight = scanner.nextDouble();
        System.out.println("Enter height (in meter): ");
        hieght = scanner.nextDouble();
        bmi = weight/Math.pow(hieght,2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
