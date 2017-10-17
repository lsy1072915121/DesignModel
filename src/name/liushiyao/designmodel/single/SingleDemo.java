package name.liushiyao.designmodel.single;

/**
 * Created by 北岭山下 on 2017/2/10.
 */

/**
 * 单例模式Demo
 *
 */

/**
 * 内存中只有一个King，唯一的King
 */
public class SingleDemo {

        public static void main(String [] a){

                King king = King.getInstance ();
                king.setAge ( 10 );
                king.setName ( "lsy" );
                King king2  = King.getInstance ();
                System.out.println ( king2.getAge ( )+" "+king2.getName () );
                king2.setAge ( 22 );
                System.out.println ( king.getAge ( )+" "+king.getName () );


        }

}
