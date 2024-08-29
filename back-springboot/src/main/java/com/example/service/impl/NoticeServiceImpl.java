package com.example.service.impl;

import com.example.entity.Notice;
import com.example.mapper.NoticeMapper;
import com.example.service.NoticeService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {

    @Resource
//    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> selectAllNotices2() {
        List<Notice> notices = noticeMapper.selectAllNotices1();
        return notices;
    }

    @Override
    public int deleteById2(Integer noticeId) {
        int i = noticeMapper.deleteById1(noticeId);
        return i;
    }

    @Override
    public int updateNotice2(Notice notice) {
        if(notice.getNoticeTime()==null){
            notice.setNoticeTime(String.valueOf(LocalDateTime.now()));
        }
        int i = noticeMapper.updateNotice1(notice);
        return i;
    }

    @Override
    public int insertNotice2(Notice notice) {
        if(notice.getNoticeTime()==null){
            notice.setNoticeTime(String.valueOf(LocalDateTime.now()));
        }
        int i = noticeMapper.insertNotice1(notice);
        return i;
    }


}
