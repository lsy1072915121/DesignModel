package name.liushiyao.designmodel.builder;

/**
 * 导演者
 *  开始建造
 */
public class PhoneDirector {

  private PhoneBuilder phoneBuilder;

  public Mate10 buildMate10(){

    phoneBuilder = new Mate10Builder();
    phoneBuilder.buildCPU();
    phoneBuilder.buildRAM();
    phoneBuilder.buildROM();
    phoneBuilder.buildBattery();
    phoneBuilder.buildScreen();
    phoneBuilder.buildOther();
    return (Mate10) phoneBuilder.getPhone();

  }
  public Iphone8 buildIphone8(){

    phoneBuilder = new Iphone8Builder();
    phoneBuilder.buildCPU();
    phoneBuilder.buildRAM();
    phoneBuilder.buildROM();
    phoneBuilder.buildBattery();
    phoneBuilder.buildScreen();
    phoneBuilder.buildOther();
    return (Iphone8) phoneBuilder.getPhone();

  }


}
