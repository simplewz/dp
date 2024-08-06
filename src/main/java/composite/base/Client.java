package composite.base;

/**
 * 客户端类
 *
 * 组合模式:将对象组合成树形结构以表示'部分-整体'的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 * 透明方式：在Component中声明所有用来管理子对象的方法add()、remove()，叶节点和枝节点都实现其中的方法
 *         优点：所有叶节点和枝节点都实现了Component接口中的抽象方法，叶节点和枝节点对外界没有区别，具备完全一直的接口行为
 *         缺点：叶节点本身不具备add()、remove()方法的功能，实现没有意义。
 * 安全方式：在Component中不去声明用来管理子对象的方法add()、remove()，子类Leaf类不用去实现，而是在Composite中声明用来管理子类对象的方法
 *         优点：叶节点不用去实现管理子类对象接口方法add()、remove()
 *         缺点：叶节点和枝节点不具备相同的接口行为，客户端在调用时需要进行判断
 * 何时使用组合模式？
 *   1.需求中体现部分与整体层次结构
 *   2.可以忽略组合对象与单个对象的不同、统一使用组合结构中的所有对象
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/5 9:26
 */
public class Client {

    public static void main(String[] args) {
        //生成根节点
        Composite root = new Composite("root");
        //根节点上长出两个叶节点A、叶节点B
        Leaf rootLeafA = new Leaf("Leaf A");
        Leaf rootLeafB = new Leaf("Leaf B");
        root.add(rootLeafA);
        root.add(rootLeafB);

        //根节点上长出分支Composite X
        Composite compositeX = new Composite("Composite X");
        //枝节点Composite X上长出两个叶节点Leaf XA、Leaf XB
        Leaf compositeLeafXA = new Leaf("Leaf XA");
        Leaf compositeLeafXB = new Leaf("Leaf XB");
        compositeX.add(compositeLeafXA);
        compositeX.add(compositeLeafXB);

        //分支Composite X上长出枝节点Composite XY
        Composite compositeXY = new Composite("Composite XY");
        //枝节点Composite XY上长出两个叶节点Leaf XYA、Leaf XYB
        Leaf compositeLeafXYA = new Leaf("Leaf XYA");
        Leaf compositeLeafXYB = new Leaf("Leaf XYB");
        compositeXY.add(compositeLeafXYA);
        compositeXY.add(compositeLeafXYB);

        //将枝节点Composite XY挂接到枝节点Composite X下
        compositeX.add(compositeXY);

        //将枝节点Composite X挂接到根节点root下
        root.add(compositeX);

        //根节点下长出两个叶节点C、D
        Leaf rootLeafC = new Leaf("Leaf C");
        root.add(rootLeafC);

        Leaf rootLeafD = new Leaf("Leaf D");
        root.add(rootLeafD);

        //root.remove(rootLeafD);

        root.display(1);
    }

}
