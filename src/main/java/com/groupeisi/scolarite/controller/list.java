package com.groupeisi.scolarite.controller;

import com.groupeisi.scolarite.dao.IUser;
import com.groupeisi.scolarite.dao.UserImpl;
import com.groupeisi.scolarite.entities.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/List")
public class list extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IUser udao = new UserImpl();
        User u = new User();
        List<User> users = udao.list(u);

        req.setAttribute("users", users);
        req.getRequestDispatcher("/vue/user/list.jsp").forward(req, resp);
    }
}
