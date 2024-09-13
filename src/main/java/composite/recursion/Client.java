package composite.recursion;

import java.util.Map;

/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/9/4 8:46
 */
public class Client {

    public static void main(String[] args) {
        // 创建部门树
        Department root = new Department("总部");
        root.setData("sales", 1000);
        root.setData("employees", 100);

        Department deptA = new Department("部门A");
        deptA.setData("sales", 500);
        deptA.setData("employees", 50);

        Department subDeptA1 = new Department("子部门A1");
        subDeptA1.setData("sales", 200);
        subDeptA1.setData("employees", 20);

        Department subDeptA2 = new Department("子部门A2");
        subDeptA2.setData("sales", 300);
        subDeptA2.setData("employees", 30);

        Department deptB = new Department("部门B");
        deptB.setData("sales", 600);
        deptB.setData("employees", 60);

        deptA.addChild(subDeptA1);
        deptA.addChild(subDeptA2);
        root.addChild(deptA);
        root.addChild(deptB);

        // 统计总销售额和员工数
        Map<String, Integer> totals = DepartmentStats.aggregateData(root);
        System.out.println("Root department after aggregation: " + root);
        System.out.println("Department A after aggregation: " + deptA);
        System.out.println("Total sales: " + totals.get("sales"));
        System.out.println("Total employees: " + totals.get("employees"));
    }

}
