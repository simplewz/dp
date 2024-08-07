package iterator.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 客户端类<br/>
 *
 * 迭代器模式：提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示
 * 当需要访问一个对象集合，而且不管这些对象是什么都需要遍历的时候，就应该考虑使用迭代器模式
 *
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/7 14:10
 */
public class Client {

    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        List<Object> elementList = new ArrayList<>();
        elementList.add("大鸟");
        elementList.add("小菜");
        elementList.add("行李");
        elementList.add("老外");
        elementList.add("公交内部员工");
        elementList.add("小偷");

        concreteAggregate.setItemList(elementList);

        Iterator iterator = concreteAggregate.createIterator();
        while (!iterator.isDone()){
            System.out.println(String.format("%s请买车票！",iterator.currentItem()));
            iterator.next();
        }
    }

}
