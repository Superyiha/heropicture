package day3homework.extend;

/**
 * @author chenyi
 * @desc TODO
 * @date 2025/9/3
 */
public class Plane implements CanFly {

    private String name;
    private String model;

    public Plane() {
    }

    public Plane(String name, String model) {
        this.name = name;
        this.model = model;
    }

    /**
     * 实现CanFly接口的fly方法
     * 飞机的飞行方式
     */
    @Override
    public void fly() {
        System.out.println("飞机" + (name != null ? name : "") +
                (model != null ? "(" + model + ")" : "") +
                "正在天空中飞行，发出轰鸣的引擎声！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Plane{name='" + name + "', model='" + model + "'}";
    }
}
