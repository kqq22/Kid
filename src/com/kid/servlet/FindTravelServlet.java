package com.kid.servlet;

import com.kid.dao.TravelDao;
import com.kid.dao.impl.TravelDaoImpl;
import com.kid.entity.TravelEntity;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/*
 * 根据id查询亲子旅游表信息
 */
@WebServlet(name = "FindTravelServlet")
public class FindTravelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //获取参数
        int id = Integer.parseInt(request.getParameter("id"));
        //初始化dao
        TravelDao travelDao = new TravelDaoImpl();
        //执行查询方法
        TravelEntity travel = travelDao.findTravel(id);
        //将结果保存
        session.setAttribute("tid",id);
        session.setAttribute("findtravel",travel);
        //重定向至  updatetravel.js  页面
        response.sendRedirect("updatetravel.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
