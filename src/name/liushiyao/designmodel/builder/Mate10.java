package name.liushiyao.designmodel.builder;

public class Mate10 extends Phone {

  public Mate10() {
    System.out.println("It is Mate10");
  }

  @Override
  public String toString() {
    return "具体配置："+"CPU="+this.getCPU()
        +" RAM="+this.getRAM()
        +" ROM="+this.getROM()
        +" Battery"+this.getBattery()
        +" ScreenSize"+this.getScreenSize()
        +" other"+this.getOther()
        ;
  }

}
