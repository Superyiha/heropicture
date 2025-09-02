package day2morning;

import java.util.Scanner;

/**
 * @desc 整数倒排
 * @author chenyi
 * @date 2025/9/2
 */
public class demo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个整数: ");
        int number = scanner.nextInt();

        System.out.println("原数字: " + number);
        int reversedNumber = reverseNumber(number);
        System.out.println("倒排后: " + reversedNumber);

        scanner.close();
    }

    /**
     * 将整数倒排
     * @param number 待倒排的整数
     * @return 倒排后的整数
     */
    public static int reverseNumber(int number) {
        // 处理负数情况
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number; // 转为正数处理
        }

        int reversed = 0;

        // 逐位提取数字并构建倒排数
        while (number != 0) {
            // 提取最后一位数字
            int digit = number % 10;
            // 构建倒排数
            reversed = reversed * 10 + digit;
            // 去掉最后一位数字
            number = number / 10;
        }

        // 如果原数是负数，结果也应为负数
        if (isNegative) {
            reversed = -reversed;
        }

        return reversed;
    }
}
