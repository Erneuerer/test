package com.misakana.starmisakana.service;

import com.misakana.starmisakana.compent.PageResult;
import com.misakana.starmisakana.pojo.Task;

import java.util.List;

public interface TaskService {
    public List<Task> findList();
    public PageResult findPage(int pageNo, int pageSize);


}
