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
import java.util.List;

/*
 * 查询亲子旅游表信息
 */
@WebServlet(name = "SelectTravelServlet")
public class SelectTravelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //初始化dao
        TravelDao travelDao = new TravelDaoImpl();
        //执行查询方法
        List<TravelEntity> travelList = travelDao.selectTravel();
        //将结果保存
        session.setAttribute("travelList",travelList);
        //重定向至 managertravel.jsp 页面
        response.sendRedirect("managertravel.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
