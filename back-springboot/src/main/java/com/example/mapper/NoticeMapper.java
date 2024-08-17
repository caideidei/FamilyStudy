package com.example.mapper;

import com.example.entity.Notice;

import java.util.List;

public interface NoticeMapper {
    //向前端返回notice表中所有数据
    List<Notice> selectAllNotices1();
    //根据id删除数据
    int deleteById1(Integer noticeId);
    //更改信息
    int updateNotice1(Notice notice);
}
