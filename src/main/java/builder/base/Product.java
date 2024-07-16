package builder.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 产品类<br/>
 *  由多个部件组成
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/16 10:38
 */
public class Product {

    /**
     * 产品部件集合
     */
    private List<String> partList = new ArrayList<>();

    public void addPart(String part){
        partList.add(part);
    }

    /**
     * 产品展示产品的所有部件
     */
    public void show(){
        for(String part:partList){
            System.out.println(part);
        }
    }

}
