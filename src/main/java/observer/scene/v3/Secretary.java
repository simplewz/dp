package observer.scene.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 16:11
 */
public class Secretary extends Subject{

    private String name;

    private List<Observer> observerList = new ArrayList<>();

    public Secretary() {
    }

    public Secretary(String name) {
        this.name = name;
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void inform() {
        for(Observer observer:observerList){
            observer.update();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
