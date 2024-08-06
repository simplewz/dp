package composite.base;

/**
 * Leaf在组合中表示叶节点对象，叶节点没有子节点
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/5 9:05
 */
public class Leaf extends Component{

    public Leaf(String name) {
        super(name);
    }

    //由于叶节点没有再增加分支和树叶，所以add个remove方法实现它没有意义，但这样做可以消除叶节点和枝节点对象在抽象层次的区别，它们具备完全一致的接口
    @Override
    public void add(Component component) {
        System.out.println("不能在叶节点中添加子节点！");
    }

    @Override
    public void remove(Component component) {
        System.out.println("不能从叶节点中移除子节点");
    }

    //叶节点的具体方法，此处显示其名称和级别
    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer();
        for(int i=1;i<=depth;i++){
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb.toString());
    }
}
