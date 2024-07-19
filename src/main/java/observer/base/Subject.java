package observer.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: <br/>
 * 主题(抽象通知者)：一般用一个抽象类或接口实现
 *  它把所有对观察者对象的引用保存在一个集合中，每个主题都可以有任何数量的观察者
 *  抽象主题提供一个接口，可以增加和删除观察者
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 16:35
 */
public abstract class Subject {

    private List<Observer> observerList = new ArrayList<>();

    //新增观察者
    public void attach(Observer observer){
        observerList.add(observer);
    }

    //移除观察者
    public void detach(Observer observer){
        observerList.remove(observer);
    }

    //通知
    public void inform(){
        for(Observer observer:observerList){
            //观察者更新
            observer.update();
        }
    }

}
