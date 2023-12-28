package com.misakana.starmisakana.Controller;

import com.github.pagehelper.Page;
import com.misakana.starmisakana.compent.PageResult;
import com.misakana.starmisakana.compent.R;
import com.misakana.starmisakana.pojo.Task;
import com.misakana.starmisakana.service.TaskService;
import com.misakana.starmisakana.vo.TaskVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;
    @GetMapping("/findList")
    @CrossOrigin("*")
    public R<List<Task>> findList() {

        List<Task> list= taskService.findList();
        if(list==null){
            return R.fail("查询失败");
        }

        return R.success(list);

    }
    @GetMapping("/findPages")
    public R<Task> findPages(Integer pageNo, Integer pageSize) {
        PageResult pages = taskService.findPage(pageNo,pageSize);

        //if(ObjectUtils.isE)
        return R.success(pages);
        /*PageResult pages = taskService.findPages(pageNo, pageSize);
        return R.success(pages);*/
    }
    @PostMapping("/findPages2")
    public R<Task> findPages2(@RequestBody TaskVo taskVo,Integer pageNo, Integer pageSize) {
        PageResult pages = taskService.findPage(pageNo,pageSize);

        //if(ObjectUtils.isE)
        return R.success(pages);
        /*PageResult pages = taskService.findPages(pageNo, pageSize,TaskVo);
        return R.success(pages);*/
    }
}
