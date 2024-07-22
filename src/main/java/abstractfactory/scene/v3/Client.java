package abstractfactory.scene.v3;

import abstractfactory.scene.common.Department;
import abstractfactory.scene.common.User;

/**
 * Description: 使用抽象工厂模式访问数据库<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 16:12
 */
public class Client {

    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        DaoFactory daoFactory = new AccessDaoFactory();

        UserDao userDao = daoFactory.createUserDao();
        userDao.insert(user);
        userDao.selectById("1");

        DepartmentDao departmentDao = daoFactory.createDepartmentDao();
        departmentDao.insert(department);
        departmentDao.selectById("1");
    }

}
