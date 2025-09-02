package day2afternoon;

/**
 * @author chenyi
 * @desc TODO
 * @date 2025/9/2
 */
public class TeacherMain {
    public static void main(String[] args) {
        //-------------- 无参构造方法 ----------------
        //1.创建Teacher对象信息    语法：  类名  对象名 = new 构造方法();
        Teacher t1 = new Teacher();

        //2.使用Teacher对象的属性
        t1.setName("王老师");
        t1.setAge(35);
        t1.setGender('女');
        t1.setEmployeeId(2001);
        t1.setSubject("数学");

        //3.使用Teacher对象的方法
        System.out.println(t1);
        t1.teach();
        t1.correctHomework();

        //----------- 有参构造方法 -----------
        //1. 创建Teacher对象信息   语法： 类名 对象名 = new 构造方法(参数1, 参数2, ...);
        Teacher t2 = new Teacher("李老师", '男', 42, 2002L, "物理");
        //2. 使用Teacher对象的属性
        System.out.println("姓名: "+t2.getName());

        //3. 使用Teacher对象的方法
        System.out.println();
        t2.teach();
        t2.correctHomework();
    }
}
