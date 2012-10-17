package demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import atg.servlet.*;

public class TestService extends DynamoServlet {

  int age;

  public TestService () {
    System.out.println ("Constructing TestService");
  }

  public void service (DynamoHttpServletRequest request, DynamoHttpServletResponse response) throws ServletException, IOException
  {
    System.out.println ("servicing TestService "+age);
    ServletOutputStream out = response.getOutputStream();
    out.println ("World! My age is "+age);
  }

  public int getAge () { return age; }

  public void setAge (int age) {
    System.out.println ("setting age of TestService to " + age);
    this.age = age;
  }
}