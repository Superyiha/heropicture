package day2afternoon;

/**
 * @author chenyi
 * @desc TODO
 * @date 2025/9/2
 */
public class StudentMain {
    public static void main(String[] args) {
        //-------------- 无参构造方法 ----------------
        //1.创建Student对象信息    语法：  类名  对象名 = new 构造方法();
        Student s1 = new Student();

        //2.使用Student对象的属性
        s1.setName("张三");
        s1.setAge(22);
        s1.setGender('男');
        s1.setNum(1011);
        s1.setMajor("计科");

        //3.使用Student对象的方法
        System.out.println(s1);
        s1.study();
        s1.eat();

        //----------- 有参构造方法 -----------
        //1. 创建Student对象信息   语法： 类名 对象名 = new 构造方法(参数1, 参数2, ...);
        Student s2 = new Student("李四", '女', 23, 383L, "智科");
        //2. 使用Student对象的属性
        System.out.println("姓名: "+s2.getName());

        //3. 使用Student对象的方法
        System.out.println();
        s2.study();
        s2.eat();
    }
}
