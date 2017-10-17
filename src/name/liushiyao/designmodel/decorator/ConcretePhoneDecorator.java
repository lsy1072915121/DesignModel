package name.liushiyao.designmodel.decorator;

public class ConcretePhoneDecorator  extends Decorator{

  public ConcretePhoneDecorator(Phone phone) {
    super(phone);
  }

  //添加装饰
  public void surfing(){

    System.out.println("---上网---");

  }
  public void palyGame(){

    System.out.println("---玩游戏---");
  }
  public void watchVideo(){
    System.out.println("---看视频---");
  }
  //复写call方法
  @Override
  public void call() {
    super.call();
    surfing();
    palyGame();
    watchVideo();

  }
}
