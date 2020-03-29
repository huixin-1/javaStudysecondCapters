/*
数据类型：
    java是一种强类型的语言
    强类型表示，变量在声明的时候，必需显示声明类型是什么  java
    弱类型表示，变量会根据值自己去判断，不需要指定类型是什莫   js,python,scala
java数据类型
    基本数据类型（4类8种）
    整数类型：byte short int long (不同类型表示不同的长度)
         byte:使用一个字节存储，因此范围是-128~127
         short:使用两个字节存储，因此范围是-32768~32767
         int:使用四个字节存储，因此范围是  正负21亿
         long:使用八个字节存储，因此范围是  。。。。。

         注意：
           1、在使用整形的时候，默认都是int类型，如果使用long类型的时候，需要在数值后面加L;
    浮点类型：float double
           float：单精度，精度是小数点后7位；
           double：双精度，精度是float的双倍；
           注意：默认使用的是double类型；
                使用float的时候，数字后要添f；
                浮点类型并不能表示一个精确的值，会损失精度。
    字符类型：char
    布尔类型：boolean
    只有true和false两个值，在存储的时候占1位
    引用数据类型
 */

public class DataTypeDemo {
    public static void main(String[] args) {
       //不否和情况就会报错
        //byte b =128;
       // short s =4444;
        //int i =111111111;
        //int a =3111111111;
        //long b=3111111111;
        //long k =3111111111L;

        float f1 =2.23123123123F;
        float f2=2.23123123123312321F;
        System.out.println(f1==f2);

    }
}
