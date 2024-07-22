package abstractfactory.scene.v3;

import abstractfactory.scene.common.Department;

import java.util.UUID;

/**
 * Description: SQL Server操作部门数据实现类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 15:57
 */
public class SQLServerDepartmentDao implements DepartmentDao{

    @Override
    public void insert(Department department) {
        System.out.println("在SQL Server数据库中给department表添加一条记录！");
    }

    @Override
    public Department selectById(String id) {
        System.out.println("在SQL Server数据库中根据id得到department表中的一条记录！");
        Department department = new Department(id, UUID.randomUUID().toString());
        return department;
    }
}
