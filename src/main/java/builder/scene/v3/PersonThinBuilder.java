package builder.scene.v3;

/**
 * Description:瘦的小人构造类 <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/16 10:09
 */
public class PersonThinBuilder extends PersonBuilder{

    @Override
    public void buildHead() {
        System.out.println("构造瘦的小人的头部");
    }

    @Override
    public void buildBody() {
        System.out.println("构造瘦的小人的身体");
    }

    @Override
    public void buildLeftArm() {
        System.out.println("构造瘦的小人的左手");
    }

    @Override
    public void buildRightArm() {
        System.out.println("构造瘦的小人的右手");
    }

    @Override
    public void buildLeftLeg() {
        System.out.println("构造瘦的小人的左腿");
    }

    @Override
    public void buildRightLeg() {
        System.out.println("构造瘦的小人的右腿");
    }
}
