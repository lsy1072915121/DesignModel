package name.liushiyao.designmodel.builder;

/**
 * Created by root on 17-2-25.
 */


/**
 * Builder Model(建造者模式)
 *
 *  解释：将一个复杂的对象的构建和表示分离，使得同样的构建过程可以创建不同的表示
 *
 * Builder Model下的四种角色
 *  1.抽象建造者（Builder）：该角色用于规范产品的各个组成部分，并进行抽样
 *  2.具体建造者（Concrete Builder）:该角色用于实现抽象建造者定义的所有方法，并且返回一个组建好的产品实例
 *  3.产品（Product）：该角色是建造中的复杂对象，一个系统中会有多个产品，这些产品并不一定有共同的接口，可以是完全没有关联。
 *  4.导演者（Director）：该角色负责已有模块的顺序，然后告诉Builder进行建造。
 *
 *  实例：（1）以手机的生产为例，手机有手机的基本组成，但是不同的手机厂商生产的手机却又不同（符合建造者模式，同样的构建过程，可以创建不同的表示）
 *
 *
 *
 */
public class BuilderTest {

  public static void main(String []a){

    PhoneDirector phoneDirector = new PhoneDirector();
    Mate10 mate10 = phoneDirector.buildMate10();
    System.out.println(mate10);
    Iphone8 iphone8 = phoneDirector.buildIphone8();
    System.out.println(iphone8);

  }


}
