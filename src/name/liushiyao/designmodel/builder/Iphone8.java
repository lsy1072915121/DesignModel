package name.liushiyao.designmodel.builder;

public class Iphone8 extends Phone {

  public Iphone8() {
    System.out.println("It is Iphone8");
  }

  @Override
  public String toString() {
    return "具体配置："+" CPU="+this.getCPU()
                      +" RAM="+this.getRAM()
                      +" ROM="+this.getROM()
                      +" Battery"+this.getBattery()
                      +" ScreenSize"+this.getScreenSize()
                      +" other"+this.getOther()
        ;
  }
}
