package com.jing.rool_server.api;

import com.jing.rool_server.api.dto.CustomerDto;
import com.jing.rool_server.api.dto.Node;
import com.jing.rool_server.api.dto.RoolDot;
import com.jing.rool_server.api.dto.RoolsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * @ClassName RoolApi
 * @Description 规则服务接口
 * @Author Administrator
 * @Date 2018/12/25 8:53
 * @Version 1.0
 **/
@FeignClient(value = "rool")
@CrossOrigin()
public interface RoolApi {
    /**
     * 获取规则
     * @param key
     * @return
     */
    @RequestMapping(value = "findRools",method = RequestMethod.GET)
    public List<RoolDot> findRools(String key)throws Exception;

    /**
     * 添加规则-暂不用
     * @param
     * @return
     */
    @RequestMapping(value = "addRool",method = RequestMethod.POST)
    public String addRool(@RequestBody RoolDot roolDto)throws Exception;

    /**
     * 添加规则
     * @param
     * @return
     */
    @RequestMapping(value = "addRools",method = RequestMethod.POST)
    public String addRools(@RequestBody RoolDot roolDto)throws Exception;

    /**
     * 逻辑推荐功能
     * @param
     * @return
     */
    @RequestMapping(value = "logicByCustomer",method = RequestMethod.POST)
    public List<RoolsDto> logicByCustomer(@RequestBody CustomerDto customerDto) throws Exception;

    /**
     * 根据用户号码获取策略
     * @param
     * @return
     */
    @RequestMapping(value = "findOne",method = RequestMethod.GET)
    public Map<String,Object> findOne (String phone)throws Exception;
}
