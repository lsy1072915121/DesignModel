package name.liushiyao.designmodel.adapter.类适配器;

/**
 * Created by 电子小孩 on 2017/3/8.
 */

/**
 * 类适配器
 */
public class Adapter extends Person implements Job {
        @Override
        public void speakFrench ( ) {

                System.out.println ("I can speak French！" );

        }
}
