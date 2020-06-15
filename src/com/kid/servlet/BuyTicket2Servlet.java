package com.kid.servlet;

import com.kid.dao.OrderDao;
import com.kid.dao.OrderDetailsDao;
import com.kid.dao.impl.OrderDaoImpl;
import com.kid.dao.impl.OrderDetailsDaoImpl;
import com.kid.entity.TicketEntity;
import com.kid.entity.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
/*
 * 买票
 */
@WebServlet(name = "Servlet5")
public class BuyTicket2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取参数
        HttpSession session = request.getSession();
        UserEntity user = (UserEntity) session.getAttribute("user");  //用户对象
        List<TicketEntity> list = (List<TicketEntity>) session.getAttribute("ticketlyList");  //票务集合
        int count = Integer.parseInt(request.getParameter("count"));  //数量
        String address = request.getParameter("address");
        //增加订单表记录
        OrderDao orderDao = new OrderDaoImpl();
        int orderLine = orderDao.addOrder(list,count,user);
        //增加订单详情表信息
        OrderDetailsDao orderDetailsDao = new OrderDetailsDaoImpl();
        int orderdetLine = orderDetailsDao.addOrderDeails(list,user,count);
        if (orderLine>=1&&orderdetLine>=1){
            //购买成功  重定向至 order Servlet页面
            response.sendRedirect("order?pageNum=1");
        }else{
            //购买失败  重定向至 qzly-1.jsp
           response.sendRedirect("qzly-1.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
