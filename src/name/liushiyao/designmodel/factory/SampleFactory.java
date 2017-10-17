package name.liushiyao.designmodel.factory;

/**
 * Created by 北岭山下 on 2017/2/14.
 */

/**
 * 简单工厂模式:实质是由一个工厂类根据传入的参数，动态的决定创建哪一个产品类
 *
 *
 * 组成：
 *      工厂（Creator)角色：它是简单工厂模式的核心，负责实现创建所有实例的内部逻辑。工厂类可以被外界直接调用，创建所需要的产品对象。
        抽象产品角色：它负责描述所有实例所共有的公共接口。
        具体产品角色：是简单工厂模式的创建目标，所有创建的对象都是充当这个角色的某个具体类的实例。
 *
 * 缺点：对于部分产品来说是符合开闭原则（对扩展开放，对修改封闭）的，
 * 但工厂部分好像不太理想，因为每增加一种新类型的产品，工厂类中增加
 * 相应的创建业务逻辑（creatPhone(version)方法需要新增case），这显然
 * 违背了开闭原则。对于新产品的加入，工厂类是很被动的，对于这样的工厂类，
 * 我们称它为“全能类”或者“上帝类”
 *
 *
 *
 *
 * 总结：引入“工厂方法模式”，解决“简单工厂模式”中的问题
 *
 */
public class SampleFactory {

        public static void main ( String[] argn ) {

                Phone p1 = FactoryOfPhone.creatPhone ( "Iphone4S" );


        }


}

/**
 * 抽象产品类：一般是具体产品继承的父类或者实现的接口
 */
abstract class Phone {

        public Phone ( ) {
        }


}

/**
 * 具体产品类：工厂类所创建的对象就是此类的实例。
 */
class Iphone4S extends Phone {

        public Iphone4S ( ) {
                System.out.println ( "creat Iphone4S" );
        }
}

class Iphone5S extends Phone {

        public Iphone5S ( ) {
                System.out.println ( "creat Iphone5S" );
        }

}

/**
 *工厂类：本模式的核心，含有一定的商业逻辑和判断逻辑，用来创建产品
 */
class FactoryOfPhone {

        public static Phone creatPhone ( String version ) {
                switch ( version ) {
                        case "Iphone4S":
                                return new Iphone4S ( );
                        case "Iphone5S":
                                return new Iphone5S ( );

                        default:
                                return null;
                }
        }


}



