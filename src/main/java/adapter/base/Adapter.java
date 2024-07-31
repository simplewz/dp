package adapter.base;

/**
 * Description: 适配器<br/>
 * 继承Target类/实现Target接口，并在内部包装一个Adaptee对象，把源接口转换为目标接口
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/31 9:29
 */
public class Adapter extends Target{

    //建立一个私有adaptee对象
    private Adaptee adaptee;

    public Adapter() {
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    //重写target对象的request方法，表面上调用的是request方法，底层调用adaptee对象的方法
    @Override
    public void request() {
        adaptee.specificRequest();
    }

    public Adaptee getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
