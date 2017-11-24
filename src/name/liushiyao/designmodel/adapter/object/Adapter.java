package name.liushiyao.designmodel.adapter.object;


/**
 * Created by 电子小孩 on 2017/3/8.
 */

import name.liushiyao.designmodel.adapter.clazz.Job;
import name.liushiyao.designmodel.adapter.clazz.Person;

/**
 * （对象）适配器
 */
public class Adapter implements Job {

        //将源角色聚合到类中
        private Person person;

        public Adapter(Person  person){
                this.person = person;
        }

        @Override
        public void speakEnglish ( ) {
                person.speakEnglish ();
        }

        @Override
        public void speakJapanese ( ) {
                person.speakJapanese ();
        }

        @Override
        public void speakFrench ( ) {
                System.out.println ("I can Speak French" );
        }
}
