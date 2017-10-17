package name.liushiyao.designmodel.adapter.对象适配器;

import name.liushiyao.designmodel.adapter.类适配器.Job;
import name.liushiyao.designmodel.adapter.类适配器.Person;

/**
 * Created by 电子小孩 on 2017/3/8.
 */

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
