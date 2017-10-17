package name.liushiyao.designmodel.factory;

/**
 * Created by 北岭山下 on 2017/2/14.
 */

/**
 * 工厂方法模式：工厂方法模式的核心是一个抽象工厂类，而不像简单工厂模式，
 * 把核心放在一个实类上。可扩展性更好，利于管理。
 *
 * 组成：
 *      抽象工厂（Creator)角色：工厂方法模式的核心，任何在模式中创建的对象的工厂必须实现这个接口。
        具体工厂（Concrete Creator)角色：实现抽象工厂接口的具体工厂类，包含应用程序的逻辑。
        抽象产品（Product)角色：产品对象的共同父类或共同拥有的接口。
        具体产品（Concrete Product)角色：实现了抽象产品角色定义的接口，其具体产品有专门的具体工厂创建。
 */

public class FactoryTest{

        public static void main(String [] argn){

                FactoryOfIphone4S factoryOfIphoe4S = new FactoryOfIphone4S ();
                Iphone4S iphone4S = factoryOfIphoe4S.creatPhone ();

        }

}


/**
 * 抽象工厂：这是工厂方法模式的核心。它与应用程序无关，
 * 是具体工厂角色必须实现的接口或者必须继承的父类；
 */
interface Factory {

         Phone creatPhone();

}

/**
 * 具体工厂：含有和具体业务逻辑有关的代码。
 * 由应用程序调用以创建对应的具体产品对象；
 */
class FactoryOfIphone4S implements Factory{

        @Override
        public Iphone4S creatPhone ( ) {
                return new Iphone4S ();
        }
}
class FactoryOfIphone5S implements Factory{


        @Override
        public Iphone5S creatPhone ( ) {
                return new Iphone5S ();
        }
}




