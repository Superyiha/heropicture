package day3homework.game;

/**
 * @author chenyi
 * @desc TODO
 * @date 2025/9/3
 */
public abstract class Role {

    // 游戏角色的基本属性
    protected String name;     // 角色名称
    protected int level;       // 角色等级
    protected int blood;       // 角色血量
    protected String kind;     // 角色种族
    protected int power;       // 角色攻击力
    protected int defence;     // 角色防御力

    // 无参构造方法
    public Role() {
    }

    // 全参构造方法
    public Role(String name, int level, int blood, String kind, int power, int defence) {
        this.name = name;
        this.level = level;
        this.blood = blood;
        this.kind = kind;
        this.power = power;
        this.defence = defence;
    }

    /**
     * 死亡判定方法 - 公共方法
     * @return 返回true代表已死亡，返回false代表健在
     */
    public boolean isDead() {
        return this.blood <= 0;
    }

    /**
     * 获取角色信息的方法 - 抽象方法，由子类具体实现
     */
    public abstract void show();

    /**
     * 攻击方法 - 抽象方法，由子类具体实现不同的攻击逻辑
     * @param target 攻击目标
     */
    public abstract void attack(Role target);

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

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
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
        return "Role{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", blood=" + blood +
                ", kind='" + kind + '\'' +
                ", power=" + power +
                ", defence=" + defence +
                '}';
    }
}
