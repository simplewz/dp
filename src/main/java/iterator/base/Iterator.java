package iterator.base;

/**
 * Description: 迭代器抽象类<br/>
 * 迭代器起封装了集合遍历的方式
 * 定义得到开始对象、得到下一个对象、判断是否到结尾、当前对象等抽象方法
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/7 10:02
 */
public abstract class Iterator {
    //开始对象
    public abstract Object first();

    //下一对象
    public abstract Object next();

    //是否到结尾
    public abstract boolean isDone();

    //当前对象
    public abstract Object currentItem();

}
