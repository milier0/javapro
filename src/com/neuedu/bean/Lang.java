package com.neuedu.bean;

/**
 * Created by lan_jia_nao on 2020/2/11.
 */
public abstract class Lang {
    private String name;

    public Lang(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Lang{" +
                "name='" + name + '\'' +
                '}';
    }
}
