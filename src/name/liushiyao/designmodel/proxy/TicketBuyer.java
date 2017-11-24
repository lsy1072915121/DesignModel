package name.liushiyao.designmodel.proxy;

public class TicketBuyer implements IBuyTicket{



  private String name;

  public TicketBuyer(String name) {
    this.name = name;
  }

  @Override
  public void login() {
    System.out.println(this.name+"登录12306火车购票系统");
  }

  @Override
  public void station(String start, String end) {
    System.out.println("选择了火车票的起始站点："+start+"\t终点站："+end);
  }

  @Override
  public void valiadate() {
    System.out.println(this.name+"通过了身份认证！");
  }

  @Override
  public void payMoney() {
    System.out.println(this.name+"抢到了火车票并进行付款操作！");
  }
}
