package name.liushiyao.designmodel.decorator;

//具体构件
public class Mate10 implements Phone{

  @Override
  public void call() {
    System.out.println("---打电话---");
  }
}
