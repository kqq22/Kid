package com.kid.servlet;

import com.kid.dao.ShowTicketDao;
import com.kid.dao.impl.ShowTicketDaoImpl;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
 * 删除票务
 */
@WebServlet(name = "DeleteShowTicketServlet")
public class DeleteShowTicketServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置请求编码格式
        request.setCharacterEncoding("UTF-8");
        //获取参数
        int id = Integer.parseInt(request.getParameter("id"));
        //调用删除方法
        ShowTicketDao showTicketDao = new ShowTicketDaoImpl();
        int line = showTicketDao.deleteShowTicket(id);
        if(line==1){
            //删除成功  重定向至  selectshowticket  Servlet页面
            response.sendRedirect("selectshowticket");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
