package name.liushiyao.designmodel.prototype;

import org.junit.Test;

/**
 *
 * 原型模式：用原型实例指定创建对象的种类，并且通过复制这些原型创建新的对象
 *
 * 总的来说，就是用于对象的复制（浅拷贝）。
 *
 *
 *  Java内置克隆机制，Object类具有一个clone()方法，能够实现对象的克隆，是的一个类支持克隆只需要两步
 *    1.实现Cloneable接口
 *    2.覆盖Object的clone()方法，完成对象的克隆操作
 *
 *
 *  【实例】向多个人发送email。
 *
 *
 */
public class ProtoTypeDemo {

  public static void main(String []a) throws CloneNotSupportedException {

    Mail mail = new Mail("发给我的","我是内容");
    Mail mail2 = mail.clone();
    System.out.println(mail);
    System.out.println(mail2);

  }

  @Test
  public void test() throws CloneNotSupportedException {


    Mail mail = new Mail("发给我的","123");
    Mail mail2 = mail.clone();//new Mail("发给我的2","12322");
    System.out.println(mail == mail2);
    System.out.println(mail.getContxt().hashCode() == mail2.getContxt().hashCode()?"浅拷贝":"深拷贝");

  }

}
