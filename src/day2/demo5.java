package day2;

/**
 * @desc 乘法口诀表
 * @author chenyi
 * @date 2025/9/2
 */
public class demo5 {
    public static void main(String[] args) {
        System.out.println("乘法口诀表:");
        printMultiplicationTable();
    }

    /**
     * 打印九九乘法口诀表
     */
    public static void printMultiplicationTable() {
        // 外层循环控制行数（被乘数）
        for (int i = 1; i <= 9; i++) {
            // 内层循环控制每行的列数（乘数）
            for (int j = 1; j <= i; j++) {
                // 计算乘积并格式化输出
                int result = i * j;
                System.out.print(j + "*" + i + "=" + result + "\t");
            }
            // 每行结束后换行
            System.out.println();
        }
    }
}
