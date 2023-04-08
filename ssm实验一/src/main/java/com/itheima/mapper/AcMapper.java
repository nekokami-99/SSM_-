package com.itheima.mapper;

import com.itheima.pojo.Ac;

import java.util.List;
import java.util.Map;

public interface AcMapper {

     List<Ac> selectAll1();
     List<Ac> selectAllSid();

    Ac selectById1(int id);

//* ������ѯ
// 1.ɢװ����������ж����������Ҫʹ��@Param(��sql����ռλ�����ơ�)
    //List<Brand> selectByCondition(@Param("status") int status, @Param("companyName") String
    //companyName,@Param("brandName") String brandName);
 //2.�������
    //List<Brand> selectByCondition(Brand brand);
 //3.map���ϲ���
    List<Ac> selectByCondition1(Map map);
    List<Ac> selectByCS1(Map map);
    void add1(Map map);
    int update1(Map map);
    void deleteById1(int id);
    void deleteByIds1(int []ids);
}
