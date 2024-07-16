package builder.base;

/**
 * Description: 客户端类<br/>
 * Builder类：为创建一个Product对象的各个部件指定抽象接口
 * ConcreteBuilder:具体的建造者
 * Director：拥有客户产品建造者的引用，用户可通过该类决定建造什么样的产品
 * Product:产品类
 *
 * 建造者适用的场景：用于创建一些复杂的对象，这些对象内部构建间的建造顺序通常是稳定的，但是对象内部的构建通常面临着复杂变化
 *      例如：建造车辆的过程，安装发动机和安装轮胎是建造车的两个稳定的过程
 *          但是不同的品牌的车使用的发送机型号与轮胎品牌不一样
 *          有的车使用的发动机型号是A,有的车使用的发动及型号是B
 *          有的车使用的轮胎品牌是M,有的车使用的发动及型号是N
 *        但从生产流程上来说，一部车的生产必须要经过安装发动机和安装轮胎这两个工艺步骤
 *        只是每个工艺步骤使用的产品是不同的
 *        此时就可以使用建造者模式
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/16 10:49
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        director.construct(b1);
        Product product1 = b1.getResult();
        product1.show();

        director.construct(b2);
        Product product2 = b2.getResult();
        product2.show();

    }

}
