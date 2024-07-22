package abstractfactory.scene.v3;

/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 16:11
 */
public class AccessDaoFactory implements DaoFactory{

    @Override
    public UserDao createUserDao() {
        return new AccessUserDao();
    }

    @Override
    public DepartmentDao createDepartmentDao() {
        return new AccessDepartmentDao();
    }
}
