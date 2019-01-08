package com.jing.rool_server.core;

import com.jing.rool_server.api.dto.CustomerDto;
import com.jing.rool_server.api.dto.RoolDot;
import com.jing.rool_server.api.dto.RoolsDto;

import java.util.List;
import java.util.Map;

public interface RoolService {

    String addRool(RoolDot roolDto)throws Exception;

    List<RoolDot> findAll(String key)throws Exception;

    String addRools(RoolsDto roolsDot)throws Exception;

    List<RoolsDto> logicByCustomer(CustomerDto customerDto) throws Exception;

    Map<String, Object> findOne(String phone)throws Exception;
}