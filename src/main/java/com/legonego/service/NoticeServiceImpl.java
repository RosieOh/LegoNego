package com.legonego.service;

import com.legonego.domain.Notice;
import com.legonego.mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService{

    @Autowired
    private NoticeMapper noticeMapper;


    @Override
    public List<Notice> noticeList() {
        return noticeMapper.noticeList();
    }

    @Override
    public Notice getNotice(Integer no) {
        return noticeMapper.getNotice(no);
    }

    @Override
    public int insertNotice(Notice notice) {
        return noticeMapper.insertNotice(notice);
    }

    @Override
    public int updateNotice(Notice notice) {
        return noticeMapper.updateNotice(notice);
    }

    @Override
    public int deleteNotice(Integer no) {
        return noticeMapper.deleteNotice(no);
    }

    @Override
    public int visitCount(Integer no) {
        return noticeMapper.visitCount(no);
    }
}
