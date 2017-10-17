package name.liushiyao.designmodel.single;

/**
 * Created by 北岭山下 on 2017/5/26.
 */
/*
        Initialization on demand holder
        【核心】使用静态类和静态成员变量实现单例对象

 */
public class IoDHSingle {

        //私有化构造器
        private IoDHSingle(){

        }
        /*
        加载时首先加载这个静态类，返回创建的对象（不存在线程安全问题）
         */
        private static class LazyHolder{
                private static final IoDHSingle IO_DH_SINGLE = new IoDHSingle ();
        }
        public static IoDHSingle getInstance(){
                return LazyHolder.IO_DH_SINGLE;
        }


}
