package com.google.sps.servlets;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greetings")
public class GreetingsServlet extends HttpServlet {
  private ArrayList<String> greetings = new ArrayList<String>();

  public GreetingsServlet() {
    greetings.add("Bonjour");
    greetings.add("Hola");
    greetings.add("Привет");
    greetings.add("你好");
    greetings.add("こんにちは");
    greetings.add("안녕하세요");
    greetings.add("Olá");
    greetings.add("مرحبا");
    greetings.add("γεια σας");
    greetings.add("Hello");
  }

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String json = convertToJson();
    
    response.setContentType("application/json; charset=UTF-8");
    response.getWriter().println(json);
  }

  private String convertToJson(){
    String json = "{";
    json += "\"size \": " + "\"" + String.valueOf(greetings.size()) + "\", ";

    for(int indx = 0; indx < greetings.size(); indx++){
        json+= "\"greeting" + indx + "\": ";
        json+= "\"" + greetings.get(indx) +"\"";

        if(indx != (greetings.size() - 1)) json+= ", ";
    }

    json+="}";
    return json;
  }
}
