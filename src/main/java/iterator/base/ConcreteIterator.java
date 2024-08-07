package iterator.base;

/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/7 10:10
 */
public class ConcreteIterator extends Iterator{

    //迭代器遍历的聚集对象
    private ConcreteAggregate aggregate;

    private int current = 0;

    //初始化时将具体的聚集对象传入
    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    //获取聚集对象的第一个元素
    @Override
    public Object first() {
        return aggregate.getObject(0);
    }

    //获取聚集对象的下一个元素
    @Override
    public Object next() {
        Object ret = null;
        current++;
        if(current<aggregate.count()){
            ret = aggregate.getObject(current);
        }
        return ret;
    }

    //判断聚集对象是否遍历完成
    @Override
    public boolean isDone() {
        return current>=aggregate.count();
    }

    //获取当前对象
    @Override
    public Object currentItem() {
        return aggregate.getObject(current);
    }
}
