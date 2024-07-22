package abstractfactory.scene.v2;

/**
 * Description: 访问user表的抽象工厂接口<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 15:06
 */
public interface UserDaoFactory {

    public UserDao createUserDao();

}
