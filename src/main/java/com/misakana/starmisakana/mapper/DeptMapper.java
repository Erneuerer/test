package com.misakana.starmisakana.mapper;

import com.misakana.starmisakana.pojo.Dept;
import com.misakana.starmisakana.pojo.DeptExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {
    int countByExample(DeptExample example);

    int deleteByExample(DeptExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dept record);

    int insertSelective(Dept record);

    List<Dept> selectByExample(DeptExample example);

    Dept selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dept record, @Param("example") DeptExample example);

    int updateByExample(@Param("record") Dept record, @Param("example") DeptExample example);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}