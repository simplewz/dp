package builder.scene.v3;

/**
 * Description: 构造人的指挥者类<br/>
 * 使用这会这类来控制建造过程，也用它来隔离用户与建造过程的关联
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/16 10:18
 */
public class PersonDirector {

    private PersonBuilder personBuilder;

    //在创建指挥者对象时，客户传入具体建造者告知需要建造什么样的人(胖的、瘦的、高的、矮的)
    public PersonDirector(PersonBuilder personBuilder) {
        this.personBuilder = personBuilder;
    }

    /**
     * 1.根据用户的选择建造小人,建造的过程在这里完成，用户不需要知道
     * 2.建造的过程稳定，不会出现缺胳膊少腿的情况发生
     */
    public void createPerson(){
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildLeftArm();
        personBuilder.buildRightArm();
        personBuilder.buildLeftLeg();
        personBuilder.buildRightLeg();
    }

}
