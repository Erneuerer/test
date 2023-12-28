package com.misakana.starmisakana.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.misakana.starmisakana.compent.PageResult;
import com.misakana.starmisakana.pojo.Task;
import com.misakana.starmisakana.pojo.TaskExample;
import com.misakana.starmisakana.vo.TaskVo;

import java.util.List;

public interface TaskService {
    public List<Task> findList();
    public PageResult findPage(int pageNo, int pageSize);

    public PageResult findPage2(TaskVo taskVo, int pageNo, int pageSize) ;



}
