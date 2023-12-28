package com.misakana.starmisakana.mapper;

import com.misakana.starmisakana.pojo.Vcard;
import com.misakana.starmisakana.pojo.VcardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VcardMapper {
    int countByExample(VcardExample example);

    int deleteByExample(VcardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vcard record);

    int insertSelective(Vcard record);

    List<Vcard> selectByExample(VcardExample example);

    Vcard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vcard record, @Param("example") VcardExample example);

    int updateByExample(@Param("record") Vcard record, @Param("example") VcardExample example);

    int updateByPrimaryKeySelective(Vcard record);

    int updateByPrimaryKey(Vcard record);
}