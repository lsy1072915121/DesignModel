package name.liushiyao.designmodel.proxy;

public interface IBuyTicket {


  public void login();
  public void station(String start,String end);//选择车票的起始站和终点站
  public void valiadate();//身份验证
  public void payMoney();//支付

}
