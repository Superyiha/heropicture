package day3homework.extend;

/**
 * @author chenyi
 * @desc TODO
 * @date 2025/9/3
 */
public class Bird implements CanFly {

    private String name;
    private String species;
    private String color;

    public Bird() {
    }

    public Bird(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public Bird(String name, String species, String color) {
        this.name = name;
        this.species = species;
        this.color = color;
    }

    /**
     * 实现CanFly接口的fly方法
     * 鸟类的飞行方式
     */
    @Override
    public void fly() {
        System.out.println((species != null ? species : "鸟儿") +
                (name != null ? name : "") +
                (color != null ? "(" + color + ")" : "") +
                "正在自由地飞翔，翅膀优雅地扇动着！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bird{name='" + name + "', species='" + species + "', color='" + color + "'}";
    }
}
