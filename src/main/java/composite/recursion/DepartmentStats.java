package composite.recursion;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/9/4 8:44
 */
public class DepartmentStats {

    public static Map<String, Integer> aggregateData(Department department) {
        Map<String, Integer> totalData = new HashMap<>(department.getData());

        for (Department child : department.getChildren()) {
            Map<String, Integer> childData = aggregateData(child);
            for (Map.Entry<String, Integer> entry : childData.entrySet()) {
                totalData.merge(entry.getKey(), entry.getValue(), Integer::sum);
            }
        }

        // 更新中间节点的数据
        Iterator<String> iterator = totalData.keySet().iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            department.setData(next,totalData.get(next));
        }
        return totalData;
    }
}
