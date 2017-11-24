package name.liushiyao.designmodel.observer.consumerobserver;

/**
 * Created by 电子小孩 on 2017/3/4.
 */
public class ConcreteObserver implements Observer {


        private String name;


        public ConcreteObserver(String name) {
                this.name = name;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        @Override
        public void update ( ) {
                //具体自我更新Code
                System.out.println(name+"更新了");
        }
}
