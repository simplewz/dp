package builder.scene.v3;

/**
 * Description: 客户端类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/16 10:26
 */
public class Client {

    public static void main(String[] args) {
        PersonDirector personDirector;
        PersonBuilder personBuilder;

        System.out.println("=========绘制瘦的游戏小人：");
        personBuilder = new PersonThinBuilder();
        //根据用户的选择构建瘦的小人
        personDirector = new PersonDirector(personBuilder);
        personDirector.createPerson();

        System.out.println("=========绘制胖的游戏小人(不会出现缺胳膊少腿的情况)：");
        personBuilder = new PersonFatBuilder();
        //根据用户的选择构建胖的小人
        personDirector = new PersonDirector(personBuilder);
        personDirector.createPerson();

    }
}
