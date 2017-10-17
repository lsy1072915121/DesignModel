package name.liushiyao.designmodel.decorator;

//抽象装饰类
public abstract class Decorator implements Phone {

  private Phone phone = null;

  public Decorator(Phone phone) {
    this.phone = phone;
  }

  @Override
  public void call() {
    this.phone.call();
  }
}
