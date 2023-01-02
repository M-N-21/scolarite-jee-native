package com.groupeisi.scolarite.controller;

import com.groupeisi.scolarite.dao.IRole;
import com.groupeisi.scolarite.dao.IUser;
import com.groupeisi.scolarite.dao.RoleImpl;
import com.groupeisi.scolarite.dao.UserImpl;
import com.groupeisi.scolarite.dto.RoleDto;
import com.groupeisi.scolarite.entities.Roles;
import com.groupeisi.scolarite.service.IRoleDto;
import com.groupeisi.scolarite.service.RoleDtoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/Role", name = "role")
public class RoleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("vue/role/add.jsp").forward(req, resp);

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IRoleDto rdto = new RoleDtoImpl();
        RoleDto r = new RoleDto();
        r.setName(req.getParameter("name"));
        if (rdto.add(r)==1) {
            req.setAttribute("success", "Role ajouté avec succes!");
            //req.getRequestDispatcher("vue/role/list.jsp").forward(req, resp);
            doGet(req, resp);
        }
    }
}
