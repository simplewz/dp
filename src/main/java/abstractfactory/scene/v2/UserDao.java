package abstractfactory.scene.v2;

import abstractfactory.scene.common.User;

/**
 * Description: 操作数据库中用户表的接口类<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/19 15:00
 */
public interface UserDao {

    //新增用户
    public void insert(User user);

    //根据用户Id查找用户
    public User selectById(String id);

}
