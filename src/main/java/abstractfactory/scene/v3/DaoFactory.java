package abstractfactory.scene.v3;

/**
 * Description: 数据访问工厂类<br/>
 * 集中返回需要访问的数据表数据访问接口
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 16:02
 */
public interface DaoFactory {

    //返回用户表数据库访问
    public UserDao createUserDao();

    //返回部门表数据库访问
    public DepartmentDao createDepartmentDao();

}
