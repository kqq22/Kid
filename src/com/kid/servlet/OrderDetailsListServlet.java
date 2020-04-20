package com.kid.servlet;

import com.kid.dao.OrderDetailsDao;
import com.kid.dao.impl.OrderDetailsDaoImpl;
import com.kid.entity.OrderDetailsEntity;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "OrderDetailsListServlet")
public class OrderDetailsListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查询订单详情表信息
        //初始化dao
        OrderDetailsDao dao = new OrderDetailsDaoImpl();
        //获取参数
        int oid = Integer.parseInt(request.getParameter("orderid"));
        //执行查询方法
        List<OrderDetailsEntity> list = dao.showOrderDetails(oid);
        //将结果保存
        HttpSession session = request.getSession();
        session.setAttribute("orderdetailsList",list);
        //重定向至ddxq.jsp
        response.sendRedirect("ddxq.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
