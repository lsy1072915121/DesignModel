package name.liushiyao.designmodel.observer;

/**
 * Created by 电子小孩 on 2017/3/4.
 */


/**
 * 观察者模式
 *      1. 抽象主题（Subject）模式
 *              主题角色吧所有的观察者对象的引用保存在一个列表中，每个主题都可以有任何数量的观察者。主题
 *              提供一个接口，可以加上或者撤销观察者对象。
 *                                              ----可以使用一个抽象类或者一个接口来实现，在具体情况下可以使用具体类实现
 *      2. 抽象观察者（Observer）模式
 *              为所有的具体观察者定义一个接口，在得到通知时通知更新自己。
 *                                              ----可以使用一个抽象类或者一个接口来实现，在具体情况下可以使用具体类实现
 *
 *      3. 具体主题（ConcreteSubject）模式
 *              具体主题保存对具体对象观察者对象有用的内部状态，在这种内部状态改变时，给其观察者发送一个通知。
 *      4. 具体观察者(ConcreteObserver)模式
 *              具体观察者角色用于保存一个指向具体主题对象的引用，和一个与主题的状态相符的状态。具体观察者角色
 *              实现抽象观察者角色所要求的更新自己的接口，以便于本身状状态与主题状态自洽。
 */

/**
 * 【 例 】商品价格问题
 *      需求：网上商店中的商品在名称、价格发生变化时，必须自动通知会员
 *      注：Java的API提供了Observer接口和Observable类来实现所谓的观察者模式
 */
public class ObserverDemo {


        public static void main ( String[] args ) {

                Product product = new Product ();
                NameObserver nameObserver = new NameObserver ();
                PriceObserver priceObserver = new PriceObserver ();
                //添加观察者
                product.addObserver ( nameObserver );
                product.addObserver ( priceObserver );
                //被观察的属性发生了变化
                product.setName ( "商品一" );
                product.setPrice ( 23 );

        }
}
