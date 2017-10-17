/**
 * Created by 北岭山下 on 2017/5/26.
 */
package name.liushiyao.designmodel.single;



/*
                单例设计模式：保证系统中一个类最多只能存在一个实例
                【应用】缓冲池、数据库连接池、线程池以及一些应用服务实例
                【实现方法】
                1、懒汉式
                2、饿汉式
                3、Initialization on demand holder
                4、Singleton序列化
                【实现步骤】
                1、私有化构造函数
                2、创建本类对象
                3、提供获取本类对象的方法


 */