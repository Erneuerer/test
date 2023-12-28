package com.misakana.starmisakana.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.misakana.starmisakana.compent.PageResult;
import com.misakana.starmisakana.mapper.TaskMapper;
import com.misakana.starmisakana.pojo.Task;
import com.misakana.starmisakana.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskMapper taskMapper;

    @Override
    public List<Task> findList() {
        return taskMapper.selectByExample(null);
    }

    /**
     * 查询分页数据
     *
     * @param pageNo   页码
     * @param pageSize 每页数量
     * @return 返回分页结果
     */
    @Override
    public PageResult findPage(int pageNo, int pageSize) {
// 开始分页
        PageHelper.startPage(pageNo, pageSize);
        // 查询分页数据
        Page<Task> tasks = (Page<Task>)taskMapper.selectByExample(null);
        return new PageResult(tasks.getTotal(), tasks.getResult());

    }


}
