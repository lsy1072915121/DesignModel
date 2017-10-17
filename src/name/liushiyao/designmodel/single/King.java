package name.liushiyao.designmodel.single;

/**
 * Created by 北岭山下 on 2017/2/10.
 */

/**
 * 单例设计模式懒汉式测试类
 * King（唯一）
 */

public class King {

        //属性
        private String name;
        private int age;

        public String getName ( ) {
                return name;
        }

        public void setName ( String name ) {
                this.name = name;
        }

        public int getAge ( ) {
                return age;
        }

        public void setAge ( int age ) {
                this.age = age;
        }

        //=========单例模式部分==================//
        private static King king = null;
        private King(){}
        public static King getInstance(){

                if(king == null){
                        synchronized(King.class){
                                if(king ==  null){
                                        king =  new King ();
                                }
                        }
                }

                return  king ;
        }


}
