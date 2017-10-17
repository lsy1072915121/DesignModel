package name.liushiyao.designmodel;


/*
          java设计模式
          【创建型模式】
          1.单例设计模式（√）
            确保一个类只有一个实例，而且自行实例化并向整个系统提供这个方法
            【优点】在内存中只有一个实例，减少内存的开支，特别是一个当一个对象频繁被创建，销毁而且创建或销毁的性能有无法优化的时候。
            【缺点】1.单例模式不能创建子类，且拓展困难，若要扩展，只能修改代码
                   2.单例设计模式对测试不理，在并行开发环境中，如果采用单例模式的类灭有完成，程序是不能进行测试的。
                   3.单例模式与单一职责原则冲突
            【使用场景】
              1.要求生成唯一序列号的环境
              2.在整个项目中需要一个共享访问点或者共享数据
              3.创建一个对象需要的资源过多

          2.工厂模式（抽样工厂）（√）
            定义一个用于创建对象的接口，让子类决定实例化哪个类，工厂方法使一个类的实例化延迟到其子类
            【优点】1.良好的封装性，代码结构清晰
                   2.优秀的拓展性
                   3.屏蔽产品类
                   4.解耦框架
            （抽样工厂）
            为创建一组相关或者相互依赖的提供一个接口，并且无需指向她们的具体类
          3.建造者模式（√）
            将一个复杂对象的构建和表示分离，使得同样的构建过程可以创建不同的表示
            【优点】1.封装性；建造者独立。易于拓展；便于控制细节风险
          4.原型模式
          【结构型模式】
          5.代理模式
          6.装饰模式
            动态的该一个对象增加一些额外的职责
          7.适配器模式
            将一个类的接口变成客户端所需要的另外一个接口，从尔是原来不匹配的而无法在一起工作的两个类能够在一起工作
          8.组合模式
          9.桥梁模式
          10外观模式
          11.享元模式
          【行为模式】
          12.模板方式模式
          13.命令模式
          14.责任链模式
          15.策略模式
          16.迭代模式
          17.中介者模式
          18.观察者模式
          19.备忘录模式
          20.访问者模式
          21.状态模式
          22.解析器模式
 */

/*
          设计模式六大原则

          1.单一职责原则
            一个类应该只有一个职责
          2.里氏替换原则
            所有引起基类的地方必须透明的使用其子类对象
          3.依赖倒置原则
            高层模块不应该依赖底层模块，两者都依赖其抽象
            抽象不依赖细节
            细节依赖于抽象
          4.接口隔离原则
            类间的依赖关系应该建立在最小的接口上
          5.迪米特原则
            一个对象尽可能的对其他对象少了解
          6.开闭原则
            对扩展开放，对修改关闭

 */