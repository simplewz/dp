package abstractfactory.scene.v2;

/**
 * Description: 实现UserDaoFactory,底层采用SQL Server为数据库<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 15:10
 */
public class SQLServerUserDaoFactory implements UserDaoFactory{

    @Override
    public UserDao createUserDao() {
        return new SQLServerUserDao();
    }
}
