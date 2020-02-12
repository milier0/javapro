package com.neuedu.bean;

/**
 * Created by lan_jia_nao on 2020/2/11.
 */
public abstract class Min {
    private String name;

    public Min(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Min{" +
                "name='" + name + '\'' +
                '}';
    }
}
