package com.legonego.mapper;

import com.legonego.domain.Faq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FaqMapper {
    List<Faq> faqList() throws Exception;
}
