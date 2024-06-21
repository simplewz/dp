package prototype.base;

/**
 * 原型类，需要实现Cloneable接口
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/21 9:51
 */
public abstract class Prototype implements Cloneable{

    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //定义一个抽象克隆方法，根据自身返回克隆对象
    public abstract Prototype Clone() throws CloneNotSupportedException;

}
