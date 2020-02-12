package com.neuedu.bean;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by lan_jia_nao on 2020/2/11.
 */
public class LangRenSha {
    private Min min;
    private Lang lang;
    private Shen shen;

    public static void main(String[] args) {
        PeiZhi peiZhi = new PeiZhi();
        peiZhi.menu();
        System.out.println("游戏结束");
        peiZhi.moShi();
    }

    public Min getMin() {
        return min;
    }

    public void setMin(Min min) {
        this.min = min;
    }

    public Lang getLang() {
        return lang;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public Shen getShen() {
        return shen;
    }

    public void setShen(Shen shen) {
        this.shen = shen;
    }
}
