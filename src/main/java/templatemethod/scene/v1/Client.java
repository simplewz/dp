package templatemethod.scene.v1;

/**
 * 试题与答案耦合在一起：
 *      1.针对不同的学生，仅是答案不同，所以应将试题和答案进行分离，将试题部分抽取到一个公共的父类中，防止学生抄错题目。
 *      2.老师需要修改题目时，所有学生抄的题目都要改，代码改动量大。
 * 客户端类
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("学生甲抄写的试卷：");
        TestPaperA studentA = new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();

        System.out.println("====================================");

        System.out.println("学生乙抄写的试卷：");
        TestPaperB studentB = new TestPaperB();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }

}
