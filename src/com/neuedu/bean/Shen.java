package com.neuedu.bean;

/**
 * Created by lan_jia_nao on 2020/2/11.
 */
public abstract class Shen {
    private String name;

    public Shen(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shen{" +
                "name='" + name + '\'' +
                '}';
    }
}
