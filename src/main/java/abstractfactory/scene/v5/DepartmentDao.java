package abstractfactory.scene.v5;

import abstractfactory.scene.common.Department;

/**
 * Description: 操作数据库部门表接口<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 15:53
 */
public interface DepartmentDao {

    public void insert(Department department);

    public Department selectById(String id);

}
