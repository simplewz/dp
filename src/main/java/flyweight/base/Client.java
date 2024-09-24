package flyweight.base;

/**
 * Description: 客户端类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/9/24 9:52
 */
public class Client {

    public static void main(String[] args) {
        //外部状态代码
        int extrinsicstate = 22;

        FlyWeightFactory factory = new FlyWeightFactory();

        FlyWeight fx = factory.getFlyWeight("X");
        fx.operation(--extrinsicstate);

        FlyWeight fy = factory.getFlyWeight("Y");
        fy.operation(--extrinsicstate);

        FlyWeight fz = factory.getFlyWeight("Z");
        fz.operation(--extrinsicstate);

        UnSharedConcreteFlyWeight uf = new UnSharedConcreteFlyWeight();
        uf.operation(--extrinsicstate);

    }

}
