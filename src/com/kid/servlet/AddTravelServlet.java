package com.kid.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jspsmart.upload.File;
import com.jspsmart.upload.SmartUpload;
import com.jspsmart.upload.SmartUploadException;

import com.kid.dao.TravelDao;
import com.kid.dao.impl.TravelDaoImpl;
import com.kid.entity.TravelEntity;

/**
 * 添加旅游票
 */
@WebServlet(name = "AddTravelServlet")
public class AddTravelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        //获取PageContext对象
        javax.servlet.jsp.PageContext pageContext = null;
        javax.servlet.jsp.JspFactory jspxFactory =
                javax.servlet.jsp.JspFactory.getDefaultFactory();
        pageContext = jspxFactory.getPageContext(this, request, response,
                null, true, 8192, true);
        //创建工具对象
        SmartUpload su = new SmartUpload();
        //设置编码格式
        su.setCharset("UTF-8");
        //初始化工具
        su.initialize(pageContext);
        //上传数据
        try{
            su.upload();
        }catch (SmartUploadException e){
            e.printStackTrace();
        }
        //获取参数
        String topic = su.getRequest().getParameter("topic");
        String address = su.getRequest().getParameter("address");
        double price = Double.parseDouble(su.getRequest().getParameter("price"));
        int age = Integer.parseInt(su.getRequest().getParameter("age"));
        String daytour = su.getRequest().getParameter("daytour");
        //获取图片
        File pic = su.getFiles().getFile(0);
        try{
            pic.saveAs("Picture/"+pic.getFileName());
        }catch (SmartUploadException e){
            e.printStackTrace();
        }

        //创建travel对象
        TravelEntity travel = new TravelEntity(topic,address,price,age,daytour,"Picture/"+pic.getFileName());
        //调用添加方法
        TravelDao travelDao = new TravelDaoImpl();
        int row = travelDao.insertTravel(travel);
        if(row==1){
            //重定向至 selecttravel Servlet页面
            response.sendRedirect("selecttravel");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
