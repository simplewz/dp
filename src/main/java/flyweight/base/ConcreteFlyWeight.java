package flyweight.base;

/**
 * Description: 具体FlyWeight类，实现FlyWeight接口，并为内部状态增加存储空间<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/9/24 9:39
 */
public class ConcreteFlyWeight extends FlyWeight{

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("具体FlyWeight:"+extrinsicstate);
    }
}
