package name.liushiyao.designmodel.builder;

/**
 * 抽象建造者
 */
public interface PhoneBuilder {


  void buildCPU();
  void buildRAM();
  void buildROM();
  void buildBattery();
  void buildScreen();
  void buildOther();
  public Phone getPhone();

}
