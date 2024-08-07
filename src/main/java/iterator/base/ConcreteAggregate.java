package iterator.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 具体聚集类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/7 10:10
 */
public class ConcreteAggregate extends Aggregate{

    private List<Object> itemList = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        //return new ConcreteIterator(this);
        return new ConcreteDescIterator(this);
    }

    public int count(){
        return itemList.size();
    }

    public Object getObject(int index){
        return itemList.get(index);
    }

    public void setItemList(List<Object> itemList) {
        this.itemList = itemList;
    }

    public List<Object> getItemList() {
        return itemList;
    }
}
