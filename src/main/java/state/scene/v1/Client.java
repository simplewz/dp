package state.scene.v1;

/**
 * Description: 面向过程的工作状态<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/23 14:24
 */
public class Client {

    private static int hour;

    private static boolean finish;

    public static void main(String[] args) {
        hour = 9;
        coding();
        hour = 10;
        coding();
        hour = 11;
        coding();
        hour = 13;
        coding();
        hour = 14;
        coding();

        hour = 17;
        //finish = true;
        finish = false;
        coding();
        hour = 19;
        coding();
        hour = 22;
        coding();
    }

    //根据时间的不同体现
    public static void coding(){
        if(hour<10){
            System.out.println(String.format("当前时间：%s 点,上午工作，精神百倍",hour));
        }else if(hour<12){
            System.out.println(String.format("当前时间：%s 点,饿了，不想写",hour));
        }else if(hour<14){
            System.out.println(String.format("当前时间：%s 点,午休犯困",hour));
        }else if(hour<17){
            System.out.println(String.format("当前时间：%s 点,下午状态还不错，继续努力！",hour));
        }else {
            if(finish){
                //如果工作完成了，下班回家
                System.out.println(String.format("当前时间：%s 点,开心下班回家",hour));
            }else {
                //工作没完成，加班
                if(hour<21){
                    System.out.println(String.format("当前时间：%s 点,加班中，好累",hour));
                }else {
                    System.out.println(String.format("当前时间：%s 点,扛不住了，睡着了",hour));
                }
            }
        }
    }

}
