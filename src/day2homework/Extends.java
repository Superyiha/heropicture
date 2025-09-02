package day2homework;

/**
 * @author chenyi
 * @desc TODO
 * @date 2025/9/2
 */
public class Extends {
    public static void main(String[] args) {
        // 创建Person对象进行测试
        Person person1 = new Person("张三", 25, true, null);
        Person person2 = new Person("李四", 23, false, null);
        Person person3 = new Person("王五", 20, false, null);
        Person person4 = new Person("赵六", 26, true, null);

        System.out.println("=== 测试结婚功能 ===");

        // 测试正常结婚
        System.out.println("测试1: 正常结婚");
        person1.marry(person2);

        System.out.println("\n测试2: 同性结婚");
        person1.marry(person4);

        System.out.println("\n测试3: 年龄不够");
        Person person5 = new Person("小明", 22, true, null);
        person5.marry(person3);

        System.out.println("\n测试4: 已婚人员再次结婚");
        Person person6 = new Person("小红", 24, false, null);
        person1.marry(person6);
    }
}

class Person {
    String name;
    int age;
    boolean gender; // 性别 true男 false女
    Person partner; // 伴侣

    // 构造方法
    public Person(String name, int age, boolean gender, Person partner) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.partner = partner;
    }

    // 结婚方法
    public void marry(Person p) {
        // 检查是否为同性
        if (this.gender == p.gender) {
            System.out.println("不能结婚原因: 同性不能结婚");
            return;
        }

        // 检查年龄是否达到结婚要求
        if ((this.gender && this.age < 24) || (!this.gender && this.age < 22)) {
            System.out.println("不能结婚原因: " + this.name + "未达到结婚年龄");
            return;
        }

        if ((p.gender && p.age < 24) || (!p.gender && p.age < 22)) {
            System.out.println("不能结婚原因: " + p.name + "未达到结婚年龄");
            return;
        }

        // 检查是否已婚
        if (this.partner != null) {
            System.out.println("不能结婚原因: " + this.name + "已经结婚了");
            return;
        }

        if (p.partner != null) {
            System.out.println("不能结婚原因: " + p.name + "已经结婚了");
            return;
        }

        // 可以结婚，设置伴侣关系
        this.partner = p;
        p.partner = this;

        System.out.println("恭喜! " + this.name + "和" + p.name + "结婚了！祝你们百年好合，白头偕老！");
    }
}
