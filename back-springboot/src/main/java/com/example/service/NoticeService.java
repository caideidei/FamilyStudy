package com.example.service;

import com.example.entity.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> selectAllNotices2();

    int deleteById2(Integer noticeId);

    int updateNotice2(Notice notice);

    int insertNotice2(Notice notice);

}
