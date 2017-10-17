package name.liushiyao.designmodel.decorator;

public class DecoratorDemo {

  public static void main(String []a){

      Phone phone = new Mate10();
      Decorator decorator = new ConcretePhoneDecorator(phone);
      decorator.call();

  }

}
