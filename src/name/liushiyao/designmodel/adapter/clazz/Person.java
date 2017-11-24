package name.liushiyao.designmodel.adapter.clazz;

/**
 * Created by 电子小孩 on 2017/3/8.
 */
public class Person {

        private String name;
        private int age;
        private String sex;


        public void speakEnglish(){
                System.out.println ("I can speak English" );
        }
        public void speakJapanese(){
                System.out.println ("I can speak Japanese" );
        }

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

        public String getSex ( ) {
                return sex;
        }

        public void setSex ( String sex ) {
                this.sex = sex;
        }
}
