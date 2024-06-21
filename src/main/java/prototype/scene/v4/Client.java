package prototype.scene.v4;

/**
 * 对象深度拷贝方式一：引用类型的类实现Cloneable接口，并实现Clone方法
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/21 10:54
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
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
         * 实际输出与期望输出一致，因为Resume的引用类型WorkExperience也实现了Cloneable接口，在对象Clone时，调用Resume类的私有构造器时传入了
         * 原始对象的WorkExperience对象，在其中实现了引用对象的克隆，并且将原始对象的属性值逐位复制到克隆对象中，所以能实现预期输出
         * 这种方式的缺点是：对象的克隆链很长时，所有的引用对象类型都需要进行克隆操作
         */
    }

}
