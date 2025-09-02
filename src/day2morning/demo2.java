package day2morning;

import java.util.Scanner;

/**
 * @author chenyi
 * @desc 飞机票价格计算程序，根据日期判断是否有优惠
 * @date 2025/9/2
 */
public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 输入订票日期
        System.out.print("请输入订票日期(月.日格式，如1.1): ");
        String date = scanner.next();

        // 设定票价
        double price = 1000.0; // 假设票价为1000元
        System.out.println("票价: " + price + "元");

        // 判断是否在优惠期
        double finalPrice = price;
        boolean isDiscountPeriod = false;

        // 解析月份和日期
        String[] dateParts = date.split("\\.");
        int month = Integer.parseInt(dateParts[0]);
        int day = Integer.parseInt(dateParts[1]);

        // 判断是否在节假日(无优惠)
        if (month == 1 && day >= 1 && day <= 3) {
            // 元旦期间(1.01-1.03)无优惠
            isDiscountPeriod = false;
        } else if (month == 5 && day >= 1 && day <= 3) {
            // 五一期间(5.01-5.03)无优惠
            isDiscountPeriod = false;
        } else if (month == 10 && day >= 1 && day <= 7) {
            // 十一期间(10.01-10.07)无优惠
            isDiscountPeriod = false;
        } else {
            // 其他时间打8折
            isDiscountPeriod = true;
        }

        // 计算最终价格
        if (isDiscountPeriod) {
            finalPrice = price * 0.8;
            System.out.println("当前为淡季，享受8折优惠");
        } else {
            System.out.println("当前为节假日，无优惠");
        }

        System.out.println("应付金额: " + finalPrice + "元");

        scanner.close();
    }
}
