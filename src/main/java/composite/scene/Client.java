package composite.scene;

/**
 * 客户端类
 * 组合模式的好处：组合模式可以让客户一致使用组合对象和单个对象
 *     定义了包含人力资源部和财务部这些基本对象和分公司、办事处等组合对象的类层次结构。
 *     基本对象可以被组合对象组成更复杂的组合对象，而这个组合对象又可以被组合，不断递归组合
 *     客户端代码中，任何用到基本对象的地方都可以使用组合对象，不必关心到底是处理一个叶节点还是处理一个组合对象，消除了客户端中的选择判断语句
 *
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/6 11:17
 */
public class Client {

    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        HRDepartment rootHrDept = new HRDepartment("北京总公司人力资源部");
        FinanceDepartment rootFinDept = new FinanceDepartment("北京总公司财务部");
        root.add(rootHrDept);
        root.add(rootFinDept);

        ConcreteCompany shanghai = new ConcreteCompany("上海分公司");
        HRDepartment shanghaiHrDept = new HRDepartment("上海分公司人力资源部");
        FinanceDepartment shanghaiFinDept = new FinanceDepartment("上海分公司财务部");
        shanghai.add(shanghaiHrDept);
        shanghai.add(shanghaiFinDept);

        root.add(shanghai);

        ConcreteCompany nanjing = new ConcreteCompany("南京分公司");
        HRDepartment nanjingHrDept = new HRDepartment("南京分公司人力资源部");
        FinanceDepartment nanjingFinDept = new FinanceDepartment("南京分公司财务部");
        nanjing.add(nanjingHrDept);
        nanjing.add(nanjingFinDept);

        root.add(nanjing);

        ConcreteCompany hangzhou = new ConcreteCompany("杭州办事处");
        HRDepartment hangzhouHrDept = new HRDepartment("杭州办事处人力资源部");
        FinanceDepartment hangzhouFinDept = new FinanceDepartment("杭州办事处财务部");
        hangzhou.add(hangzhouHrDept);
        hangzhou.add(hangzhouFinDept);

        root.add(hangzhou);

        root.display(1);
        root.duty();
    }

}
