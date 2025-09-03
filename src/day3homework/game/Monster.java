package day3homework.game;

/**
 * @author chenyi
 * @desc TODO
 * @date 2025/9/3
 */
public class Monster extends Role {

    // 无参构造方法
    public Monster() {
        super();
    }

    // 全参构造方法
    public Monster(String name, int level, int blood, String kind, int power, int defence) {
        super(name, level, blood, kind, power, defence);
    }

    /**
     * 怪兽攻击方法 - 实现父类抽象方法
     * 怪兽攻击没有暴击机制，直接计算伤害
     * @param target 攻击目标（英雄）
     */
    @Override
    public void attack(Role target) {
        // 计算本回合的目标失血量 = 怪兽的攻击力 - 目标的防御力
        int damage = this.power - target.getDefence();
        if (damage > 0) {
            // 计算目标的失血量
            target.setBlood(target.getBlood() - damage);
            System.out.println("怪兽" + this.name + "攻击" + target.getName() +
                    "，造成伤害：" + damage + "，目标剩余血量：" + target.getBlood());
        } else {
            System.out.println("本回合攻击无效");
        }
    }

    /**
     * 获取怪兽信息的方法 - 实现父类抽象方法
     */
    @Override
    public void show() {
        System.out.println("========= 怪兽信息 =========");
        System.out.println("怪兽名称：" + name);
        System.out.println("怪兽等级：" + level);
        System.out.println("怪兽血量：" + blood);
        System.out.println("怪兽种类：" + kind);
        System.out.println("怪兽攻击力：" + power);
        System.out.println("怪兽防御力：" + defence);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", blood=" + blood +
                ", kind='" + kind + '\'' +
                ", power=" + power +
                ", defence=" + defence +
                '}';
    }
}
