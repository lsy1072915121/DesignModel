package name.liushiyao.designmodel.single;

/**
 * Created by 北岭山下 on 2017/2/9.
 */

/**
 * 单例设计模式（饿汉式）
 * <p>
 * 1.  私有化构造函数
 * 2. 创建本类对象
 * 3. 提供一个方法用于对象的获取
 */

/**
 * 优点：编写简单，不存在多线程问题
 * 缺点：当类被加载时同时初始化对象并分配内存空间。
 *              该对象会一直占用内存（即使你没有使用到该实例）
 *              当类被卸载时，静态变量被摧毁并释放内存。因此在
 *              某些特定条件下会损耗内存。
 */
public class EhanSingle {


        private static final EhanSingle single = new EhanSingle ( );//创建本类对象


        private EhanSingle ( ) {                               //私有化构造函数
        }

        public static EhanSingle getInstance ( ) {      //提供一个方法用于对象的获取
                return single;
        }


}
