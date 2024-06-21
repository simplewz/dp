package prototype.scene.v4;

/**
 * 引用对象类型实现Cloneable接口并添加Clone方法，实现引用对象类型的深拷贝
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/21 10:51
 */
public class WorkExperience implements Cloneable {

    //工作时间
    private String timeArea;

    //公司
    private String company;

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Object Clone() throws CloneNotSupportedException {
        return this.clone();
    }
}
