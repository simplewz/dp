package prototype.scene.v5;

/**
 * 序列化实现对象的深拷贝
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/21 10:54
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Resume resume1 = new Resume("simple");
        resume1.setPersonInfo("男","29");
        resume1.setWorkExperience("2021.05-2024.06","XXX公司");

        Resume resume2 = (Resume)resume1.Clone();
        resume2.setWorkExperience("2024.07-2030.10","XXX公司");

        resume1.display();
        resume2.display();

        /**
         * 这里我们期望输出：
         *    simple 男 29
         *    工作经历：2021.05-2024.06 XXX公司
         *    simple 男 29
         *    工作经历：2024.07-2030.10 XXX公司
         * 实际输出：
         *    simple 男 29
         *    工作经历：2021.05-2024.06 XXX公司
         *    simple 男 29
         *    工作经历：2024.07-2030.10 XXX公司
         */
    }

}
