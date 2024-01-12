package com.legonego.mapper;

import com.legonego.domain.Notice;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {
    List<Notice> noticeList();
    Notice getNotice(Integer no);
    int insertNotice(Notice notice);
    int updateNotice(Notice notice);
    int deleteNotice(Integer no);
    int visitCount(Integer no);
}
