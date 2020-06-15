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
 * 修改旅游票信息
 */
@WebServlet(name = "UpdateTravelServlet")
public class UpdateTravelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //设置编码格式、
        request.setCharacterEncoding("UTF-8");
        //获取参数
        String topic = request.getParameter("topic");
        String address = request.getParameter("address");
        int age = Integer.parseInt(request.getParameter("age"));
        String daytour = request.getParameter("daytour");
        double price = Double.parseDouble(request.getParameter("price"));
        int id = (int)session.getAttribute("tid");
        //将数据存入实体类
        TravelEntity travel = new TravelEntity(topic,address,age,daytour,price);
        //执行修改方法
        TravelDao actionDao = new TravelDaoImpl();
        int line = actionDao.updateTravel(travel,id);
        if(line==1){
            //修改成功 重定向至 selecttravel Servlet页面
            //将修改后的值存入session中
            session.setAttribute("travel",travel);
            response.sendRedirect("selecttravel");
        }else{
            //修改失败 重定向至 updatetravel.jsp 页面
            response.sendRedirect("updatetravel.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
