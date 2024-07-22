package abstractfactory.scene.v3;

/**
 * Description: <br/>
 * 集中返回SQLServer数据访问表的实现类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 16:06
 */
public class SQLServerDaoFactory implements DaoFactory{

    @Override
    public UserDao createUserDao() {
        return new SQLServerUserDao();
    }

    @Override
    public DepartmentDao createDepartmentDao() {
        return new SQLServerDepartmentDao();
    }
}
