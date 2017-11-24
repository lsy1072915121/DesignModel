package name.liushiyao.designmodel.proxy;

/**
 *
 * 代理模式： 为其他对象提供一种代理，以控制对这个对象的访问
 *
 *
 * 代理模式包括以下三种角色：
 *  1.抽象主题：该角色是真实主题和代理主题的共同接口，以便在任何可以使用真实主题的地方使用代理主题
 *  2.代理主题：该角色负责控制类对真实主题的引用，负责在需要的时候创建或删除真实主题对象，
 *    并且在真实主题对象，并且在真实主题角色处理完毕前后做预处理和善后工作
 *  3.真实主题：业务逻辑的具体执行者
 *
 *
 */
public class ProxyDemo {


  public static void main(String []a){

      IBuyTicket iBuyTicket = new TicketBuyer("刘石尧");
        ProxyBuyer proxyBuyer = new ProxyBuyer(iBuyTicket);
        proxyBuyer.login();
        proxyBuyer.station("惠州","肇庆");
        proxyBuyer.valiadate();
        proxyBuyer.payMoney();

  }

}
