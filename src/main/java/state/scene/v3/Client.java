package state.scene.v3;

/**
 * Description: <br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/31 8:18
 */
public class Client {

    public static void main(String[] args) {
        Work emergencyProject = new Work();
        emergencyProject.setWorkState(new ForenoonState("早上上班，精神百倍！"));
        emergencyProject.setHour(9);
        emergencyProject.coding();
        emergencyProject.setHour(10);
        emergencyProject.coding();
        emergencyProject.setHour(13);
        emergencyProject.coding();
        emergencyProject.setHour(14);
        emergencyProject.coding();

        emergencyProject.setHour(17);
        //emergencyProject.setFinish(true);
        emergencyProject.setFinish(false);
        emergencyProject.coding();
        emergencyProject.setHour(19);
        emergencyProject.coding();
        emergencyProject.setHour(22);
        emergencyProject.coding();
    }

}
