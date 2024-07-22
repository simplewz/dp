package abstractfactory.scene.v4;

/**
 * Description: 统一数据访问类 <br/>
 * 使用简单工厂模式改进抽象工厂模式，切换数据库时，仅需修改这里的db即可
 *  抛弃了DaoFactory、SQLServerDaoFactory、AccessDaoFactory接口类，减少了了新增数据库支持的代码量
 *  但是新增数据库支持时，仍然需要新增OracleUserDao和OracleDepartmentDao实现类，需要新增switch分支支持
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/22 8:20
 */
public class DataAccess {

    private static final String db = "SQLServer";

    public static UserDao createUserDao(){
        UserDao userDao = null;
        switch (db){
            case "SQLServer":
                userDao = new SQLServerUserDao();
                break;
            case "Access":
                userDao = new AccessUserDao();
                break;
            default:
                System.out.println("暂不支持的数据库类型");
        }
        return userDao;
    }

    public static DepartmentDao createDepartmentDao(){
        DepartmentDao departmentDao = null;
        switch (db){
            case "SQLServer":
                departmentDao = new SQLServerDepartmentDao();
                break;
            case "Access":
                departmentDao = new AccessDepartmentDao();
                break;
            default:
                System.out.println("暂不支持的数据库类型");
        }
        return departmentDao;
    }

}
