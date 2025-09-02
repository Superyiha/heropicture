package day2;

import java.util.Scanner;

/**
 * @author chenyi
 * @desc 简单计算器程序，支持加减乘除运算
 * @date 2025/9/2
 */
public class demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入第一个数字
        System.out.print("-------请输入第一个数字:");
        double num1 = scanner.nextDouble();

        // 输入第二个数字
        System.out.print("-------请输入第二个数字:");
        double num2 = scanner.nextDouble();

        // 输入运算符号
        System.out.print("-------请输入运算符号:");
        String operator = scanner.next();

        // 进行运算
        double result = 0;
        boolean validOperator = true;

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("错误：除数不能为零！");
                validOperator = false;
            }
        } else {
            System.out.println("错误：不支持的运算符！");
            validOperator = false;
        }

        // 输出结果
        if (validOperator) {
            System.out.println("-------" + num1 + operator + num2 + "=" + result);
        }

        scanner.close();
    }
}
