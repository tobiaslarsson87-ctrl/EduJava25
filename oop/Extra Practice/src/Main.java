import java.text.DecimalFormat;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //START
        Random randomizer = new Random();
        DecimalFormat twoD = new DecimalFormat("##.##");
        DecimalFormat fullD = new DecimalFormat("##");

        for (int i = 1; i <= 10; i++) {
            Circle myCircle = new Circle(randomizer.nextDouble(1, 10));

            System.out.println("RADIUS: " + twoD.format(myCircle.radius));
            System.out.println("CIRCUMFERENCE: " + twoD.format(myCircle.calculateCircumference()));
        }
    }
}



