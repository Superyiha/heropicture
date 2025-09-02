package day2;

import java.util.Scanner;

/**
 * @desc 打印金字塔图案
 * @author chenyi
 * @date 2025/9/2
 */
public class demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入金字塔行数: ");
        int n = scanner.nextInt();

        // 打印星号金字塔
        System.out.println("星号金字塔:");
        printStarPyramid(n);

        System.out.println(); // 空行分隔

        // 打印字母金字塔
        System.out.println("字母金字塔:");
        printLetterPyramid(n);

        scanner.close();
    }

    /**
     * 打印星号金字塔
     * @param n 行数
     */
    public static void printStarPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // 打印前导空格
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 打印星号
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // 换行
            System.out.println();
        }
    }

    /**
     * 打印字母金字塔
     * @param n 行数
     */
    public static void printLetterPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // 打印前导空格
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 打印字母（从A开始）
            char letter = (char)('A' + i - 1);
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(letter);
            }

            // 换行
            System.out.println();
        }
    }
}
