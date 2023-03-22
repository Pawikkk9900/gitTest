public class CalcApp {
    public static void main(String[] args) {


        Calculator calc = new Calculator();

        double sub = calc.sub(9, 3.3);
        double sum = calc.add(5, 5.3);
        double multiply = calc.multiply(5, 5.3);
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(multiply);
    }
 }
