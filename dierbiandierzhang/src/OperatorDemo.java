/*
运算符：
   算术运算符：  +，-，*，/，%，++，--；
   赋值运算符： =；
   扩展赋值运算符：+=，-=，*=，/=；
   关系运算符：>,<,>=,<=,!=,==;
   逻辑运算符： &&，||，！
   逻辑运算符两边跟的不是一个具体的值；而是一个表达式
   位运算符：&，|，^,~,>>,<<,>>>(了解)
   条件运算符 ？：
 */


public class OperatorDemo {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        //算数运算符
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        //取整除或取商
        System.out.println(a/b);
        //取余数，或者取模
        System.out.println(a%b);
        //单目运算符
        //++
        System.out.println(a++);//1
        System.out.println(++a);//3

        //--
        System.out.println(a--);//3
        System.out.println(--a);//1
        System.out.println(++b+b++);//6
        //扩展运算符
        int c =1;
        //两个写法意义一样，表示加2的基本操作
        c = c+2;
        c+=2;
        //类型转换问题，d是byte，d+1整体变成int类型，需要将int类型转换成byte，会有精度损失
        //因此需要进行强制转换
        byte d =10;
        //d=d+1;会报错
        d+=1;

        //关系运算符:返回的值是
        System.out.println(1>2);
        System.out.println(1<2);
        System.out.println(1>=2);
        System.out.println(1<=2);
        System.out.println(1==2);
        System.out.println(1!=2);

        //逻辑运算符
        /*
            &&：表示短路与；两个表达式中只要有一个是false，整体结果就是false
               两边表达式从左到右开始对比，如果左边的表达式是false，右边的表达式不需要进行判断
            ||：表示短路与；两个表达式中只要有一个是true，整体结果就是true
               两边表达式从左到右开始对比，如果左边的表达式是true，右边的表达式不需要进行判断
             !:取反； 如果是true，结果是false；如果是false，结果是true；
         */
        System.out.println(2>5&&3<4);
        System.out.println(3>5||3<4);

        System.out.println(!true);
        System.out.println(!false);

        System.out.println("---------------");
        //位运算符：只能操作数值，操作的时候会转换成二进制进行运算
        System.out.println(4&5);//与    100   101       110
        System.out.println(4|5);//或    100   101       101
        System.out.println(4^5);//异或  100   101       001

        //移码，补码，原码，反码？？？？
        System.out.println(~4);//取反   -5
        //左移表示乘以2；右移表示除以2.
        System.out.println(2<<3);//16
        System.out.println(16>>3);//2

        //条件运算符或者三目运算符
        //使用的时候需要跟一个表达式，表达式如果是true，则返回？号后的结果，如果是false，则返回 ：后的结果
        System.out.println(3>2?2:2);//2
        //面试笔试的时候，经常会考
        System.out.println(true?false:true?false:true);//false  直接看第一个true   然后返回结果就行，后面的不用看
        System.out.println(false?false:true?false:true);//false

    }

}
