package templatemethod.scene.v3;

/**
 * 学生乙抄写的试卷继承了试卷类，试题部分内容相同，仅在各自试题作答部分填入各自的答案即可
 * 实现了每个试题的作答方法
 */
public class TestPaperB extends TestPaper {

    @Override
    public String answerQuestion1() {
        return "d";
    }

    @Override
    public String answerQuestion2() {
        return "b";
    }

    @Override
    public String answerQuestion3() {
        return "a";
    }
}
