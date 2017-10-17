package name.liushiyao.designmodel.adapter.对象适配器;

/**
 * Created by 电子小孩 on 2017/3/8.
 */

import name.liushiyao.designmodel.adapter.类适配器.Job;
import name.liushiyao.designmodel.adapter.类适配器.Person;

/**
 * 对象适配器
 *
 *  背景（同类适配器）：一家公司需要一名即会讲英语又会讲日语和法语的员工，但有一名员工只会讲英语和日语；
 *              需要一个“适配器”帮助该员工满足该公司的要求
 */
public class AdapterOfObjectDemo {

        public static void main ( String[] args ) {

                Person person = new Person ();
                Job job = new Adapter (person);
                job.speakJapanese ();
                job.speakEnglish ();
                job.speakFrench ();

        }
}
