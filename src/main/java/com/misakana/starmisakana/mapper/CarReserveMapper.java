package com.misakana.starmisakana.mapper;

import com.misakana.starmisakana.pojo.CarReserve;
import com.misakana.starmisakana.pojo.CarReserveExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarReserveMapper {
    int countByExample(CarReserveExample example);

    int deleteByExample(CarReserveExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarReserve record);

    int insertSelective(CarReserve record);

    List<CarReserve> selectByExample(CarReserveExample example);

    CarReserve selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarReserve record, @Param("example") CarReserveExample example);

    int updateByExample(@Param("record") CarReserve record, @Param("example") CarReserveExample example);

    int updateByPrimaryKeySelective(CarReserve record);

    int updateByPrimaryKey(CarReserve record);
}