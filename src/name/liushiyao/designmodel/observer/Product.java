package name.liushiyao.designmodel.observer;

import java.util.Observable;

/**
 * Created by 电子小孩 on 2017/3/4.
 */

/**
 * 被观察者(继承Observable，使用父类的setChanged方法和notifyObservers方法)
 */
public class Product extends Observable {

        //产品名字
        private String name;
        //价格
        private float price;

        //=================name====================//
        public void setName(String name){
                this.name = name;
                //设置变化点
                setChanged ();
                notifyObservers ( name );       //通知观察者
        }
        public String getName(){
                return name;
        }
        //===================price=======================//
        public void setPrice(float price ){
                this.price  = price;
                //设置价格变化点
                setChanged ();
                notifyObservers ( new Float ( price )); //通知观察者
        }
        public float getPrice(){
                return price ;
        }
        //以下可以是数据库更新插入指令
        public void saveToDb(){
                System.out.println ("saveToDb" );
        }

}
