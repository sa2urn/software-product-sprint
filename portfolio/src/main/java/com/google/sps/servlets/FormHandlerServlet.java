package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler")
public class FormHandlerServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String userName = request.getParameter("name-input");
    String userEmail = request.getParameter("email-input");
    String userMessage = request.getParameter("message-input");

    // Print the value so you can see it in the server logs.
    System.out.println("User name: " + userName.trim());
    System.out.println("User email: " + userEmail.trim());
    System.out.println("User message: " + userMessage.trim());

    // Write the value to the response so the user can see it.
    response.getWriter().println(convertToJson(userName, userEmail, userMessage));
  }

  private String convertToJson(String name, String email, String message){
    String json = "{";
    json += "\"name\": " + "\"" + name + "\", ";
    json += "\"email\": " + "\"" + email + "\", ";
    json += "\"message\": " + "\"" + message + "\"";
    json+="}";
    return json;
  }
}