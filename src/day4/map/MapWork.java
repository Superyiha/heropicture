package day4.map;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author chenyi
 * @desc TODO
 * @date 2025/9/4
 */
public class MapWork {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入字符串：");
        //选择nextLine()可以接收含空格的字符串，next()遇到空格就被截断了
        String str = scanner.nextLine();

        //去除符号，只保留字母。
        //regex: 一个正则表达式，用来匹配你想要替换的字符。
        //[^a-zA-Z]：[]是匹配方括号中任意一个字符，^是非，a-zA-Z是匹配任意一个英文字母
        //replacement: 你想把匹配到的字符替换成什么。
        //这里的意思是把非英文字母的字符串都去除
        str.replaceAll("[^a-zA-Z]", "");

        //去除大小写，都变成小写
        //toLowerCase()是Java中String中的方法
        str = str.toLowerCase();

        //创建一个空的Map集合
        //这里创建TreeMap，而不是创建HashMap，因为后面输出的时候要按key排序输出
        // Map<Character, Integer> letterMap = new HashMap<>();
        Map<Character, Integer> letterMap = new TreeMap<>();

        //遍历统计每个字母出现的次数
        // */
        for (int i = 0; i < str.length(); i++) {
            // 使用 charAt(i) 获取索引 i 处的字符
            char ch = str.charAt(i);
            //判断 letterMap 中是否包含 ch 这个键
            if(!letterMap.containsKey(ch)) {
                letterMap.put(ch,1);
            } else {    //否则再次遇到次数+1
                //先获取次数
                Integer oldCount = letterMap.get(ch);
                //次数+1，次数更新
                Integer newCount = oldCount + 1;    //不写这句话有警告
                letterMap.put(ch,newCount);
            }
        }


        //keyset()返回的是一个包含所有Key的 Set 集合
        //get(key)获取key对应的值
        //错误写法
//        for (int i = 0; i < letterMap.size(); i++) {
//            System.out.println("字母" + letterMap.keySet() + "出现了" + letterMap.get(keySet()) + "次");
//        }


        //遍历输出正确写法
        //for-each 循环，这是遍历 Set 或 Collection 的标准方式。
        //思路：
        //1.先获取所有key的集合keys
        Set<Character> keys = letterMap.keySet();

        //2.使用 for-each 循环来一个一个地取出Set集合中的 key。
        System.out.println("----- 字母次数统计(按字母表顺序) -----");
        for (Character key : keys) {
            //拿到key后，用get(key)获取对应的值
            Integer value = letterMap.get(key);
            if(key != ' '){ //如果key不是空格
                System.out.println(key + "：" + value + "次");
            }
        }
    }
}
