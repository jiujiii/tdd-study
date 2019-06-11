package com.study.tdd.se.testfw;

import org.testng.annotations.*;

@Test
public class TestNg {

    @Test(groups = "group1")
    public void demo1(){
        System.out.println("demo1");
    }

    private void demo2(){
        System.out.println("demo2");
    }

    @Test(expectedExceptions = RuntimeException.class,groups = {"group2"})
    public void demo3(){
        System.out.println("demo3,throw RuntimeException");
        throw new RuntimeException();
    }

    @BeforeMethod
    public void demo4(){
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void demo5(){
        System.out.println("@AfterMethod");
    }

    @Test(enabled = false)
    public void demo6(){
        System.out.println("demo6");
    }

    @BeforeClass
    public void demo7(){
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public void demo8(){
        System.out.println("@AfterClass");
    }

    @BeforeGroups("group1")
    public void demo9(){
        System.out.println("@BeforeGroups(\"group1\")");
    }

    @AfterGroups("group1")
    public void demo10(){
        System.out.println("@AfterGroups(\"group1\")");
    }

    @BeforeTest
    public void demo11(){
        System.out.println("@BeforeTest");
    }

    @AfterTest
    public void demo12(){
        System.out.println("@AfterTest");
    }
}
/*
  TestNg
  \@Test 注解可以直接作用在整个类上,类上所有 public 方法都被视为测试
       \groups 可以指定该单元测试的所属组别
       \expectedExceptions 指定该单元测试应该抛出的异常
  \@BeforeMethod @AfterMethod 在每个执行 test 测试前后都执行
  \@BeforeClass @AfterClass 在整个测试类前后执行
 */