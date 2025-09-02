package day2afternoon;

/**
 * @author chenyi
 * @desc TODO
 * @date 2025/9/2
 */
public class Teacher extends Person {

    // 子类特有属性：工号、学科
    private long employeeId;  // 工号
    private String subject;   // 学科

    // 无参构造方法
    public Teacher() {
        super(); // 调用父类无参构造方法
    }

    // 全参构造方法
    public Teacher(String name, char gender, int age, long employeeId, String subject) {
        super(name, gender, age); // 调用父类构造方法初始化继承的属性
        this.employeeId = employeeId; // 初始化子类特有属性
        this.subject = subject;
    }

    // 子类特有方法：教学
    public void teach(){
        // 使用继承的getName()方法获取姓名
        System.out.println(getName() + "老师正在教授" + subject + "课程......");
    }

    // 子类特有方法：批改作业
    public void correctHomework(){
        System.out.println("一个" + subject + "老师正在批改作业......");
    }

    // 子类特有属性的getter和setter方法
    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +    // 使用继承的getName()方法
                ", gender=" + getGender() +       // 使用继承的getGender()方法
                ", age=" + getAge() +             // 使用继承的getAge()方法
                ", employeeId=" + employeeId +
                ", subject='" + subject + '\'' +
                '}';
    }
}
