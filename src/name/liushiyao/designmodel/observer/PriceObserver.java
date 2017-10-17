package name.liushiyao.designmodel.observer;

import java.util.*;

/**
 * Created by 电子小孩 on 2017/3/4.
 */

/**
 * 价格观察者
 */
public class PriceObserver implements java.util.Observer {

        private float price  = 0;

        @Override
        public void update ( Observable o, Object arg ) {
                if(arg instanceof Float){
                        price  = ( ( Float ) arg ).floatValue ();
                        System.out.println ("Price观察者：price发生了变化 "+price );
                }
        }
}
