package command.scene.v3;

/**
 * Description: 烤羊肉串命令<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/9 15:55
 */
public class BakeMuttonCommand extends Command{

    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void bake(int count) {
        barbecuer.bakeMutton(count);
    }
}
