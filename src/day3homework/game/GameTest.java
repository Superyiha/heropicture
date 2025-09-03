package day3homework.game;

/**
 * @author chenyi
 * @desc TODO
 * @date 2025/9/3
 */
public class GameTest {

    public static void main(String[] args) {
        System.out.println("========= 游戏开始 =========");

        // 创建英雄
        Hero hero = new Hero("勇者阿尔托", 10, 1000, "人类", 150, 80);

        // 创建怪兽
        Monster monster = new Monster("邪恶巨龙", 12, 800, "龙族", 120, 60);

        // 创建装备
        Equip sword = new Equip("炎之剑", 5, "红色", "武器", 50, 10);
        Equip armor = new Equip("钢铁护甲", 4, "银色", "防具", 0, 40);
        Equip ring = new Equip("力量之戒", 3, "金色", "饰品", 20, 5);

        // 英雄装备装备
        System.out.println("\n========= 英雄装备阶段 =========");
        hero.addEquip(sword);
        hero.addEquip(armor);
        hero.addEquip(ring);

        // 显示角色信息
        System.out.println("\n========= 战前状态 =========");
        hero.show();
        System.out.println();
        monster.show();

        // 模拟战斗 - 演示多态性
        System.out.println("\n========= 战斗开始 =========");

        // 使用多态 - Role类型的引用指向子类对象
        Role[] fighters = {hero, monster};

        int round = 1;
        while (!hero.isDead() && !monster.isDead()) {
            System.out.println("\n--- 第" + round + "回合 ---");

            // 英雄攻击怪兽
            hero.attack(monster);
            if (monster.isDead()) {
                System.out.println("怪兽" + monster.getName() + "被击败了！");
                break;
            }

            // 怪兽攻击英雄
            monster.attack(hero);
            if (hero.isDead()) {
                System.out.println("英雄" + hero.getName() + "战败了！");
                break;
            }

            round++;

            // 防止无限循环
            if (round > 20) {
                System.out.println("战斗时间过长，平局！");
                break;
            }
        }

        // 战斗结果
        System.out.println("\n========= 战斗结束 =========");
        System.out.println("最终状态：");
        System.out.println("英雄血量：" + hero.getBlood());
        System.out.println("怪兽血量：" + monster.getBlood());

        // 演示多态性 - 统一处理不同类型的角色
        System.out.println("\n========= 多态演示 =========");
        demonstratePolymorphism(hero);
        demonstratePolymorphism(monster);
    }

    /**
     * 演示多态性的方法
     * @param role 角色对象（可以是Hero或Monster）
     */
    public static void demonstratePolymorphism(Role role) {
        System.out.println("\n角色类型：" + role.getClass().getSimpleName());
        System.out.println("角色名称：" + role.getName());
        System.out.println("是否死亡：" + (role.isDead() ? "是" : "否"));

        // 调用子类重写的show方法
        role.show();
    }
}