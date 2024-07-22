package abstractfactory.scene.v5;

import abstractfactory.scene.common.Department;
import abstractfactory.scene.common.User;

/**
 * Description: <br/>
 * 使用反射+抽象工厂模式+配置文件方式访问数据库
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/22 8:27
 */
public class Client {

    public static void main(String[] args) throws Exception {
        User user = new User();
        Department department = new Department();

        UserDao userDao = DataAccess.createUserDao();
        userDao.insert(user);
        userDao.selectById("1");

        DepartmentDao departmentDao = DataAccess.createDepartmentDao();
        departmentDao.insert(department);
        departmentDao.selectById("1");
    }

}
