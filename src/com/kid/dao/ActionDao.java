package com.kid.dao;

import com.kid.entity.ActionEntity;

import java.util.List;

/**
 * 亲子活动表接口类
 * @author Administrator
 *
 */
public interface ActionDao {
    /**
     * 分页查询所有票务信息
     * @param pageNum  页码
     * @param pageSize  每页显示多少行
     * @return  返回亲子活动表对象
     */
    public List<ActionEntity> showAction(int pageNum, int pageSize);

    /**
     * 查询最大页数
     * @param pageSize  每页显示几行
     * @return  返回最大页码数
     */
    public int pageMaxPageNum(int pageSize);

    /**
     * 添加活动票
     * @param action  活动票对象
     * @return  返回受影响行数
     */
    public int insertAction(ActionEntity action);

    /**
     * 查询所有活动票
     * @return  返回活动票对象
     */
    public List<ActionEntity> selectAction();

    /**
     * 根据id查询活动票
     * @param id  主键id
     * @return  返回活动票对象
     */
    public ActionEntity findAction(int id);

    /**
     * 修改活动票
     * @param action  活动票对象
     * @param id  根据主键修改
     * @return  返回受影响行数
     */
    public int updateAction(ActionEntity action,int id);

    /**
     * 删除活动票
     * @param id  根据主键修改
     * @return  返回受影响行数
     */
    public int deleteAction(int id);
}
