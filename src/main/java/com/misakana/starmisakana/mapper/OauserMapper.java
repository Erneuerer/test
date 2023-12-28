package com.misakana.starmisakana.mapper;

import com.misakana.starmisakana.pojo.Oauser;
import com.misakana.starmisakana.pojo.OauserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OauserMapper {
    int countByExample(OauserExample example);

    int deleteByExample(OauserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Oauser record);

    int insertSelective(Oauser record);

    List<Oauser> selectByExample(OauserExample example);

    Oauser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Oauser record, @Param("example") OauserExample example);

    int updateByExample(@Param("record") Oauser record, @Param("example") OauserExample example);

    int updateByPrimaryKeySelective(Oauser record);

    int updateByPrimaryKey(Oauser record);
}