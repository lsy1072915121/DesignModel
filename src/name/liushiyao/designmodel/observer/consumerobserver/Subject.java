package name.liushiyao.designmodel.observer.consumerobserver;


/**
 * Created by 电子小孩 on 2017/3/4.
 */
public interface Subject {

        public void attach( Observer observer);                //用于增加一个观察者对象
        public void detach(Observer observer);                  //用于删除一个观察者对象
        void notifyObservers();                                         //用于通知各个观察者更新他们自己

}
