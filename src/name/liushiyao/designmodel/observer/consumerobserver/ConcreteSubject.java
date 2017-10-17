package name.liushiyao.designmodel.observer.consumerobserver;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by 电子小孩 on 2017/3/4.
 */
public class ConcreteSubject  implements Subject {

        //用于存储观察者的列表
        private Vector observerVector =new Vector (  );

        @Override
        public void attach ( Observer observer ) {
                observerVector.addElement ( observer );
        }

        @Override
        public void detach ( Observer observer ) {
                observerVector.removeElement ( observer );
        }

        @Override
        public void notifyObservers ( ) {
                Enumeration enumeration = observers();
                while(enumeration.hasMoreElements ()){
                        //运行观察者的update方法
                        ((Observer)enumeration.nextElement ()).update ();
                }
        }
        public Enumeration observers(){
                return ((Vector)(observerVector.clone ())).elements ();
        }
}
