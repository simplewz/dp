package builder.base;

/**
 * Description: 抽象建造者类
 *      1.确定创建产品由两个部件PartA和PartB组成
 *      2.并声明一个最后得到产品的方法
 *
 *   为创建一个Product对象的各个部件指定的抽象接口
 * <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/16 10:36
 */
public abstract class Builder {

    /**
     * 产品部件A的构建过程
     */
    public abstract void buildPartA();

    /**
     * 产品部件B的构建过程
     */
    public abstract void buildPartB();

    /**
     * 构建完成后得到产品方法
     * @return
     */
    public abstract Product getResult();

}
