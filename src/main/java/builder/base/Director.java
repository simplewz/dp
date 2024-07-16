package builder.base;

/**
 * Description: 指挥者类<br/>
 *  用来指挥建造过程
 *  构建一个使用Builder接口的对象
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/16 10:48
 */
public class Director {

    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }

}
