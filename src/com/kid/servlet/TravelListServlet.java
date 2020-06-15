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

@WebServlet(name = "Servlet")
public class TravelListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //get设置编码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        HttpSession session = request.getSession();
        //查询亲子活动表信息
        //初始化dao
       TravelDao dao = new TravelDaoImpl();
        int pageNum = 1;//页码
        int pageSize = 12;//大小
        String dayTour = "";
        String idayTour = request.getParameter("dayTour");;//几日游类型
        String initPageNum = request.getParameter("pageNum");
        if (null != initPageNum){
            pageNum = Integer.parseInt(initPageNum);
        }
        if (null != idayTour){
            //dayTour = new String(request.getParameter("dayTour").getBytes("iso8859-1"),"UTF-8");
            dayTour = request.getParameter("dayTour");
        }
        //边界判断
        int max = dao.pageMaxPageNum(pageSize,"%"+dayTour+"%");
        if (pageNum<=1){
            pageNum=1;
        }
        if (pageNum>max){
            pageNum=max;
        }
        //执行查询方法
        List<TravelEntity> list = dao.showTravel(pageNum,pageSize,"%"+dayTour+"%");
        //将结果保存
        session.setAttribute("travelList",list);
        //保存当前页码
        session.setAttribute("pageNum",pageNum);
        //保存最大页码
        session.setAttribute("maxNum",max);
        //重定向至qzly.jsp
        response.sendRedirect("qzly.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
