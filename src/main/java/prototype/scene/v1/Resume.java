package prototype.scene.v1;

/**
 * 个人简历类v1
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/6/21 9:29
 */
public class Resume {

    //姓名
    private String name;

    //性别
    private String sex;

    //年龄
    private String age;

    //工作时间
    private String timeArea;

    //公司
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    //设置个人信息
    public void setPersonInfo(String sex,String age){
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWorkExperience(String timeArea,String company){
        this.timeArea = timeArea;
        this.company = company;
    }

    //简历展示
    public void  display(){
        System.out.println( name+" "+sex+" "+age);
        System.out.println("工作经历："+timeArea+" "+company);
    }

}
