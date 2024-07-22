package abstractfactory.scene.v4;

import abstractfactory.scene.common.Department;
import abstractfactory.scene.common.User;

/**
 * Description: <br/>
 * 使用简单工厂模式改进抽象工厂模式，切换数据库时，仅需修改DataAccess里的db即可
 * 抛弃了DaoFactory、SQLServerDaoFactory、AccessDaoFactory接口类，减少了了新增数据库支持的代码量
 * 但是新增数据库支持时，仍然需要新增OracleUserDao和OracleDepartmentDao实现类，以及在DataAccess中新增switch分支
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/22 8:27
 */
public class Client {

    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        //直接得到实际数据库访问实例，而不存在任何依赖
        UserDao userDao = DataAccess.createUserDao();
        userDao.insert(user);
        userDao.selectById("1");

        DepartmentDao departmentDao = DataAccess.createDepartmentDao();
        departmentDao.insert(department);
        departmentDao.selectById("1");
    }

}
