//package org.abc.StepDefinitions;
//
//import io.cucumber.java.*;
//
//public class hooksSteps {
//
//    @Before(order = 1)
//    public void setup(){
//        System.out.println("before scenario prior1");
//    }
//    @Before(order = 0)
//    public void setup1(){
//        System.out.println("before scenario prior0");
//    }
//
//    @After(order = 0)
//    public void tearDown(){
//        System.out.println("after scenario prior 0");
//    }
//    @After(order = 1)
//    public void tearDown1(){
//        System.out.println("after scenario prior 1");
//    }
//
//    @BeforeStep
//    public void beforesteps(){
//        System.out.println("before steps");
//    }
//
//    @BeforeAll
//    public static void before_or_after_all(){
//        System.out.println("Before All steps");
//    }
//
//    @AfterAll
//    public static void afterall(){
//        System.out.println("after all steps");
//    }
//
//    @Before(value = "@imp")
//    public void beforeannotation(){
//        System.out.println("before imp annotation");
//    }
//
//}
