package builder.scene.v1;

/**
 * Description: 绘制游戏人物类
 *
 *
 * <br/>
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/15 9:04
 */
public class DrawPerson {

    /**
     *  需求绘制一个游戏小人：要求有头、身体、两手、两脚
     */
    public void drawPerson(){
        System.out.println("画小人头部");
        System.out.println("画小人身体");
        System.out.println("画小人左手");
        System.out.println("画小人右手");
        System.out.println("画小人左脚");
        System.out.println("画小人右脚");
    }

    /**
     * 绘制一个瘦的小人
     */
    public void drawThinPerson(){
        System.out.println("画瘦小人头部");
        System.out.println("画瘦小人身体");
        System.out.println("画瘦小人左手");
        System.out.println("画瘦小人右手");
        System.out.println("画瘦小人左脚");
        System.out.println("画瘦小人右脚");
    }

    /**
     * 绘制一个胖的小人
     */
    public void drawFatPerson(){
        System.out.println("画胖小人头部");
        System.out.println("画胖小人身体");
        System.out.println("画胖小人左手");
        System.out.println("画胖小人右手");
        System.out.println("画胖小人左脚");
        //绘制过程中，由于画师疏忽，少画了一条腿
        //System.out.println("画胖小人右脚");
    }

    public static void main(String[] args) {
        DrawPerson draw = new DrawPerson();
        System.out.println("=========绘制正常游戏小人：");
        draw.drawPerson();
        System.out.println("=========绘制瘦的游戏小人：");
        draw.drawThinPerson();
        System.out.println("=========绘制胖的游戏小人：");
        draw.drawFatPerson();
    }
}
