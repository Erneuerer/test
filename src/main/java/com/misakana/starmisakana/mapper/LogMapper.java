package com.misakana.starmisakana.mapper;

import com.misakana.starmisakana.pojo.Log;
import com.misakana.starmisakana.pojo.LogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogMapper {
    int countByExample(LogExample example);

    int deleteByExample(LogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Log record);

    int insertSelective(Log record);

    List<Log> selectByExample(LogExample example);

    Log selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Log record, @Param("example") LogExample example);

    int updateByExample(@Param("record") Log record, @Param("example") LogExample example);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);
}