package composite.scene;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体公司类，有自己独立的部门
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/6 11:03
 */
public class ConcreteCompany extends Company{

    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        //本级公司展示
        StringBuffer sb = new StringBuffer();
        for(int i=1;i<=depth*2-1;i++){
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb.toString());

        //遍历下级公司级部门进行展示
        for (Company child:children) {
            if(child instanceof FinanceDepartment||child instanceof HRDepartment){
                StringBuffer childrenSb = new StringBuffer();
                for(int i=1;i<=depth*2+1;i++){
                    childrenSb.append("-");
                }
                childrenSb.append(child.name);
                System.out.println(childrenSb.toString());
            }else{
                child.display(depth+1);
            }
        }
    }

    @Override
    public void duty() {
        for (Company children:children) {
            children.duty();
        }
    }
}
