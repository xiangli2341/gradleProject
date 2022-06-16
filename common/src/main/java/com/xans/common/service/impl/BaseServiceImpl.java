package com.xans.common.service.impl;

import com.xans.common.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService {
    @Override
    public String getStr() {
        return "Hi";
    }
}
