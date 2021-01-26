package test;

public class ClassForName {
    //静态代码块
    static {
        System.out.println("执行了静态代码块");
    }

    {
        System.out.println("init ");
    }
    //静态变量
    private static String staticFiled = staticMethod();

    //赋值静态变量的静态方法
    public static String staticMethod() {
        System.out.println("执行了静态方法");
        return "给静态字段赋值了";
    }

    public ClassForName(){
//        System.out.println("init ");
    }


    public static void main(String[] args) throws ClassNotFoundException {
            ClassLoader.getSystemClassLoader().loadClass("test.ClassForName");
//            Class.forName("test.ClassForName",false,ClassLoader.getSystemClassLoader());

            System.out.println("#########-------------结束符------------##########");


    }
}