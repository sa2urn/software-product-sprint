package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/planet-views")
public class PlanetViewServlet extends HttpServlet {
  
  private String[] planetNames = {"Jupiter", "Mars", "Neptune", "Saturn"};
  private String[] planets = {"/images/jupi2er.gif", "/images/mars.gif", "/images/nep2un.gif", "/images/sa2urn.gif"};
  private String[] facts = {"The 5th planet from the Sun.", "The 4th planet from the Sun.", "The 8th planet from the Sun.", "The 6th planet from the Sun."};
  private String[] facts2 = {"The largest planet in the Solar System.","Sunsets on Mars are blue.","Neptune has 6 faint rings.","Has 150 moons."};

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    int planetChosen = (int)(Math.random() * ((planets.length - 1)  - 0 + 1) + 0);

    response.setContentType("text/html");
    response.getWriter().println("<body background=\"/images/space.jpg\" style=\"font-family: Verdana, sans-serif;color:white; text-align:center; background-color: rgb(0, 0, 0, 0.6); background-blend-mode: multiply;\">");
    response.getWriter().println("<h1 style=\"padding-top: 20px; font-size: 50px;\">" + planetNames[planetChosen] + "</h1>");
    response.getWriter().println("<img heigt=5% width= auto src=\"" + planets[planetChosen] + "\" alt=\"Planet image\">");
    response.getWriter().println("<h2 style=\"font-size:25px\">Facts</h2>");
    response.getWriter().println("<p style=\"font-size:20px\">" + facts[planetChosen] + "</p>");
    response.getWriter().println("<p style=\"font-size:20px\">" + facts2[planetChosen] + "</p>");
  }
}
