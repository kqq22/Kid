package com.kid.servlet;

import com.jspsmart.upload.File;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;
import com.kid.dao.ShowTicketDao;
import com.kid.dao.impl.ShowTicketDaoImpl;
import com.kid.entity.ShowTicketEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 添加票务
 */
@WebServlet(name = "AddShowTicketServlet")
public class AddShowTicketServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        //获取pageContext对象
        javax.servlet.jsp.PageContext pageContext = null;
        javax.servlet.jsp.JspFactory jspxFactory =
                javax.servlet.jsp.JspFactory.getDefaultFactory();
        pageContext = jspxFactory.getPageContext(this, request, response,
                null, true, 8192, true);

        //1.创建工具对象
        SmartUpload su = new SmartUpload();
        //2.设置编码
        su.setCharset("UTF-8");
        //3.初始化工具
        su.initialize(pageContext);
        //上传数据
        try {
            su.upload();
        } catch (SmartUploadException e1) {
            e1.printStackTrace();
        }

        //获取参数
        String topic = su.getRequest().getParameter("topic");
        double price = Double.parseDouble(su.getRequest().getParameter("price"));
        double mprice = Double.parseDouble(su.getRequest().getParameter("mprice"));
        //获取图片
        File pic = su.getFiles().getFile(0);

        try {
            pic.saveAs("Picture/"+pic.getFileName());
        } catch (SmartUploadException e) {
            e.printStackTrace();
        }
        //创建action对象
       ShowTicketEntity ticket = new ShowTicketEntity(topic,price,mprice,"Picture/"+pic.getFileName());
        //调用添加方法
        ShowTicketDao showTicketDao = new ShowTicketDaoImpl();
        int row = showTicketDao.insertShowTicket(ticket);
        if(row==1){
            //重定向至 selectshowticket Servlet页面
            response.sendRedirect("selectshowticket");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
