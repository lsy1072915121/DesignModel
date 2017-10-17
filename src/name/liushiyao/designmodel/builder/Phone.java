package name.liushiyao.designmodel.builder;

public class Phone {

  private String CPU;
  private String RAM;
  private String ROM;
  private String screenSize;
  private String battery;
  private String other;

  public String getCPU() {
    return CPU;
  }

  public void setCPU(String CPU) {
    this.CPU = CPU;
  }

  public String getRAM() {
    return RAM;
  }

  public void setRAM(String RAM) {
    this.RAM = RAM;
  }

  public String getROM() {
    return ROM;
  }

  public void setROM(String ROM) {
    this.ROM = ROM;
  }

  public String getScreenSize() {
    return screenSize;
  }

  public void setScreenSize(String screenSize) {
    this.screenSize = screenSize;
  }

  public String getBattery() {
    return battery;
  }

  public void setBattery(String battery) {
    this.battery = battery;
  }

  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }
}
