package abstractfactory.scene.v5;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Description: 反射+抽象工厂模式+配置文件的 统一数据访问类 <br/>
 * 使用反射+抽象工厂模式模式，切换数据库时，仅需修改配置文件中的db配置即可
 *  消除了使用简单工厂模式中的switch分支语句
 *
 *  并且使用了读取配置文件的方式，解除了程序与直接数据库的耦合，切换数据库时，仅需修改配置文件即可
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/22 8:20
 */
public class DataAccess {

    public static Properties getDbConfig() throws Exception {
        Properties dbProperties = new Properties();
        File configFile = new File("src/main/java/abstractfactory/scene/v5/DataSource.properties");
        FileInputStream inputStream = new FileInputStream(configFile);
        dbProperties.load(inputStream);
        inputStream.close();
        return dbProperties;
    }

    public static UserDao createUserDao() throws Exception{
        String className = "abstractfactory.scene.v5."+getDbConfig().getProperty("db")+"UserDao";
        Class<?> clazz = Class.forName(className);
        UserDao userDao = (UserDao)clazz.getDeclaredConstructor().newInstance();
        return userDao;
    }

    public static DepartmentDao createDepartmentDao() throws Exception{
        String className = "abstractfactory.scene.v5."+getDbConfig().getProperty("db")+"DepartmentDao";
        Class<?> clazz = Class.forName(className);
        DepartmentDao departmentDao = (DepartmentDao)clazz.getDeclaredConstructor().newInstance();
        return departmentDao;
    }
}
