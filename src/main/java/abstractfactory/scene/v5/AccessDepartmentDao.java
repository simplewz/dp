package abstractfactory.scene.v5;

import abstractfactory.scene.common.Department;

import java.util.UUID;

/**
 * Description: Access 操作部门表数据实现类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 15:59
 */
public class AccessDepartmentDao implements DepartmentDao {

    @Override
    public void insert(Department department) {
        System.out.println("在Access数据库中给department表添加一条记录！");
    }

    @Override
    public Department selectById(String id) {
        System.out.println("在Access数据库中根据id得到department表中的一条记录！");
        Department department = new Department(id, UUID.randomUUID().toString());
        return department;
    }
}
