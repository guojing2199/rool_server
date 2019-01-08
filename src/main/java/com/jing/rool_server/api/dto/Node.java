package com.jing.rool_server.api.dto;

import java.io.Serializable;

/**
 * @ClassName Node
 * @Description 规则节点
 * @Author Administrator
 * @Date 2019/1/3 12:58
 * @Version 1.0
 **/
public class Node implements Serializable {
    private static final long serialVersionUID = 2L;
    //逻辑运算符
    private String logicFlag;
    //比较运算符
    private String flag;

    private String value;

    public String getLogicFlag() {
        return logicFlag;
    }

    public void setLogicFlag(String logicFlag) {
        this.logicFlag = logicFlag;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" +
                "logicFlag='" + logicFlag + '\'' +
                ", flag='" + flag + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
