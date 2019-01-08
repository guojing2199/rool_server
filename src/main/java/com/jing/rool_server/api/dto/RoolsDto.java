package com.jing.rool_server.api.dto;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @ClassName RoolsDto
 * @Description 规则实体
 * @Author Administrator
 * @Date 2019/1/3 13:02
 * @Version 1.0
 **/
public class RoolsDto implements Serializable {
    private static final long serialVersionUID = 3L;

    private Node[] a1;
    private Node[] a2;
    private Node[] a3;
    private Node[] a4;
    private Node[] a5;
    private Node[] a6;
    private Node[] a7;
    private Node[] a8;
    private Node[] a9;
    private Node[] a10;

    public Node[] getA1() {
        return a1;
    }

    public void setA1(Node[] a1) {
        this.a1 = a1;
    }

    public Node[] getA2() {
        return a2;
    }

    public void setA2(Node[] a2) {
        this.a2 = a2;
    }

    public Node[] getA3() {
        return a3;
    }

    public void setA3(Node[] a3) {
        this.a3 = a3;
    }

    public Node[] getA4() {
        return a4;
    }

    public void setA4(Node[] a4) {
        this.a4 = a4;
    }

    public Node[] getA5() {
        return a5;
    }

    public void setA5(Node[] a5) {
        this.a5 = a5;
    }

    public Node[] getA6() {
        return a6;
    }

    public void setA6(Node[] a6) {
        this.a6 = a6;
    }

    public Node[] getA7() {
        return a7;
    }

    public void setA7(Node[] a7) {
        this.a7 = a7;
    }

    public Node[] getA8() {
        return a8;
    }

    public void setA8(Node[] a8) {
        this.a8 = a8;
    }

    public Node[] getA9() {
        return a9;
    }

    public void setA9(Node[] a9) {
        this.a9 = a9;
    }

    public Node[] getA10() {
        return a10;
    }

    public void setA10(Node[] a10) {
        this.a10 = a10;
    }

    @Override
    public String toString() {
        return "RoolsDto{" +
                "a1=" + Arrays.toString(a1) +
                ", a2=" + Arrays.toString(a2) +
                ", a3=" + Arrays.toString(a3) +
                ", a4=" + Arrays.toString(a4) +
                ", a5=" + Arrays.toString(a5) +
                ", a6=" + Arrays.toString(a6) +
                ", a7=" + Arrays.toString(a7) +
                ", a8=" + Arrays.toString(a8) +
                ", a9=" + Arrays.toString(a9) +
                ", a10=" + Arrays.toString(a10) +
                '}';
    }
}
