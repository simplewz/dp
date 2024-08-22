package mediator.scene;

/**
 * Description: 联合国安全理事会<br/>
 *
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/8/22 16:26
 */
public class UnitedNationsSecurity extends UnitedNations{

    private USA usa;

    private Iraq iraq;

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    public void declare(String message, Country country) {
        if(country==usa){
            iraq.getMessage(message);
        }else{
            usa.getMessage(message);
        }
    }
}
