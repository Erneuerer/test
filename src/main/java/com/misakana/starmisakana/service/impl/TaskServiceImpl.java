package com.misakana.starmisakana.service.impl;

import ch.qos.logback.core.util.DatePatternToRegexUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.misakana.starmisakana.compent.Compent;
import com.misakana.starmisakana.compent.PageResult;
import com.misakana.starmisakana.mapper.TaskMapper;
import com.misakana.starmisakana.pojo.Task;
import com.misakana.starmisakana.pojo.TaskExample;
import com.misakana.starmisakana.service.TaskService;
import com.misakana.starmisakana.vo.TaskVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import com.misakana.starmisakana.util.DateUtil;
import org.springframework.util.ObjectUtils;

import java.util.List;

import static com.misakana.starmisakana.compent.Compent.is_delete;

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
        System.out.println(tasks.getTotal());
        return new PageResult(pageNo,pageSize,tasks.getTotal(), tasks.getResult());

    }
    @Override
    public PageResult findPage2(TaskVo taskVo, int pageNo, int pageSize) {
// 开始分页
        PageHelper.startPage(pageNo, pageSize);
        TaskExample example = new TaskExample();
        TaskExample.Criteria criteria = example.createCriteria();
        if(!ObjectUtils.isEmpty(taskVo.getStartTime()))
        {
            Date startDate= DateUtil.getDate(taskVo.getStartTime());
            criteria.andLauchtimeGreaterThan(startDate);
        }
        if(!ObjectUtils.isEmpty(taskVo.getEndTime())) {

            Date endDate = DateUtil.getDate(taskVo.getEndTime());
            criteria.andLauchtimeLessThan(endDate);
        }
        if(!ObjectUtils.isEmpty(taskVo.getState())) {

            criteria.andStateEqualTo(taskVo.getState());
        }
        if(!ObjectUtils.isEmpty(taskVo.getTypeid())) {

            criteria.andTypeidEqualTo(taskVo.getTypeid());
        }
        criteria.andIsdeleteEqualTo(is_delete);
        // 查询分页数据
        Page<Task> tasks = (Page<Task>)taskMapper.selectByExample(example);
        return new PageResult(tasks.getTotal(), tasks.getResult());

    }


}
