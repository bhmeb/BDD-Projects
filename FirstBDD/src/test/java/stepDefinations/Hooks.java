package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@MobileTest")
    public void beforeValidation(){
        System.out.println("Mobile before hook");
    }

    @After("@MobileTest")
    public void afterValidation(){
        System.out.println("Mobile after hook");
    }

    @Before("@WebTest")
    public void beforeWebValidation(){
        System.out.println("Before Web browser hook");
    }

    @After("@WebTest")
    public void afterWebValidation(){
        System.out.println("After Web browser hook");
    }
}
