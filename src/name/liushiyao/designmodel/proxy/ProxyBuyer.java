package name.liushiyao.designmodel.proxy;

/**
 * 代理类
 */
public class ProxyBuyer implements IBuyTicket{


  private IBuyTicket buyer;

  public ProxyBuyer(IBuyTicket buyer) {
    this.buyer = buyer;
  }

  @Override
  public void login() {
    this.buyer.login();
  }

  @Override
  public void station(String start, String end) {
    this.buyer.station(start,end);
  }

  @Override
  public void valiadate() {
    this.buyer.valiadate();
  }

  @Override
  public void payMoney() {
    this.buyer.payMoney();
  }
}
