package week1.day2.assignment2;

public class MyCalculator {
	//accessModifier returnType methodName(args){actions}
    public static void main(String[] args) {
        // ClassName objectName = new ClassName();
        Calculator calc = new Calculator();
        int add = calc.addThreeNumbers(5,11,40);
        System.out.println(add);
        int sub = calc.subToTwoNumbers(5,11);
        System.out.println(sub);
        double mul = calc.multToTwoNumbers(7.11,24.33);
        System.out.println(mul);
        float divide = calc.divideToTwoNumbers(54724F,3125F);
        System.out.println(divide);
    }

}
