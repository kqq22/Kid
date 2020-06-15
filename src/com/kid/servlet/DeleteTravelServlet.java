package com.kid.servlet;

import com.kid.dao.TravelDao;
import com.kid.dao.impl.TravelDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * 删除旅游票
 */
@WebServlet(name = "DeleteTravelServlet")
public class DeleteTravelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求编码格式
        request.setCharacterEncoding("UTF-8");
        //获取参数
        int id = Integer.parseInt(request.getParameter("id"));
        //调用删除方法
        TravelDao travelDao = new TravelDaoImpl();
        int line = travelDao.deleteTravel(id);
        if(line==1){
            //删除成功  重定向至  selecttravel  Servlet页面
            response.sendRedirect("selecttravel");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
