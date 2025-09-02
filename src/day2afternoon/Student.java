package day2afternoon;

/**
 * @author chenyi
 * @desc TODO
 * @date 2025/9/2
 */
public class Student extends Person {

    // 子类特有属性：学号、专业
    private long num;      // 学号
    private String major;  // 专业

    // 无参构造方法
    public Student() {
        super(); // 调用父类无参构造方法
    }

    // 全参构造方法
    public Student(String name, char gender, int age, long num, String major) {
        super(name, gender, age); // 调用父类构造方法初始化继承的属性
        this.num = num;           // 初始化子类特有属性
        this.major = major;
    }

    // 子类特有方法：吃饭
    public void eat(){
        // 使用继承的getName()方法获取姓名
        System.out.println(getName() + "同学正在吃饭.......");
    }

    // 子类特有方法：学习
    public void study(){
        System.out.println("一个" + major + "专业的同学正在学习......");
    }

    // 子类特有属性的getter和setter方法
    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +  // 使用继承的getName()方法
                ", gender=" + getGender() +     // 使用继承的getGender()方法
                ", age=" + getAge() +           // 使用继承的getAge()方法
                ", num=" + num +
                ", major='" + major + '\'' +
                '}';
    }
}