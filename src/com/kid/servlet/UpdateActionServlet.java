package com.kid.servlet;

import com.kid.dao.ActionDao;
import com.kid.dao.UserDao;
import com.kid.dao.impl.ActionDaoImpl;
import com.kid.entity.ActionEntity;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/*
 *修改活动票信息
 */
@WebServlet(name = "UpdateActionServlet")
public class UpdateActionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        //设置编码格式
        request.setCharacterEncoding("UTF-8");
        //获取参数
        String topic = request.getParameter("topic");
        String status = request.getParameter("status");
        String date = request.getParameter("date");
        double price = Double.parseDouble(request.getParameter("price"));
        int id = (int)session.getAttribute("aid");
        //将数据存入实体类
        ActionEntity action = new ActionEntity(topic,status,date,price);
        //执行修改方法
        ActionDao actionDao = new ActionDaoImpl();
        int line = actionDao.updateAction(action,id);
        if(line==1){
            //修改成功 重定向至 selectaction Servlet
            //将修改后的值存入session中
            session.setAttribute("action",action);
            response.sendRedirect("selectaction");
        }else{
            //修改失败 重定向至 updateaction.jsp 页面
            response.sendRedirect("updateaction.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
