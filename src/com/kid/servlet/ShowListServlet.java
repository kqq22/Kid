package com.kid.servlet;

import com.kid.dao.ShowDao;
import com.kid.dao.impl.ShowDaoImpl;
import com.kid.entity.ShowEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class ShowListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //查询亲子活动表信息
        //初始化dao
        ShowDao dao = new ShowDaoImpl();
        int pageNum = 1;//页码
        int pageSize = 12;//大小
        String initPageNum = request.getParameter("pageNum");
        if (null != initPageNum){
            pageNum = Integer.parseInt(initPageNum);
        }
        //边界判断
        int max = dao.pageMaxPageNum(pageSize);
        if (pageNum<=1){
            pageNum=1;
        }
        if (pageNum>max){
            pageNum=max;
        }
        //执行查询方法
        List<ShowEntity> list = dao.show(pageNum,pageSize);
        //将结果保存
        session.setAttribute("showList",list);
        //保存当前页码
        session.setAttribute("pageNum",pageNum);
        //保存最大页码
        session.setAttribute("maxNum",max);
        //重定向至qzhd.jsp
        response.sendRedirect("hdzs.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
