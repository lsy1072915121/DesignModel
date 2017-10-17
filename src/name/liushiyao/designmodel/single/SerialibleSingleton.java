package name.liushiyao.designmodel.single;

import java.io.Serializable;

/**
 * Created by 北岭山下 on 2017/5/26.
 */

/**
 *
 * 【未完成】关于序列化的知识点
 *
 */

/**
 * 使用反序列化进行单例的设计
 */
public class SerialibleSingleton implements Serializable  {



        static SerialibleSingleton singleton = new SerialibleSingleton ();


        private SerialibleSingleton(){}

        private Object  readResolve(){
                return singleton;
        }



}
