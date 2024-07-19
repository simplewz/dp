package observer.scene.v4;

/**
 * Description: <br/>
 * 客户端类
 * @author wangzhao
 * @version 1.0
 * @email 13132398914@163.com
 * @date 2024/7/18 9:44
 */
public class Client {

    public static void main(String[] args) {

        Boss boss = new Boss("大老板");
        boss.setBossState("在公司！");

        Secretary secretary = new Secretary("童子喆");
        secretary.setBossState(boss.getBossState());

        StockObserver stockObserver = new StockObserver("魏关喆");
        NbaObserver nbaObserver = new NbaObserver("易管查");
        stockObserver.setWorkState("认真工作中！");
        nbaObserver.setWorkState("认真工作中！");

        System.out.println("************同事未订阅前台主题前,没有老板状态消息***************");
        System.out.println(boss);
        System.out.println(secretary);
        System.out.println(stockObserver);
        System.out.println(nbaObserver);

        System.out.println("************同事订阅前台主题后，获取到老板状态消息***************");
        stockObserver.subBossStateSubject(secretary);
        nbaObserver.subBossStateSubject(secretary);
        System.out.println(boss);
        System.out.println(secretary);
        System.out.println(stockObserver);
        System.out.println(nbaObserver);

        System.out.println("************老板外出了***************");
        boss.setBossState("外出中");
        secretary.setBossState(boss.getBossState());
        BossStateChangeEventHandler bossOutEventHandler = ()->{
            stockObserver.setBossState(secretary.getBossState());
            nbaObserver.setBossState(secretary.getBossState());
            stockObserver.setWorkState("打开网页查看股票！");
            nbaObserver.setWorkState("打开NBA直播观看比赛！");
        };
        secretary.setEventHandler(bossOutEventHandler);
        secretary.inform();
        System.out.println(boss);
        System.out.println(secretary);
        System.out.println(stockObserver);
        System.out.println(nbaObserver);

        //中途订阅了前台主题获取到老板的状态
        StockObserver stockObserver2 = new StockObserver("梁年办");
        stockObserver2.subBossStateSubject(secretary);
        stockObserver2.setWorkState("与魏关喆查看股票，发现自己的股票涨停了");


        System.out.println("************胡汉三回来了***************");
        boss.setBossState("胡汉三回来了");
        secretary.setBossState("胡汉三回来了");
        BossStateChangeEventHandler bossBackEventHandler = ()->{
            stockObserver.setBossState(secretary.getBossState());
            stockObserver.closeStockMarket();
            stockObserver.setWorkState("认真工作");

            nbaObserver.setBossState(secretary.getBossState());
            nbaObserver.closeNBADirectSeeding();
            nbaObserver.setWorkState("认真工作");

            //前台在通知时遗漏了梁年办
            /*
            stockObserver2.setBossState(secretary.getBossState());
            stockObserver2.closeStockMarket();
            stockObserver2.setWorkState("认真工作");
             */
        };
        secretary.setEventHandler(bossBackEventHandler);
        secretary.inform();
        System.out.println(boss);
        System.out.println(secretary);
        System.out.println(stockObserver);
        System.out.println(nbaObserver);
        System.out.println(stockObserver2);

        boss.say("梁年办,恭喜发财呀，是不是考虑请大家吃饭呀！");
        stockObserver2.say("老板，实在对不起，以后不会了！");
    }

}
