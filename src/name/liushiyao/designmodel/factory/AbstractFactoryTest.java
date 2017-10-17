package name.liushiyao.designmodel.factory;

/**
 * Created by 北岭山下 on 2017/2/15.
 */

/**
 * 抽象工厂模式:是指有多个抽象角色时使用的一种工厂模式。
 */
public class AbstractFactoryTest {

        public static void main(String [] argn){
                FactoryOfIphone4SNormal factoryOfIphone4SNormal = new
                        FactoryOfIphone4SNormal ();
                Phone iphone4S = factoryOfIphone4SNormal.creatPhone ();
                FactoryOfIphone4SPlus factoryOfIphone4SPlus = new
                        FactoryOfIphone4SPlus ();
                Iphone4SPlus iphone4SPlus = ( Iphone4SPlus ) factoryOfIphone4SPlus.creatPhone ();

        }


}

interface AbstractFactory {

        Phone creatPhone();
        Display creatDisplay();

}

/**
 * 又一个抽象角色
 */
interface Display{

        void Size();

}

class DisplayA implements Display{

        @Override
        public void Size ( ) {
                System.out.println ("Display Normal" );
        }
}

class DisplayB implements Display{

        @Override
        public void Size ( ) {
                System.out.println ("Display Plus" );
        }
}

class FactoryOfIphone4SNormal implements AbstractFactory{

        @Override
        public Phone creatPhone ( ) {
                return new Iphone4S ();
        }

        @Override
        public Display creatDisplay ( ) {
                return new DisplayA ();
        }
}

class Iphone4SPlus extends Phone{

        public Iphone4SPlus ( ) {
                System.out.println ("creat Iphone4S Plus" );
        }

}

class FactoryOfIphone4SPlus implements AbstractFactory {

        @Override
        public Phone creatPhone ( ) {
                return new Iphone4SPlus ();
        }
        @Override
        public Display creatDisplay ( ) {
                return new DisplayB ();
        }
}








