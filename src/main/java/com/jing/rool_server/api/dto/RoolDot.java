package com.jing.rool_server.api.dto;

import java.io.Serializable;

/**
 * @ClassName RoolDot
 * @Description 规则实体字符
 * @Author Administrator
 * @Date 2018/12/24 16:32
 * @Version 1.0
 **/
public class RoolDot implements Serializable {
    private static final long serialVersionUID = 1L;
    //用户属性/条件1
    private String a1;
    //用户属性/条件2
    private String a2;
    //用户属性/条件3
    private String a3;
    //用户属性/条件4
    private String a4;
    //用户属性/条件5
    private String a5;
    //用户属性/条件6
    private String a6;
    //用户属性/条件7
    private String a7;
    //用户属性/条件8
    private String a8;
    //用户属性/条件9
    private String a9;
    //用户属性/条件10
    private String a10;

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public String getA5() {
        return a5;
    }

    public void setA5(String a5) {
        this.a5 = a5;
    }

    public String getA6() {
        return a6;
    }

    public void setA6(String a6) {
        this.a6 = a6;
    }

    public String getA7() {
        return a7;
    }

    public void setA7(String a7) {
        this.a7 = a7;
    }

    public String getA8() {
        return a8;
    }

    public void setA8(String a8) {
        this.a8 = a8;
    }

    public String getA9() {
        return a9;
    }

    public void setA9(String a9) {
        this.a9 = a9;
    }

    public String getA10() {
        return a10;
    }

    public void setA10(String a10) {
        this.a10 = a10;
    }

    @Override
    public String toString() {
        return "{" +
                "a1='" + a1 + '\'' +
                ", a2='" + a2 + '\'' +
                ", a3='" + a3 + '\'' +
                ", a4='" + a4 + '\'' +
                ", a5='" + a5 + '\'' +
                ", a6='" + a6 + '\'' +
                ", a7='" + a7 + '\'' +
                ", a8='" + a8 + '\'' +
                ", a9='" + a9 + '\'' +
                ", a10='" + a10 + '\'' +
                '}';
    }
}
