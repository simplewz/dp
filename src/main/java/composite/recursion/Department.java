package composite.recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/9/4 8:43
 */
public class Department {

    private String name;
    private Map<String, Integer> data;
    private List<Department> children;

    public Department(String name) {
        this.name = name;
        this.data = new HashMap<>();
        this.children = new ArrayList<>();
    }

    public void setData(String key, int value) {
        this.data.put(key, value);
    }

    public int getData(String key) {
        return this.data.getOrDefault(key, 0);
    }

    public void addChild(Department child) {
        this.children.add(child);
    }

    public List<Department> getChildren() {
        return this.children;
    }

    public Map<String, Integer> getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", data=" + data +
                '}';
    }

}
