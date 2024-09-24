package flyweight.base;

/**
 *
 * Description: FlyWeight类：所有具体享元类的超类或接口，通过这个接口，FlyWeight可以接受并作用于外部状态<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/9/24 9:35
 */
public abstract class FlyWeight {

    public abstract void operation(int extrinsicstate);

}
