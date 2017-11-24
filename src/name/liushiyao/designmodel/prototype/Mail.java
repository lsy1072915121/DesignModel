package name.liushiyao.designmodel.prototype;

public class Mail implements Cloneable {


  private String receiver;

  private String title;

  private String contxt;

  public Mail(String receiver,String contxt){
    this.contxt = contxt;
    this.receiver = receiver;
  }


  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContxt() {
    return contxt;
  }

  public void setContxt(String contxt) {
    this.contxt = contxt;
  }

  /**
   * 覆盖父类的clone方法
   * @return
   * @throws CloneNotSupportedException
   */
  @Override
  public Mail clone() throws CloneNotSupportedException {

    Mail mail = null;
    try{
      //调用Object的clone方法
      mail = (Mail) super.clone();
    }catch(CloneNotSupportedException e){
      e.printStackTrace();
    }

    return mail;
  }
}
