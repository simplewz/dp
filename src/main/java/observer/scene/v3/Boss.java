package observer.scene.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: <br/>
 * Boss类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/17 15:57
 */
public class Boss extends Subject{

    private String name;


    public Boss() {
    }

    public Boss(String name) {
        this.name = name;
    }

    private List<Observer> observerList = new ArrayList<>();

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
