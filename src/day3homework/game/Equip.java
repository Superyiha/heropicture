package day3homework.game;
/**
 * @desc TODO
 * @author chenyi
 * @date 2025/9/3
 */
public class Equip {

    private String name;      // 装备名称
    private int level;        // 装备级别
    private String color;     // 装备颜色
    private String kind;      // 装备类别
    private int power;        // 装备攻击力
    private int defence;      // 装备防御力

    // 无参构造方法
    public Equip() {
    }

    // 全参构造方法
    public Equip(String name, int level, String color, String kind, int power, int defence) {
        this.name = name;
        this.level = level;
        this.color = color;
        this.kind = kind;
        this.power = power;
        this.defence = defence;
    }

    /**
     * 获取装备信息的方法
     */
    public void show() {
        System.out.println("装备名称：" + name);
        System.out.println("装备等级：" + level);
        System.out.println("装备色系：" + color);
        System.out.println("装备种类：" + kind);
        System.out.println("装备攻击力：" + power);
        System.out.println("装备防御力：" + defence);
    }

    // Getter和Setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "Equip{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", color='" + color + '\'' +
                ", kind='" + kind + '\'' +
                ", power=" + power +
                ", defence=" + defence +
                '}';
    }
}
