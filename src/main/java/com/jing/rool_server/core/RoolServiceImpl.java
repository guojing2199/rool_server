package com.jing.rool_server.core;

import com.jing.rool_server.api.dto.CustomerDto;
import com.jing.rool_server.api.dto.Node;
import com.jing.rool_server.api.dto.RoolDot;
import com.jing.rool_server.api.dto.RoolsDto;
import ognl.Ognl;
import ognl.OgnlException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RoolServiceImpl implements RoolService {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public String addRool(RoolDot roolDto) throws Exception{
        Assert.notNull(roolDto, "规则条件不能为null");
        if (null == roolDto) {
            return "1";
        }
        int key = 0;
        if (null != roolDto.getA1() && !"".equals(roolDto.getA1())) {
            key++;
        }
        if (null != roolDto.getA2() && !"".equals(roolDto.getA2())) {
            key++;
        }
        if (null != roolDto.getA3() && !"".equals(roolDto.getA3())) {
            key++;
        }
        if (null != roolDto.getA4() && !"".equals(roolDto.getA4())) {
            key++;
        }
        if (null != roolDto.getA5() && !"".equals(roolDto.getA5())) {
            key++;
        }
        if (null != roolDto.getA6() && !"".equals(roolDto.getA6())) {
            key++;
        }
        if (null != roolDto.getA7() && !"".equals(roolDto.getA7())) {
            key++;
        }
        if (null != roolDto.getA8() && !"".equals(roolDto.getA8())) {
            key++;
        }
        if (null != roolDto.getA9() && !"".equals(roolDto.getA9())) {
            key++;
        }
        if (null != roolDto.getA10() && !"".equals(roolDto.getA10())) {
            key++;
        }
        redisTemplate.opsForList().leftPush("a" + key, roolDto);
        return "0";
    }

    @Override
    public List<RoolDot> findAll(String key)throws Exception {
        List roolList = redisTemplate.opsForList().range(key, 0, -1);
        List<RoolDot> result = new ArrayList();
        StringBuffer buffer;
        for (int i = 0; i < roolList.size(); i++) {
            RoolDot roolDot = new RoolDot();
            RoolsDto roolsDto = (RoolsDto) roolList.get(i);
            Node[] a1 = roolsDto.getA1();
            buffer = new StringBuffer();
            if (a1 != null) {
                //String[] node1 = new String[a1.length];
                for (int k = 0; k < a1.length; k++) {
                    Node node = a1[k];
                    String nodeRes = node.getLogicFlag() + " " + "a1" + node.getFlag() + node.getValue();
                    buffer.append(nodeRes + " ");
                    //node1[k] = nodeRes;
                }
                roolDot.setA1(buffer.toString());
            }
            Node[] a2 = roolsDto.getA2();
            buffer = new StringBuffer();
            if (a2 != null) {
                //String[] node2 = new String[a2.length];
                for (int k = 0; k < a2.length; k++) {
                    Node node = a2[k];
                    String nodeRes = node.getLogicFlag() + " " + "a2" + node.getFlag() + node.getValue();
                    //node2[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA2(buffer.toString());

            }
            Node[] a3 = roolsDto.getA3();
            buffer = new StringBuffer();
            if (a3 != null) {
                //String[] node3 = new String[a3.length];
                for (int k = 0; k < a3.length; k++) {
                    Node node = a3[k];
                    String nodeRes = node.getLogicFlag() + " " + "a3" + node.getFlag() + node.getValue();
                    //node3[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA3(buffer.toString());

            }
            Node[] a4 = roolsDto.getA4();
            buffer = new StringBuffer();
            if (a4 != null) {
                //String[] node4 = new String[a4.length];
                for (int k = 0; k < a4.length; k++) {
                    Node node = a4[k];
                    String nodeRes = node.getLogicFlag() + " " + "a4" + node.getFlag() + node.getValue();
                    //node4[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA4(buffer.toString());

            }
            Node[] a5 = roolsDto.getA5();
            buffer = new StringBuffer();
            if (a5 != null) {
                //String[] node5 = new String[a5.length];
                for (int k = 0; k < a5.length; k++) {
                    Node node = a5[k];
                    String nodeRes = node.getLogicFlag() + " " + "a5" + node.getFlag() + node.getValue();
                    //node5[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA5(buffer.toString());

            }
            Node[] a6 = roolsDto.getA6();
            buffer = new StringBuffer();
            if (a6 != null) {
                //String[] node6 = new String[a6.length];
                for (int k = 0; k < a6.length; k++) {
                    Node node = a6[k];
                    String nodeRes = node.getLogicFlag() + " " + "a6" + node.getFlag() + node.getValue();
                    //node6[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA6(buffer.toString());

            }
            Node[] a7 = roolsDto.getA7();
            buffer = new StringBuffer();
            if (a7 != null) {
                //String[] node7 = new String[a7.length];
                for (int k = 0; k < a7.length; k++) {
                    Node node = a7[k];
                    String nodeRes = node.getLogicFlag() + " " + "a7" + node.getFlag() + node.getValue();
                    //node7[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA7(buffer.toString());

            }
            Node[] a8 = roolsDto.getA8();
            buffer = new StringBuffer();
            if (a8 != null) {
                //String[] node8 = new String[a8.length];
                for (int k = 0; k < a8.length; k++) {
                    Node node = a8[k];
                    String nodeRes = node.getLogicFlag() + " " + "a8" + node.getFlag() + node.getValue();
                    //node8[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA8(buffer.toString());

            }
            Node[] a9 = roolsDto.getA9();
            buffer = new StringBuffer();
            if (a9 != null) {
                //String[] node9 = new String[a9.length];
                for (int k = 0; k < a9.length; k++) {
                    Node node = a9[k];
                    String nodeRes = node.getLogicFlag() + " " + "a9" + node.getFlag() + node.getValue();
                    //node9[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA9(buffer.toString());

            }
            Node[] a10 = roolsDto.getA10();
            buffer = new StringBuffer();
            if (a10 != null) {
                //String[] node10 = new String[a10.length];
                for (int k = 0; k < a10.length; k++) {
                    Node node = a10[k];
                    String nodeRes = node.getLogicFlag() + " " + "a10" + node.getFlag() + node.getValue();
                    //node10[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA10(buffer.toString());
            }

            result.add(roolDot);
        }
        return result;
    }

    @Override
    public String addRools(RoolsDto roolsDot)throws Exception {
        Assert.notNull(roolsDot, "规则条件不能为null");
        if (null == roolsDot) {
            return "1";
        }
        int key = 0;
        if (null != roolsDot.getA1() && !"".equals(roolsDot.getA1())) {
            key++;
        }
        if (null != roolsDot.getA2() && !"".equals(roolsDot.getA2())) {
            key++;
        }
        if (null != roolsDot.getA3() && !"".equals(roolsDot.getA3())) {
            key++;
        }
        if (null != roolsDot.getA4() && !"".equals(roolsDot.getA4())) {
            key++;
        }
        if (null != roolsDot.getA5() && !"".equals(roolsDot.getA5())) {
            key++;
        }
        if (null != roolsDot.getA6() && !"".equals(roolsDot.getA6())) {
            key++;
        }
        if (null != roolsDot.getA7() && !"".equals(roolsDot.getA7())) {
            key++;
        }
        if (null != roolsDot.getA8() && !"".equals(roolsDot.getA8())) {
            key++;
        }
        if (null != roolsDot.getA9() && !"".equals(roolsDot.getA9())) {
            key++;
        }
        if (null != roolsDot.getA10() && !"".equals(roolsDot.getA10())) {
            key++;
        }
        redisTemplate.opsForList().leftPush("a" + key, roolsDot);
        return "0";
    }

    @Override
    public List<RoolsDto> logicByCustomer(CustomerDto customerDto) throws Exception {
        Assert.notNull(customerDto, "用户属性不能为null");
        if (null == customerDto) {
            return null;
        }

        int key = 0;
        if (null != customerDto.getA1() && !"".equals(customerDto.getA1())) {
            key++;
        }
        if (null != customerDto.getA2() && !"".equals(customerDto.getA2())) {
            key++;
        }
        if (null != customerDto.getA3() && !"".equals(customerDto.getA3())) {
            key++;
        }
        if (null != customerDto.getA4() && !"".equals(customerDto.getA4())) {
            key++;
        }
        if (null != customerDto.getA5() && !"".equals(customerDto.getA5())) {
            key++;
        }
        if (null != customerDto.getA6() && !"".equals(customerDto.getA6())) {
            key++;
        }
        if (null != customerDto.getA7() && !"".equals(customerDto.getA7())) {
            key++;
        }
        if (null != customerDto.getA8() && !"".equals(customerDto.getA8())) {
            key++;
        }
        if (null != customerDto.getA9() && !"".equals(customerDto.getA9())) {
            key++;
        }
        if (null != customerDto.getA10() && !"".equals(customerDto.getA10())) {
            key++;
        }
        //获取规则集
        List<RoolsDto> rools = redisTemplate.opsForList().range("a" + key, 0, -1);
        //根据客户属性进行筛选，匹配规则
        List<RoolsDto> res = new ArrayList<>();
        StringBuffer str;

        for (int i = 0; i < rools.size(); i++) {

            RoolsDto roolsDto = rools.get(i);
            Boolean isFlag =false;//判断标识
            if (null != roolsDto.getA1()&&!"".equals(customerDto.getA1())) {
                String a1 = customerDto.getA1();
                Node[] nodes1 = roolsDto.getA1();
                str = new StringBuffer();
                for (int j = 0; j < nodes1.length; j++) {
                    Node node = nodes1[j];
                    String flag = node.getFlag();
                    String value = node.getValue();
                    String logicFlag = node.getLogicFlag();
                    if (j > 0) {
                        if (logicFlag.equals("and")) {
                            str.append("&&");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        } else if (logicFlag.equals("or")) {
                            str.append("||");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        }
                    } else {
                        if (flag.equals("=")) {
                            str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                        } else if (flag.equals(">")) {
                            str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                        } else if (flag.equals("<")) {
                            str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                        } else if (flag.equals(">=")) {
                            str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                        } else if (flag.equals("<=")) {
                            str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                        } else if (flag.equals("!=")) {
                            str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                        }
                    }
                }

                isFlag = (Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class);
            }

            if (null != roolsDto.getA2()&&!customerDto.getA2().equals("")) {
                String a1 = customerDto.getA2();
                Node[] nodes1 = roolsDto.getA2();
                str = new StringBuffer();
                for (int j = 0; j < nodes1.length; j++) {
                    Node node = nodes1[j];
                    String flag = node.getFlag();
                    String value = node.getValue();
                    String logicFlag = node.getLogicFlag();
                    if (j > 0) {
                        if (logicFlag.equals("and")) {
                            str.append("&&");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        } else if (logicFlag.equals("or")) {
                            str.append("||");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        }
                    } else {
                        if (flag.equals("=")) {
                            str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                        } else if (flag.equals(">")) {
                            str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                        } else if (flag.equals("<")) {
                            str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                        } else if (flag.equals(">=")) {
                            str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                        } else if (flag.equals("<=")) {
                            str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                        } else if (flag.equals("!=")) {
                            str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                        }
                    }
                }
                if (null == roolsDto.getA1()&&customerDto.getA1().equals("")){
                    isFlag = (Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class);
                }else {
                isFlag = ((Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class)) && isFlag;}
            }else if (null != roolsDto.getA2()&&customerDto.getA2().equals("")){
                isFlag = false;
            }

            if (null != roolsDto.getA3()&&!customerDto.getA3().equals("")) {
                String a1 = customerDto.getA3();
                Node[] nodes1 = roolsDto.getA3();
                str = new StringBuffer();
                for (int j = 0; j < nodes1.length; j++) {
                    Node node = nodes1[j];
                    String flag = node.getFlag();
                    String value = node.getValue();
                    String logicFlag = node.getLogicFlag();
                    if (j > 0) {
                        if (logicFlag.equals("and")) {
                            str.append("&&");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        } else if (logicFlag.equals("or")) {
                            str.append("||");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        }
                    } else {
                        if (flag.equals("=")) {
                            str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                        } else if (flag.equals(">")) {
                            str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                        } else if (flag.equals("<")) {
                            str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                        } else if (flag.equals(">=")) {
                            str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                        } else if (flag.equals("<=")) {
                            str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                        } else if (flag.equals("!=")) {
                            str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                        }
                    }
                }
                if ((null == roolsDto.getA1()&&customerDto.getA1().equals(""))&&(null == roolsDto.getA2()&&customerDto.getA2().equals(""))){
                    isFlag = (Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class);
                }else {
                isFlag = ((Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class)) && isFlag;}
            }else if (null != roolsDto.getA3()&&customerDto.getA3().equals("")){
                isFlag = false;
            }

            if (null != roolsDto.getA4()&&!customerDto.getA4().equals("")) {
                String a1 = customerDto.getA4();
                Node[] nodes1 = roolsDto.getA4();
                str = new StringBuffer();
                for (int j = 0; j < nodes1.length; j++) {
                    Node node = nodes1[j];
                    String flag = node.getFlag();
                    String value = node.getValue();
                    String logicFlag = node.getLogicFlag();
                    if (j > 0) {
                        if (logicFlag.equals("and")) {
                            str.append("&&");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        } else if (logicFlag.equals("or")) {
                            str.append("||");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        }
                    } else {
                        if (flag.equals("=")) {
                            str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                        } else if (flag.equals(">")) {
                            str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                        } else if (flag.equals("<")) {
                            str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                        } else if (flag.equals(">=")) {
                            str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                        } else if (flag.equals("<=")) {
                            str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                        } else if (flag.equals("!=")) {
                            str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                        }
                    }
                }
                if ((null == roolsDto.getA1()&&customerDto.getA1().equals(""))&&(null == roolsDto.getA2()&&customerDto.getA2().equals(""))&&
                        (null == roolsDto.getA3()&&customerDto.getA3().equals(""))){
                    isFlag = (Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class);
                }else {
                    isFlag = ((Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class)) && isFlag;}
            }else if (null != roolsDto.getA4()&&customerDto.getA4().equals("")){
                isFlag = false;
            }

            if (null != roolsDto.getA5()&&!customerDto.getA5().equals("")) {
                String a1 = customerDto.getA5();
                Node[] nodes1 = roolsDto.getA5();
                str = new StringBuffer();
                for (int j = 0; j < nodes1.length; j++) {
                    Node node = nodes1[j];
                    String flag = node.getFlag();
                    String value = node.getValue();
                    String logicFlag = node.getLogicFlag();
                    if (j > 0) {
                        if (logicFlag.equals("and")) {
                            str.append("&&");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        } else if (logicFlag.equals("or")) {
                            str.append("||");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        }
                    } else {
                        if (flag.equals("=")) {
                            str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                        } else if (flag.equals(">")) {
                            str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                        } else if (flag.equals("<")) {
                            str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                        } else if (flag.equals(">=")) {
                            str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                        } else if (flag.equals("<=")) {
                            str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                        } else if (flag.equals("!=")) {
                            str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                        }
                    }
                }
                if ((null == roolsDto.getA1()&&customerDto.getA1().equals(""))&&(null == roolsDto.getA2()&&customerDto.getA2().equals(""))&&
                        (null == roolsDto.getA3()&&customerDto.getA3().equals(""))&&(null == roolsDto.getA4()&&customerDto.getA4().equals(""))){
                    isFlag = (Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class);
                }else {
                    isFlag = ((Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class)) && isFlag;}
            }else if (null != roolsDto.getA5()&&customerDto.getA5().equals("")){
                isFlag = false;
            }

            if (null != roolsDto.getA6()&&!customerDto.getA6().equals("")) {
                String a1 = customerDto.getA6();
                Node[] nodes1 = roolsDto.getA6();
                str = new StringBuffer();
                for (int j = 0; j < nodes1.length; j++) {
                    Node node = nodes1[j];
                    String flag = node.getFlag();
                    String value = node.getValue();
                    String logicFlag = node.getLogicFlag();
                    if (j > 0) {
                        if (logicFlag.equals("and")) {
                            str.append("&&");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        } else if (logicFlag.equals("or")) {
                            str.append("||");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        }
                    } else {
                        if (flag.equals("=")) {
                            str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                        } else if (flag.equals(">")) {
                            str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                        } else if (flag.equals("<")) {
                            str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                        } else if (flag.equals(">=")) {
                            str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                        } else if (flag.equals("<=")) {
                            str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                        } else if (flag.equals("!=")) {
                            str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                        }
                    }
                }
                if ((null == roolsDto.getA1()&&customerDto.getA1().equals(""))&&(null == roolsDto.getA2()&&customerDto.getA2().equals(""))&&
                        (null == roolsDto.getA3()&&customerDto.getA3().equals(""))&&(null == roolsDto.getA4()&&customerDto.getA4().equals(""))
                        &&(null == roolsDto.getA5()&&customerDto.getA5().equals(""))){
                    isFlag = (Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class);
                }else {
                    isFlag = ((Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class)) && isFlag;}
            }else if (null != roolsDto.getA6()&&customerDto.getA6().equals("")){
                isFlag = false;
            }

            if (null != roolsDto.getA7()&&!customerDto.getA7().equals("")) {
                String a1 = customerDto.getA7();
                Node[] nodes1 = roolsDto.getA7();
                str = new StringBuffer();
                for (int j = 0; j < nodes1.length; j++) {
                    Node node = nodes1[j];
                    String flag = node.getFlag();
                    String value = node.getValue();
                    String logicFlag = node.getLogicFlag();
                    if (j > 0) {
                        if (logicFlag.equals("and")) {
                            str.append("&&");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        } else if (logicFlag.equals("or")) {
                            str.append("||");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        }
                    } else {
                        if (flag.equals("=")) {
                            str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                        } else if (flag.equals(">")) {
                            str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                        } else if (flag.equals("<")) {
                            str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                        } else if (flag.equals(">=")) {
                            str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                        } else if (flag.equals("<=")) {
                            str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                        } else if (flag.equals("!=")) {
                            str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                        }
                    }
                }
                if ((null == roolsDto.getA1()&&customerDto.getA1().equals(""))&&(null == roolsDto.getA2()&&customerDto.getA2().equals(""))&&
                        (null == roolsDto.getA3()&&customerDto.getA3().equals(""))&&(null == roolsDto.getA4()&&customerDto.getA4().equals(""))
                        &&(null == roolsDto.getA5()&&customerDto.getA5().equals(""))&&(null == roolsDto.getA6()&&customerDto.getA6().equals(""))){
                    isFlag = (Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class);
                }else {
                    isFlag = ((Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class)) && isFlag;}
            }else if (null != roolsDto.getA7()&&customerDto.getA7().equals("")){
                isFlag = false;
            }

            if (null != roolsDto.getA8()&&!"".equals(customerDto.getA8())) {
                String a1 = customerDto.getA8();
                Node[] nodes1 = roolsDto.getA8();
                str = new StringBuffer();
                for (int j = 0; j < nodes1.length; j++) {
                    Node node = nodes1[j];
                    String flag = node.getFlag();
                    String value = node.getValue();
                    String logicFlag = node.getLogicFlag();
                    if (j > 0) {
                        if (logicFlag.equals("and")) {
                            str.append("&&");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        } else if (logicFlag.equals("or")) {
                            str.append("||");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        }
                    } else {
                        if (flag.equals("=")) {
                            str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                        } else if (flag.equals(">")) {
                            str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                        } else if (flag.equals("<")) {
                            str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                        } else if (flag.equals(">=")) {
                            str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                        } else if (flag.equals("<=")) {
                            str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                        } else if (flag.equals("!=")) {
                            str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                        }
                    }
                }
                if ((null == roolsDto.getA1()&&customerDto.getA1().equals(""))&&(null == roolsDto.getA2()&&customerDto.getA2().equals(""))&&
                        (null == roolsDto.getA3()&&customerDto.getA3().equals(""))&&(null == roolsDto.getA4()&&customerDto.getA4().equals(""))
                        &&(null == roolsDto.getA5()&&customerDto.getA5().equals(""))&&(null == roolsDto.getA6()&&customerDto.getA6().equals(""))
                        &&(null == roolsDto.getA7()&&customerDto.getA7().equals(""))){
                    isFlag = (Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class);
                }else {
                    isFlag = ((Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class)) && isFlag;}
            }else if (null != roolsDto.getA8()&&customerDto.getA8().equals("")){
                isFlag = false;
            }

            if (null != roolsDto.getA9()&&!customerDto.getA9().equals("")) {
                String a1 = customerDto.getA9();
                Node[] nodes1 = roolsDto.getA9();
                str = new StringBuffer();
                for (int j = 0; j < nodes1.length; j++) {
                    Node node = nodes1[j];
                    String flag = node.getFlag();
                    String value = node.getValue();
                    String logicFlag = node.getLogicFlag();
                    if (j > 0) {
                        if (logicFlag.equals("and")) {
                            str.append("&&");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        } else if (logicFlag.equals("or")) {
                            str.append("||");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        }
                    } else {
                        if (flag.equals("=")) {
                            str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                        } else if (flag.equals(">")) {
                            str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                        } else if (flag.equals("<")) {
                            str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                        } else if (flag.equals(">=")) {
                            str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                        } else if (flag.equals("<=")) {
                            str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                        } else if (flag.equals("!=")) {
                            str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                        }
                    }
                }
                if ((null == roolsDto.getA1()&&customerDto.getA1().equals(""))&&(null == roolsDto.getA2()&&customerDto.getA2().equals(""))&&
                        (null == roolsDto.getA3()&&customerDto.getA3().equals(""))&&(null == roolsDto.getA4()&&customerDto.getA4().equals(""))
                        &&(null == roolsDto.getA5()&&customerDto.getA5().equals(""))&&(null == roolsDto.getA6()&&customerDto.getA6().equals(""))
                        &&(null == roolsDto.getA7()&&customerDto.getA7().equals(""))&&(null == roolsDto.getA8()&&customerDto.getA8().equals(""))){
                    isFlag = (Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class);
                }else {
                    isFlag = ((Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class)) && isFlag;}
            }else if (null != roolsDto.getA9()&&customerDto.getA9().equals("")){
                isFlag = false;
            }

            if (null != roolsDto.getA10()&&!customerDto.getA10().equals("")) {
                String a1 = customerDto.getA10();
                Node[] nodes1 = roolsDto.getA10();
                str = new StringBuffer();
                for (int j = 0; j < nodes1.length; j++) {
                    Node node = nodes1[j];
                    String flag = node.getFlag();
                    String value = node.getValue();
                    String logicFlag = node.getLogicFlag();
                    if (j > 0) {
                        if (logicFlag.equals("and")) {
                            str.append("&&");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        } else if (logicFlag.equals("or")) {
                            str.append("||");
                            if (flag.equals("=")) {
                                str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                            } else if (flag.equals(">")) {
                                str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                            } else if (flag.equals("<")) {
                                str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                            } else if (flag.equals(">=")) {
                                str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                            } else if (flag.equals("<=")) {
                                str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                            } else if (flag.equals("!=")) {
                                str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                            }
                        }
                    } else {
                        if (flag.equals("=")) {
                            str.append(Integer.parseInt(a1) == Integer.parseInt(value));
                        } else if (flag.equals(">")) {
                            str.append(Integer.parseInt(a1) > Integer.parseInt(value));
                        } else if (flag.equals("<")) {
                            str.append(Integer.parseInt(a1) < Integer.parseInt(value));
                        } else if (flag.equals(">=")) {
                            str.append(Integer.parseInt(a1) >= Integer.parseInt(value));
                        } else if (flag.equals("<=")) {
                            str.append(Integer.parseInt(a1) <= Integer.parseInt(value));
                        } else if (flag.equals("!=")) {
                            str.append(Integer.parseInt(a1) != Integer.parseInt(value));
                        }
                    }
                }
                if ((null == roolsDto.getA1()&&customerDto.getA1().equals(""))&&(null == roolsDto.getA2()&&customerDto.getA2().equals(""))&&
                        (null == roolsDto.getA3()&&customerDto.getA3().equals(""))&&(null == roolsDto.getA4()&&customerDto.getA4().equals(""))
                        &&(null == roolsDto.getA5()&&customerDto.getA5().equals(""))&&(null == roolsDto.getA6()&&customerDto.getA6().equals(""))
                        &&(null == roolsDto.getA7()&&customerDto.getA7().equals(""))&&(null == roolsDto.getA8()&&customerDto.getA8().equals(""))
                        &&(null == roolsDto.getA9()&&customerDto.getA9().equals(""))){
                    isFlag = (Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class);
                }else {
                    isFlag = ((Boolean) Ognl.getValue(str.toString(), (Object) null, Boolean.class)) && isFlag;}
            }else if (null != roolsDto.getA10()&&customerDto.getA10().equals("")){
                isFlag = false;
            }
            if (isFlag) {
                res.add(roolsDto);
            }
        }
        return res;
    }

    @Override
    public Map<String, Object> findOne(String phone) {
        Map<String, Object> map =new HashMap<String, Object>();
        CustomerDto user = new CustomerDto();
        if(phone.equals("13351110001")){
            user.setA1("24");
            user.setA2("12");
            user.setA3("40");
            user.setA4("60");
            user.setA5("60");
            user.setA6("66");
            user.setA7("70");
            user.setA8("40");
            user.setA9("40");
            user.setA10("100");
        }
        if(phone.equals("13351110002")){
            user.setA1("20");
            user.setA2("30");
            user.setA3("27");
            user.setA4("48");
            user.setA5("28");
            user.setA6("32");
            user.setA7("19");
            user.setA8("");
            user.setA9("");
            user.setA10("");
        }
        if(phone.equals("13351110003")){
            user.setA1("30");
            user.setA2("40");
            user.setA3("30");
            user.setA4("40");
            user.setA5("28");
            user.setA6("29");
            user.setA7("45");
            user.setA8("18");
            user.setA9("24");
            user.setA10("");
        }
        if(phone.equals("13351110004")){
            user.setA1("10");
            user.setA2("180");
            user.setA3("60");
            user.setA4("28");
            user.setA5("15");
            user.setA6("148");
            user.setA7("26");
            user.setA8("16");
            user.setA9("128");
            user.setA10("");
        }
        if(phone.equals("13351110005")){
            user.setA1("35");
            user.setA2("45");
            user.setA3("50");
            user.setA4("72");
            user.setA5("48");
            user.setA6("52");
            user.setA7("66");
            user.setA8("");
            user.setA9("");
            user.setA10("");
        }
        if(phone.equals("13351110006")){
            user.setA1("30");
            user.setA2("");
            user.setA3("");
            user.setA4("");
            user.setA5("");
            user.setA6("");
            user.setA7("");
            user.setA8("");
            user.setA9("");
            user.setA10("");
        }
        if(phone.equals("13351110007")){
            user.setA1("38");
            user.setA2("");
            user.setA3("28");
            user.setA4("");
            user.setA5("");
            user.setA6("");
            user.setA7("");
            user.setA8("");
            user.setA9("");
            user.setA10("");
        }
        if(phone.equals("13351110008")){
            user.setA1("");
            user.setA2("");
            user.setA3("");
            user.setA4("70");
            user.setA5("");
            user.setA6("");
            user.setA7("60");
            user.setA8("");
            user.setA9("");
            user.setA10("40");
        }
        if(phone.equals("13351110009")){
            user.setA1("60");
            user.setA2("30");
            user.setA3("60");
            user.setA4("28");
            user.setA5("");
            user.setA6("");
            user.setA7("");
            user.setA8("");
            user.setA9("");
            user.setA10("");
        }
        if(phone.equals("13351110000")){
            user.setA1("");
            user.setA2("");
            user.setA3("");
            user.setA4("");
            user.setA5("10");
            user.setA6("");
            user.setA7("30");
            user.setA8("30");
            user.setA9("35");
            user.setA10("18");
        }
        List<RoolsDto> roolsDtos = new ArrayList<>();
        try {
            long start = System.currentTimeMillis();
            roolsDtos = logicByCustomer(user);
            long end = System.currentTimeMillis();
            System.out.println("本次计算用时："+(end - start)+"ms");
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<RoolDot> result = new ArrayList();
        StringBuffer buffer;
        for (int i = 0; i < roolsDtos.size(); i++) {
            RoolDot roolDot = new RoolDot();
            RoolsDto roolsDto = (RoolsDto) roolsDtos.get(i);
            Node[] a1 = roolsDto.getA1();
            buffer = new StringBuffer();
            if (a1 != null && !"".equals(a1)) {
                //String[] node1 = new String[a1.length];
                for (int k = 0; k < a1.length; k++) {
                    Node node = a1[k];
                    String nodeRes = node.getLogicFlag() + " " + "a1" + node.getFlag() + node.getValue();
                    buffer.append(nodeRes + " ");
                    //node1[k] = nodeRes;
                }
                roolDot.setA1(buffer.toString());
            }
            Node[] a2 = roolsDto.getA2();
            buffer = new StringBuffer();
            if (a2 != null && !"".equals(a2)) {
                //String[] node2 = new String[a2.length];
                for (int k = 0; k < a2.length; k++) {
                    Node node = a2[k];
                    String nodeRes = node.getLogicFlag() + " " + "a2" + node.getFlag() + node.getValue();
                    //node2[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA2(buffer.toString());

            }
            Node[] a3 = roolsDto.getA3();
            buffer = new StringBuffer();
            if (a3 != null && !"".equals(a3)) {
                //String[] node3 = new String[a3.length];
                for (int k = 0; k < a3.length; k++) {
                    Node node = a3[k];
                    String nodeRes = node.getLogicFlag() + " " + "a3" + node.getFlag() + node.getValue();
                    //node3[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA3(buffer.toString());

            }
            Node[] a4 = roolsDto.getA4();
            buffer = new StringBuffer();
            if (a4 != null && !"".equals(a4)) {
                //String[] node4 = new String[a4.length];
                for (int k = 0; k < a4.length; k++) {
                    Node node = a4[k];
                    String nodeRes = node.getLogicFlag() + " " + "a4" + node.getFlag() + node.getValue();
                    //node4[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA4(buffer.toString());

            }
            Node[] a5 = roolsDto.getA5();
            buffer = new StringBuffer();
            if (a5 != null && !"".equals(a5)) {
                //String[] node5 = new String[a5.length];
                for (int k = 0; k < a5.length; k++) {
                    Node node = a5[k];
                    String nodeRes = node.getLogicFlag() + " " + "a5" + node.getFlag() + node.getValue();
                    //node5[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA5(buffer.toString());

            }
            Node[] a6 = roolsDto.getA6();
            buffer = new StringBuffer();
            if (a6 != null && !"".equals(a6)) {
                //String[] node6 = new String[a6.length];
                for (int k = 0; k < a6.length; k++) {
                    Node node = a6[k];
                    String nodeRes = node.getLogicFlag() + " " + "a6" + node.getFlag() + node.getValue();
                    //node6[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA6(buffer.toString());

            }
            Node[] a7 = roolsDto.getA7();
            buffer = new StringBuffer();
            if (a7 != null && !"".equals(a7)) {
                //String[] node7 = new String[a7.length];
                for (int k = 0; k < a7.length; k++) {
                    Node node = a7[k];
                    String nodeRes = node.getLogicFlag() + " " + "a7" + node.getFlag() + node.getValue();
                    //node7[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA7(buffer.toString());

            }
            Node[] a8 = roolsDto.getA8();
            buffer = new StringBuffer();
            if (a8 != null && !"".equals(a8)) {
                //String[] node8 = new String[a8.length];
                for (int k = 0; k < a8.length; k++) {
                    Node node = a8[k];
                    String nodeRes = node.getLogicFlag() + " " + "a8" + node.getFlag() + node.getValue();
                    //node8[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA8(buffer.toString());

            }
            Node[] a9 = roolsDto.getA9();
            buffer = new StringBuffer();
            if (a9 != null && !"".equals(a9)) {
                //String[] node9 = new String[a9.length];
                for (int k = 0; k < a9.length; k++) {
                    Node node = a9[k];
                    String nodeRes = node.getLogicFlag() + " " + "a9" + node.getFlag() + node.getValue();
                    //node9[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA9(buffer.toString());

            }
            Node[] a10 = roolsDto.getA10();
            buffer = new StringBuffer();
            if (a10 != null && !"".equals(a10)) {
                //String[] node10 = new String[a10.length];
                for (int k = 0; k < a10.length; k++) {
                    Node node = a10[k];
                    String nodeRes = node.getLogicFlag() + " " + "a10" + node.getFlag() + node.getValue();
                    //node10[k] = nodeRes;
                    buffer.append(nodeRes + " ");
                }
                roolDot.setA10(buffer.toString());
            }

            result.add(roolDot);
        }
        map.put("count", roolsDtos.size());
        map.put("value", result);
        return map;
    }

}
