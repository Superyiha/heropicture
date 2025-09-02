package day2;

/**
 * @desc 青蛙爬井问题
 * @author chenyi
 * @date 2025/9/2
 */
public class demo7 {
    public static void main(String[] args) {
        // 井的深度
        int wellDepth = 7;
        // 青蛙白天爬升的高度
        int dayClimb = 3;
        // 青蛙晚上滑落的高度
        int nightFall = 2;

        System.out.println("井深: " + wellDepth + "米");
        System.out.println("青蛙白天爬升: " + dayClimb + "米");
        System.out.println("青蛙晚上滑落: " + nightFall + "米");
        System.out.println("------------------------");

        int days = calculateDaysToClimb(wellDepth, dayClimb, nightFall);
        System.out.println("青蛙需要 " + days + " 天才能爬出这口井");
    }

    /**
     * 计算青蛙爬出井口需要的天数
     * @param wellDepth 井的深度
     * @param dayClimb 白天爬升的高度
     * @param nightFall 晚上滑落的高度
     * @return 需要的天数
     */
    public static int calculateDaysToClimb(int wellDepth, int dayClimb, int nightFall) {
        // 当前高度
        int currentHeight = 0;
        // 已用天数
        int days = 0;

        // 使用while循环模拟青蛙爬井过程
        while (currentHeight < wellDepth) {
            // 白天爬升
            currentHeight += dayClimb;
            days++;

            System.out.println("第" + days + "天白天: 爬升到 " + currentHeight + " 米");

            // 如果已经爬出井口，则结束
            if (currentHeight >= wellDepth) {
                System.out.println("第" + days + "天: 青蛙成功爬出井口!");
                break;
            }

            // 晚上滑落
            currentHeight -= nightFall;
            System.out.println("第" + days + "天晚上: 滑落到 " + currentHeight + " 米");
        }

        return days;
    }
}
