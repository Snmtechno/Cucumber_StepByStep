package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before // Cucumber ın Annotation ı
    public void before()
    {
       // System.out.println("Senaryo başladı ?");
    }

    @After // Cucumber ın Annotation ı
    public void after()
    {
        //System.out.println("Senaryo bitti ?");
        // doğru çalışırsa burada quiti çağıracağım
        GWD.quitDriver();
    }

}
