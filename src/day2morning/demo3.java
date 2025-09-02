package day2morning;

import java.util.Scanner;

/**
 * @author chenyi
 * @desc 猜数字游戏
 * @date 2025/9/2
 */
public class demo3 {
    public static void main(String[] args) {
        // 生成1-100之间的随机数
        int targetNumber = (int) (Math.random() * 100) + 1;

        // 创建Scanner对象用于接收用户输入
        Scanner scanner = new Scanner(System.in);

        // 记录猜测次数
        int guessCount = 0;
        // 最大猜测次数
        int maxGuessCount = 7;
        // 是否猜对标志
        boolean isCorrect = false;

        System.out.println("欢迎来到猜数字游戏！");
        System.out.println("我已经想好了一个1-100之间的数字，你有7次机会猜中它。");

        // 循环进行猜测，直到猜中或超过最大次数
        while (guessCount < maxGuessCount && !isCorrect) {
            System.out.print("第" + (guessCount + 1) + "次猜测，请输入一个数字: ");
            int userGuess = scanner.nextInt();

            // 增加猜测次数
            guessCount++;

            // 判断用户输入与目标数字的关系
            if (userGuess < targetNumber) {
                System.out.println("太小了，再大一点！");
            } else if (userGuess > targetNumber) {
                System.out.println("太大了，再小一点！");
            } else {
                System.out.println("恭喜你猜对了！");
                isCorrect = true;
            }
        }

        // 如果7次都没猜中
        if (!isCorrect) {
            System.out.println("你太笨了，下次再来吧！");
            System.out.println("正确答案是: " + targetNumber);
        }

        scanner.close();
    }
}
