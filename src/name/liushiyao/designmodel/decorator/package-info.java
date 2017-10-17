package name.liushiyao.designmodel.decorator;


/*

        装饰模式：
                      动态的该一个对象增加一些额外的职责

      装饰模式有4种角色
        抽象构件（Component）：该角色用于规范需要装饰的对象（原始对象）
        具体构件（Concrete Component）:该角色实现抽象构件接口，定义一个需要装饰的原始类
        装饰角色（Decorator）：该角色持有一个构件对象的实例，并定义一个与抽象构件接口一致的接口
        具体装饰(Concrete Decorator):该类实现装饰角色的具体类

      实例：以手机功能为例，手机的基本功能是打电话。对手机进行装饰，添加上网，玩游戏，看视频的功能
 */