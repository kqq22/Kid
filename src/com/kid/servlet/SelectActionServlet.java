package com.kid.servlet;

import com.kid.dao.ActionDao;
import com.kid.dao.impl.ActionDaoImpl;
import com.kid.entity.ActionEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/*
 *查询亲子活动表信息
 */
@WebServlet(name = "SelectActionServlet")
public class SelectActionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //初始化dao
        ActionDao dao = new ActionDaoImpl();
        //执行查询方法
        List<ActionEntity> actionList = dao.selectAction();
        //将结果保存
        session.setAttribute("actionList",actionList);
        //重定向至manageraction.jsp页面
        response.sendRedirect("manageraction.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
