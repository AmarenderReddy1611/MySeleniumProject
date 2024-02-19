package com.qa.banking.TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogTest {


    @BeforeMethod
    public void test1(){


        System.out.println("this is test1");
    }
    @Test
    public void test2(){

        System.out.println("this is test2");
    }
    @Test
    public void test3(){

        System.out.println("this is test3");
    }


}

