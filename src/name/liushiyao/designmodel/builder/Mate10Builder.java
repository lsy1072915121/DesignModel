package name.liushiyao.designmodel.builder;

/**
 *
 * 具体建造者（Mate10）
 *
 */
public class Mate10Builder implements PhoneBuilder {

  Phone mate10 = new Mate10();
  @Override
  public void buildCPU() {
    mate10.setCPU("麒麟959");
  }

  @Override
  public void buildRAM() {
    mate10.setRAM("6GB");
  }

  @Override
  public void buildROM() {
    mate10.setROM("128GB");
  }

  @Override
  public void buildBattery() {
    mate10.setBattery("3500毫安");
  }

  @Override
  public void buildScreen() {
    mate10.setScreenSize("5.5 寸");
  }

  @Override
  public void buildOther() {
    mate10.setOther("全面屏，指纹识别，脸部识别");
  }

  @Override
  public Phone getPhone() {
    return mate10;
  }
}
