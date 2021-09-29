package jp.te4a.spring.boot.myapp1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest 
{

    @Test
    public void Test_index()
    {
        HelloController helloController = new HelloController();
        String expect ="Hello, Spring Boot!";
        String actual = helloController.index();
        assertEquals( expect,actual );
    }
}
