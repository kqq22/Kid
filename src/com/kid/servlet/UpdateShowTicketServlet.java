package com.kid.servlet;

import com.kid.dao.ShowTicketDao;
import com.kid.dao.impl.ShowTicketDaoImpl;
import com.kid.entity.ShowTicketEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/*
 *修改票务信息
 */
@WebServlet(name = "UpdateShowTicketServlet")
public class UpdateShowTicketServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //设置编码格式、
        request.setCharacterEncoding("UTF-8");
        //获取参数
        String topic = request.getParameter("topic");
        double price = Double.parseDouble(request.getParameter("price"));
        double mprice = Double.parseDouble(request.getParameter("mprice"));
        int id = (int)session.getAttribute("tid");
        //将数据存入实体类
        ShowTicketEntity showTicket = new ShowTicketEntity(topic,price,mprice);
        //执行修改方法
        ShowTicketDao showTicketDao = new ShowTicketDaoImpl();
        int line = showTicketDao.updateShowTicket(showTicket,id);
        if(line==1){
            //修改成功 重定向至 selectshowticket Servlet页面
            //将修改后的值存入session中
            session.setAttribute("showTicket",showTicket);
            response.sendRedirect("selectshowticket");
        }else{
            //修改失败  重定向至 updateticket.jsp 页面
            response.sendRedirect("updateticket.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
