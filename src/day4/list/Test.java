package day4.list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @desc TODO
 * @author chenyi
 * @date 2025/9/4
 */
public class Test {

    public static void main(String[] args) {
        //创建一个集合，模拟用户数据
        ArrayList<User> users = new ArrayList<>();
        int maxlogin = 3;

        //模拟5个用户对象
        users.add(new User("admin", "admin"));
        users.add(new User("yeban01", "123456"));
        users.add(new User("yeban02", "123456"));
        users.add(new User("yeban03", "123456"));
        users.add(new User("yeban04", "123456"));

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= maxlogin; i++) {
            //输入用户的用户名和密码，模拟用户登录
            System.out.print("\n请输入用户名：");
            String username = scanner.next();

            System.out.print("请输入密码：");
            String password = scanner.next();

            if (users.contains(new User(username, password))) {
                System.out.println("登录成功！");
                break;
            } else {
                if ((maxlogin - i) == 0) {
                    System.out.println("您已输入错误次数过多，请稍后再试");
                }
                System.out.println("登录失败！您的账号或者密码错误！请重试！");
                System.out.println("您还有" + (maxlogin - i) + "次登录机会");
            }

        }

    }
}
