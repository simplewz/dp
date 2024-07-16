package builder.base;

/**
 * Description:具体建造者2 <br/>
 *      建造具体的两个部件是部件X和部件Y
 *    具体的建造者：实现Builder接口，构造和装配各个部件
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/16 10:45
 */
public class ConcreteBuilder2 extends Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        //装配部件A
        product.addPart("部件X");
    }

    @Override
    public void buildPartB() {
        //装配部件B
        product.addPart("部件Y");
    }

    @Override
    public Product getResult() {
        //装配完成后得到产品
        return product;
    }
}
