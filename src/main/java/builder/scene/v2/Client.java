package builder.scene.v2;

/**
 * Description: 客户端类<br/>
 * 这种方式达到了绘制瘦的小人和绘制胖的小人的绘制逻辑代码的分离与复用
 * 但是没有解决绘制过程中由于画师不小心导致缺胳膊少腿的问题依然存在
 * 即绘制的过程不稳定
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/16 10:12
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("=========绘制瘦的游戏小人：");
        PersonThinBuilder thinBuilder = new PersonThinBuilder();
        thinBuilder.build();
        System.out.println("=========绘制瘦的游戏小人(缺少右腿)：");
        PersonFatBuilder fatBuilder = new PersonFatBuilder();
        fatBuilder.build();
    }

}
