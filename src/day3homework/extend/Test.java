package day3homework.extend;

/**
 * @author chenyi
 * @desc TODO
 * @date 2025/9/3
 */
public class Test {

    /**
     * makeFly方法 - 让会飞的事物飞起来
     * 使用多态性，接收CanFly接口类型的参数
     * @param canFly 实现了CanFly接口的对象
     */
    public static void makeFly(CanFly canFly) {
        if (canFly != null) {
            System.out.println("准备起飞...");
            canFly.fly();
            System.out.println("飞行结束！");
            System.out.println();
        } else {
            System.out.println("无法让null对象飞行！");
        }
    }

    public static void main(String[] args) {
        System.out.println("========= 接口多态性演示 - 让会飞的事物飞起来 =========");

        // 创建飞机对象
        Plane plane1 = new Plane("东航客机", "波音737");
        Plane plane2 = new Plane("战斗机", "歼-20");

        // 创建鸟对象
        Bird bird1 = new Bird("小黄", "金丝雀", "黄色");
        Bird bird2 = new Bird("大鹏", "老鹰", "棕色");
        Bird bird3 = new Bird("", "麻雀", "灰色");

        // 在main方法中调用makeFly()方法，让飞机起飞
        System.out.println("========= 飞机飞行测试 =========");
        makeFly(plane1);
        makeFly(plane2);

        // 在main方法中调用makeFly()方法，让鸟起飞
        System.out.println("========= 鸟类飞行测试 =========");
        makeFly(bird1);
        makeFly(bird2);
        makeFly(bird3);

        // 演示多态性 - 使用CanFly接口类型的数组
        System.out.println("========= 多态性演示 =========");
        CanFly[] flyingObjects = {
                new Plane("民航客机", "空客A320"),
                new Bird("凤凰", "神鸟", "五彩"),
                new Plane("货运飞机", "运-20"),
                new Bird("小燕子", "燕子", "黑白")
        };

        // 统一调用makeFly方法
        for (CanFly flyingObject : flyingObjects) {
            makeFly(flyingObject);
        }

        System.out.println("========= 测试完成 =========");
    }
}
