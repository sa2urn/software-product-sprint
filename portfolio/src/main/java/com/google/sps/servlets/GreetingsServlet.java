package com.google.sps.servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greetings")
public class GreetingsServlet extends HttpServlet {
  private String[] greetings = {"Bonjour", "Hola", "Привет", "你好", "こんにちは", "안녕하세요", "Olá", "مرحبا", "γεια σας", "Hello"};

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    int greetingChosen = (int) (Math.random() * ((greetings.length - 1) - 0 + 1) + 0);
    
    response.setContentType("text/html; charset=UTF-8");
    response.getWriter().println(greetings[greetingChosen]);
  }
}
