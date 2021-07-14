package com.jh.ssh.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface Demo {

    @Select("SELECT timu,ans from jh where timu like concat('%',#{ques},'%')")
    List<Map<String,Object>> getAns(String ques);

//    @Insert("insert into sub_ans values(#{id},#{timu})")
//    void insertTimu(String id, String timu);

}
