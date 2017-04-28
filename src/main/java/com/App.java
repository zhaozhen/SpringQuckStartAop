package com;

import com.aop.AspectJ.ICustomerBo;
import com.aop2.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
//    private static ApplicationContext context;
//  第一次的运行代码
//    public static void main(String[] args) {
//        context = new ClassPathXmlApplicationContext("SpringBeans.xml");
//
//        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
//        obj.printHello();
//    }

//    private static ApplicationContext context;
//  第二次运行的代码
//    public static void main(String[] args) {
//        context = new ClassPathXmlApplicationContext(new String[]{"Spring-Output.xml"});
//        //修改运行的内容只需要修改xml文件中的ref就可以了
//        OutputHelper output = (OutputHelper) context.getBean("OutputHelper");
//        output.generateOutput();
//    }
//
//
//    public static void main(String[] args) {
//        ApplicationContext appContext = new ClassPathXmlApplicationContext(
//                new String[]{"SpringAOPAdvice.xml"});
//        //和下一次比较和这个下面这一行
//        CustomerService cust = (CustomerService) appContext.getBean("customerService");
//        System.out.println("使用Spring AOP 如下");
//        System.out.println("*************************");
//        cust.printName();
//        System.out.println("*************************");
//        cust.printURL();
//        System.out.println("*************************");
//        try {
//            cust.printThrowException();
//        } catch (Exception e) {
//        }
//    }

    //    //try一下说不定能运行。。。。
//    public static void main(String[] args) {
//        ApplicationContext appContext = new ClassPathXmlApplicationContext(
//                new String[]{"SpringAOPAdvice.xml"});
//        //默认配置文件中存在customerServiceProxy的Id的
////        CustomerService cust = (CustomerService) appContext.getBean("customerServiceProxy");
//
//        CustomerService cust = (CustomerService) appContext.getBean("customerService");
//        System.out.println("使用Spring AOP 如下");
//        System.out.println("*************************");
//        cust.printName();
//        System.out.println("*************************");
//        cust.printURL();
//        System.out.println("*************************");
//
//        try {
//            cust.printThrowException();
//        } catch (Exception e) {
//
//        }
//    }
    //最后一个使用注解的方法得到
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"SpringAOPAdvice.xml"});
        ICustomerBo customer = (ICustomerBo) appContext.getBean("customerBo");

        customer.addCustomer();

        System.out.println("-------------------------------------------");

        customer.deleteCustomer();

    }


}
