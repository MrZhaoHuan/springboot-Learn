package com.zhao.boot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-27 17:26
 * @描述
 */
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    @Value("${jdbc.username}")
    private String name;
    private int age;
    //@Value("${person.money}")
    private double money;

    private int[] cards;
    private List<Object> lists;

    private Map<String, Object> maps;
    private Cat cat;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setCards(int[] cards) {
        this.cards = cards;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }


    public void setCat(Cat cat) {
        this.cat = cat;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }

    public int[] getCards() {
        return cards;
    }

    public List<Object> getLists() {
        return lists;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public Cat getCat() {
        return cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", cards=" + Arrays.toString(cards) +
                ", lists=" + lists +
                ", maps=" + maps +
                ", cat=" + cat +
                '}';
    }
}