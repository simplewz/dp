package composite.scene;

/**
 * 财务部
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/6 11:09
 */
public class FinanceDepartment extends Company{

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        System.out.println("财务部门下不能添加子公司！");
    }

    @Override
    public void remove(Company company) {
        System.out.println("财务部门下无子公司，不能进行删除子公司操作！");
    }

    @Override
    public void display(int depth) {
        StringBuffer sb = new StringBuffer();
        for(int i=1;i<=depth;i++){
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb.toString());
    }

    @Override
    public void duty() {
        System.out.println(String.format("%s:主要负责财务工作！",name));
    }
}
