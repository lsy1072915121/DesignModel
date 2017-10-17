package name.liushiyao.designmodel.observer;

/**
 * Created by 电子小孩 on 2017/3/4.
 */


import java.util.*;

/**
 * 名字观察者
 */
public class NameObserver implements java.util.Observer {

        private String name = null;


        @Override
        public void update ( Observable o, Object arg ) {
                if ( arg instanceof String ) {
                        name = ( String ) arg;
                        //产品名字改变值在name中
                        System.out.println ("Name 观察者： name发生了变化 "+name );
                }
        }

}
