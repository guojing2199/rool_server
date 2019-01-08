package com.jing.rool_server.rest;

import com.alibaba.fastjson.JSONObject;
import com.jing.rool_server.api.RoolApi;
import com.jing.rool_server.api.dto.CustomerDto;
import com.jing.rool_server.api.dto.Node;
import com.jing.rool_server.api.dto.RoolDot;
import com.jing.rool_server.api.dto.RoolsDto;
import com.jing.rool_server.core.RoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName RoolController
 * @Description 控制类
 * @Author Administrator
 * @Date 2018/12/25 9:10
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "rool")
public class RoolController implements RoolApi{

    @Autowired
    private RoolService roolService;

    @Override
    public List<RoolDot> findRools(@RequestParam String key)throws Exception {
        return roolService.findAll(key);
    }

    /*@Override
    public String addRool(@RequestParam String a1, @RequestParam String a2, @RequestParam String a3, @RequestParam String a4, @RequestParam String a5, @RequestParam String a6, @RequestParam String a7, @RequestParam String a8, @RequestParam String a9, @RequestParam String a10) {
        RoolDot roolDot = new RoolDot();
        roolDot.setA1(a1);
        roolDot.setA2(a2);
        roolDot.setA3(a3);
        roolDot.setA4(a4);
        roolDot.setA5(a5);
        roolDot.setA6(a6);
        roolDot.setA7(a7);
        roolDot.setA8(a8);
        roolDot.setA9(a9);
        roolDot.setA10(a10);
        return roolService.addRool(roolDot);
    }*/

    @Override
    public String addRools(@RequestBody RoolDot roolDto)throws Exception {
        Node[] b1 = JSONObject.parseObject(roolDto.getA1(), Node[].class);
        Node[] b2 = JSONObject.parseObject(roolDto.getA2(), Node[].class);
        Node[] b3 = JSONObject.parseObject(roolDto.getA3(), Node[].class);
        Node[] b4 = JSONObject.parseObject(roolDto.getA4(), Node[].class);
        Node[] b5 = JSONObject.parseObject(roolDto.getA5(), Node[].class);
        Node[] b6 = JSONObject.parseObject(roolDto.getA6(), Node[].class);
        Node[] b7 = JSONObject.parseObject(roolDto.getA7(), Node[].class);
        Node[] b8 = JSONObject.parseObject(roolDto.getA8(), Node[].class);
        Node[] b9 = JSONObject.parseObject(roolDto.getA9(), Node[].class);
        Node[] b10 = JSONObject.parseObject(roolDto.getA10(), Node[].class);

        RoolsDto roolsDot = new RoolsDto();
        roolsDot.setA1(b1);
        roolsDot.setA2(b2);
        roolsDot.setA3(b3);
        roolsDot.setA4(b4);
        roolsDot.setA5(b5);
        roolsDot.setA6(b6);
        roolsDot.setA7(b7);
        roolsDot.setA8(b8);
        roolsDot.setA9(b9);
        roolsDot.setA10(b10);
        return roolService.addRools(roolsDot);
    }


    /**
     * 数组post添加方法
     */
/*    @Override
    public String addRools(@RequestBody RoolsDto roolsDto) {
        return roolService.addRools(roolsDto);
    }*/

    /**
     * 单数据添加方法
     */
    @Override
    public String addRool(@RequestBody RoolDot roolDto)throws Exception {
        return roolService.addRool(roolDto);
    }

    /**
     * 逻辑推荐
     * @return
     */
    @Override
    public List<RoolsDto> logicByCustomer(@RequestBody CustomerDto customerDto) throws Exception {
        List<RoolsDto> roolsDtos = new ArrayList<>();
        try {
            long start = System.currentTimeMillis();
            roolsDtos = roolService.logicByCustomer(customerDto);
            long end = System.currentTimeMillis();
            long time = end - start;
            System.out.println("本次计算用时："+time+"ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return roolsDtos;
    }

    @Override
    public Map<String, Object> findOne(String phone)throws Exception {
        return roolService.findOne(phone);
    }

}
