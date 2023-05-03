package com.qa.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    String strChk= "";

    @BeforeMethod
    public void init(){
        System.out.println("BEFORE - T1 : " + strChk);
    }

    @Test
    public void sample1(){
        strChk = "sample1";
        System.out.println("Hi Maven Pjct - T1-S1");
    }

    @Test
    public void sample2(){
        strChk = "sample2";
        System.out.println("Hi Maven Pjct - T1-S2");
    }

    @AfterMethod
    public void teardown(){
        System.out.println("AFTER - T1 : " + strChk);
    }
}
