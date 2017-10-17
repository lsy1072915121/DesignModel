package name.liushiyao.designmodel.builder;


/**
 * 具体建造者（IPhone8Builder）
 */
public class Iphone8Builder implements PhoneBuilder{

  Phone iphone8 = new Iphone8();
  @Override
  public void buildCPU() {
    iphone8.setCPU("A10");
  }

  @Override
  public void buildRAM() {
    iphone8.setRAM("4GB");
  }

  @Override
  public void buildROM() {
    iphone8.setROM("128GB");
  }

  @Override
  public void buildBattery() {
    iphone8.setBattery("3200毫安");
  }

  @Override
  public void buildScreen() {
    iphone8.setScreenSize("5.5 寸");
  }

  @Override
  public void buildOther() {
    iphone8.setOther("全面屏，指纹识别，脸部识别");
  }

  @Override
  public Phone getPhone() {
    return iphone8;
  }

}
