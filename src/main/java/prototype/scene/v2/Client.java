package prototype.scene.v2;

/**
 *  客户端类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/21 9:38
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume1 = new Resume("simple");
        resume1.setPersonInfo("男","29");
        resume1.setWorkExperience("2021.05-2024.06","XXX公司");

        //通过Clone方法产生新的对象
        Resume resume2 = (Resume)resume1.Clone();
        resume2.setWorkExperience("2024.07-2030.10","XXX公司");

        resume1.display();
        resume2.display();
    }

}
