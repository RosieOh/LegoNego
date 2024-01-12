package com.legonego.service;

import com.legonego.domain.Faq;
import com.legonego.mapper.FaqMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaqServiceImpl implements FaqService{
    @Autowired
    private FaqMapper faqMapper;

    @Override
    public List<Faq> faqList() throws Exception {
        return faqMapper.faqList();
    }
}
