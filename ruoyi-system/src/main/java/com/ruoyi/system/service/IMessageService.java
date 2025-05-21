package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Message;

/**
 * 光子版本信息Service接口
 * 
 * @author jcl
 * @date 2025-05-21
 */
public interface IMessageService 
{
    /**
     * 查询光子版本信息
     * 
     * @param id 光子版本信息主键
     * @return 光子版本信息
     */
    public Message selectMessageById(Long id);

    /**
     * 查询光子版本信息列表
     * 
     * @param message 光子版本信息
     * @return 光子版本信息集合
     */
    public List<Message> selectMessageList(Message message);

    /**
     * 新增光子版本信息
     * 
     * @param message 光子版本信息
     * @return 结果
     */
    public int insertMessage(Message message);

    /**
     * 修改光子版本信息
     * 
     * @param message 光子版本信息
     * @return 结果
     */
    public int updateMessage(Message message);

    /**
     * 批量删除光子版本信息
     * 
     * @param ids 需要删除的光子版本信息主键集合
     * @return 结果
     */
    public int deleteMessageByIds(String ids);

    /**
     * 删除光子版本信息信息
     * 
     * @param id 光子版本信息主键
     * @return 结果
     */
    public int deleteMessageById(Long id);
}
