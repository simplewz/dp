package composite.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite定义枝节点行为，用来存储子部件，在Component接口实现与子部件相关的操作
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/5 9:16
 */
public class Composite extends Component{

    //子对象集合，用来存储其下的枝节点和叶节点
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    //显示枝节点名称并对下级进行遍历
    @Override
    public void display(int depth) {
        //本级节点展示
        StringBuffer sb = new StringBuffer();
        for(int i=1;i<=depth*2-1;i++){
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb.toString());

        //遍历下级节点进行展示
        for (Component component:children) {
            if(component instanceof Leaf){
                StringBuffer childrenSb = new StringBuffer();
                for(int i=1;i<=depth*2+1;i++){
                    childrenSb.append("-");
                }
                childrenSb.append(component.name);
                System.out.println(childrenSb.toString());
            }else{
                component.display(depth+1);
            }
        }
    }
}
