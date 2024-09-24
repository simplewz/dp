package flyweight.base;

/**
 * Description: 不需要共享的FlyWeight子类。因为FlyWeight接口共享成为可能，但它并不强制恭喜那个<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/9/24 9:42
 */
public class UnSharedConcreteFlyWeight extends FlyWeight{

    @Override
    public void operation(int extrinsicstate) {
        System.out.println("不共享的具体FlyWeight："+extrinsicstate);
    }
}
