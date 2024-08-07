package iterator.base;

/**
 * Description:逆序遍历的迭代器 <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/7 10:10
 */
public class ConcreteDescIterator extends Iterator{

    //迭代器遍历的聚集对象
    private ConcreteAggregate aggregate;

    private int current = 0;

    //初始化时将具体的聚集对象传入
    public ConcreteDescIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        current = aggregate.count()-1;
    }

    //获取聚集对象的第一个元素
    @Override
    public Object first() {
        return aggregate.getObject(aggregate.count()-1);
    }

    //获取聚集对象的下一个元素
    @Override
    public Object next() {
        Object ret = null;
        current--;
        if(current>=0){
            ret = aggregate.getObject(current);
        }
        return ret;
    }

    //判断聚集对象是否遍历完成
    @Override
    public boolean isDone() {
        return current<0;
    }

    //获取当前对象
    @Override
    public Object currentItem() {
        return aggregate.getObject(current);
    }
}
