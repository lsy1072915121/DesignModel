package name.liushiyao.designmodel.observer.consumerobserver;

public class ConsumerDemo {


  public static void main(String[] a) {

    ConcreteObserver concreteObserver1 = new ConcreteObserver("刘石尧");
    ConcreteObserver concreteObserver2 = new ConcreteObserver("刘石尧2");
    ConcreteObserver concreteObserver3 = new ConcreteObserver("刘石尧3");
    ConcreteSubject concreteSubject = new ConcreteSubject();
    concreteSubject.attach(concreteObserver1);
    concreteSubject.attach(concreteObserver2);
    concreteSubject.attach(concreteObserver3);
    concreteSubject.notifyObservers();

  }

}
