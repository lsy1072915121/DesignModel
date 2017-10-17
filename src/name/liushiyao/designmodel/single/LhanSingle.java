package name.liushiyao.designmodel.single;

/**
 * Created by 北岭山下 on 2017/2/10.
 */

/**
 * 单例模式(懒汉式)（存在线程安全隐患）（又称为Double-Check Locking）
 * 通过synchronized解决
 *同步代码块（对象未初始化时，使用同步代码块，
 * 保证多线程访问时对象在第一次创建后，不再重复被创建）
 */
public class LhanSingle {

        private static  LhanSingle single = null;

        private LhanSingle(){

        }
        private static LhanSingle getInstance(){

                //提前进行null判断，可以提高效率
                if( single == null){

                        synchronized(LhanSingle.class){
                                /*
                                当两个线程同时进入该方法，它们都会检测到instance为null，不管哪一个线程先占据同步锁，
                                并创建实例对象，都不会阻止另外一个线程继续进入实例化代码块重新创建实例对象
                                 */
                                if(single == null){
                                        single = new LhanSingle ();

                                }
                        }
                }

                return single;
        }




}
