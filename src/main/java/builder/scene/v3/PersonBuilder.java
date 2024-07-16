package builder.scene.v3;

/**
 * Description: 抽象的构造人的类，其中定义了构造人的整个过程中每一步的抽象方法<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/16 10:01
 */
public abstract class PersonBuilder {

    /**
     * 构建头部
     */
    public abstract void buildHead();

    /**
     * 构建身体
     */
    public abstract void buildBody();

    /**
     * 构建左手
     */
    public abstract void buildLeftArm();

    /**
     * 构建右手
     */
    public abstract void buildRightArm();

    /**
     * 构建左腿
     */
    public abstract void buildLeftLeg();

    /**
     * 构建右腿
     */
    public abstract void buildRightLeg();

}
