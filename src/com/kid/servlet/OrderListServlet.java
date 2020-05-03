package com.kid.servlet;

import com.kid.dao.OrderDao;
import com.kid.dao.impl.OrderDaoImpl;
import com.kid.entity.OrderEntity;
import com.kid.entity.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "OrderListServlet")
public class OrderListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //获取参数
        UserEntity user = (UserEntity)session.getAttribute("user");
        String name = user.getName();//用户名
        //查询亲子活动表信息
        //初始化dao
        OrderDao dao = new OrderDaoImpl();
        int pageNum = 1;//页码
        int pageSize = 3;//大小
        String initPageNum = request.getParameter("pageNum");
        if (null != initPageNum){
            pageNum = Integer.parseInt(initPageNum);
        }
        //边界判断
        int max = dao.pageMaxPageNum(pageSize,name);
        if (pageNum<=1){
            pageNum=1;
        }
        if (pageNum>max){
            pageNum=max;
        }
        //执行查询方法
        List<OrderEntity> list = dao.showOrder(pageNum,pageSize,name);
        //将结果保存
        session.setAttribute("orderList",list);
        //保存当前页码
        session.setAttribute("pageNum",pageNum);
        //保存最大页码
        session.setAttribute("maxNum",max);
        //重定向至wddd.jsp
        response.sendRedirect("wddd.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
