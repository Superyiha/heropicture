package day3homework.game;

/**
 * @author chenyi
 * @desc TODO
 * @date 2025/9/3
 */
public class Hero extends Role {

    // 子类特有属性：装备系统
    private Equip[] equips = new Equip[3];  // 最多装备3个装备
    private int index = 0;                   // 装备计数器

    // 无参构造方法
    public Hero() {
        super();
    }

    // 全参构造方法
    public Hero(String name, int level, int blood, String kind, int power, int defence) {
        super(name, level, blood, kind, power, defence);
    }

    /**
     * 英雄攻击方法 - 实现父类抽象方法
     * 英雄攻击具有暴击机制
     * @param target 攻击目标（怪兽）
     */
    @Override
    public void attack(Role target) {
        // 产生1-10的随机数，一旦大于6，产生三倍的暴击
        int random = (int)(Math.random() * 10 + 1);
        int criticalHit = 0;
        if (random > 6) {
            criticalHit = random * 3;
        }

        // 计算本回合的目标失血量 = 英雄的攻击力 + 暴击率 - 目标的防御力
        int damage = this.power + criticalHit - target.getDefence();
        if (damage > 0) {
            // 计算目标的失血量
            target.setBlood(target.getBlood() - damage);
            System.out.println("英雄" + this.name + "攻击" + target.getName() +
                    "，造成伤害：" + damage + "，目标剩余血量：" + target.getBlood());
            if (criticalHit > 0) {
                System.out.println("暴击！额外伤害：" + criticalHit);
            }
        } else {
            System.out.println("本回合攻击无效");
        }
    }

    /**
     * 添加装备的方法
     * @param e 装备对象
     */
    public void addEquip(Equip e) {
        if (index >= equips.length) {
            System.out.println("装备已满");
            return;
        }

        // 添加装备
        equips[index++] = e;
        // 合并攻击力和防御力
        this.power += e.getPower();
        this.defence += e.getDefence();
        System.out.println("成功装备：" + e.getName());
    }

    /**
     * 获取英雄信息的方法 - 实现父类抽象方法
     */
    @Override
    public void show() {
        System.out.println("========= 英雄信息 =========");
        System.out.println("英雄名称：" + name);
        System.out.println("英雄等级：" + level);
        System.out.println("英雄血量：" + blood);
        System.out.println("英雄种类：" + kind);
        System.out.println("英雄攻击力：" + power);
        System.out.println("英雄防御力：" + defence);
        System.out.println("========= 装备信息 =========");
        for (int i = 0; i < index; i++) {
            System.out.println("========= 第" + (i + 1) + "个装备 =========");
            equips[i].show();
        }
    }

    // 装备相关的Getter和Setter方法
    public Equip[] getEquips() {
        return equips;
    }

    public void setEquips(Equip[] equips) {
        this.equips = equips;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", blood=" + blood +
                ", kind='" + kind + '\'' +
                ", power=" + power +
                ", defence=" + defence +
                ", equipCount=" + index +
                '}';
    }
}
