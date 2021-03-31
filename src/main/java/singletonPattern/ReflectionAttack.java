package singletonPattern;

/**
 * @ClassName:Reflection
 * @DESCRIPTION: 利用反射的机制获取私有的构造方法创建一个实例，来打破单例的规则
 * @author: cxc
 * @DATE: 2021/3/17
 */

public class ReflectionAttack {

 /*
    反射攻击的防护
    在私有的构造器中判断是否存在实例，若存在就抛出异常，阻止实例的创建。
  */
 /*
    if(XXX.instance!=null){
    throw new RuntimeException("单例不允许创建多个实例");
    }
  */


 /*
    使用枚举类型可以避免反射的攻击，具体原因在newInstance();方法中可得到结果

    if ((clazz.getModifiers() & Modifier.ENUM) != 0)
        throw new IllegalArgumentException("Cannot reflectively create enum objects");
    即，当为枚举类型的时候，不允许通过反射来创建。
  */
}
