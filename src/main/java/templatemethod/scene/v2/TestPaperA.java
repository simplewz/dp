package templatemethod.scene.v2;

/**
 * 学生甲抄写的试卷继承了试卷类，试题部分内容相同，仅在各自试题作答部分填入各自的答案即可
 * 但是每一个试题中还有相同的试题内容展示和作答逻辑
 */
public class TestPaperA extends TestPaper{

    //试题1
    public void testQuestion1(){
        //继承自试题公共类，所有学生试题内容相同
        super.testQuestion1();
        //学生作答，每个学生的作答内容不相同
        System.out.println("答案：a");
    }

    //试题2
    public void testQuestion2(){
        //继承自试题公共类，所有学生试题内容相同
        super.testQuestion2();
        //学生作答，每个学生的作答内容不相同
        System.out.println("答案：b");
    }

    //试题3
    public void testQuestion3(){
        //继承自试题公共类，所有学生试题内容相同
        super.testQuestion3();
        //学生作答，每个学生的作答内容不相同
        System.out.println("答案：c");
    }

}
