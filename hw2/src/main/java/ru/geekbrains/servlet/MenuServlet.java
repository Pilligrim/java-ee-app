package ru.geekbrains.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MenuServlet", urlPatterns = "/menu")
public class MenuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("<ul class=\"menu\">\n" +
                "  <li><a href=\"" + req.getContextPath() + "/main\">Магазин</a></li>\n" +
                "  <li><a href=\"" + req.getContextPath() + "/catalog\">Каталог товаров</a></li>\n" +
                "  <li><a href=\"" + req.getContextPath() + "/product\">Товар</a></li>\n" +
                "  <li><a href=\"" + req.getContextPath() + "/cart\">Корзина</a></li>\n" +
                "  <li><a href=\"" + req.getContextPath() + "/order\">Оформление заказа</a></li>\n" +
                "</ul>");
    }
}
