package com.spring5.ioc.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author lijichen
 * @date 2020/11/14 - 17:17
 */
public class CollectionType {
    //数组类型
    private String[] arrays;
    //list类型
    private List<String> lists;
    //map类型
    private Map<String,String> maps;
    //set类型
    private Set<String> sets;

    private Map<Integer,Student> studentMap;

    public void setStudentMap(Map<Integer, Student> studentMap) {
        this.studentMap = studentMap;
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "CollectionType{" +
                "arrays=" + Arrays.toString(arrays) +
                ", lists=" + lists +
                ", maps=" + maps +
                ", sets=" + sets +
                ", studentMap=" + studentMap +
                '}';
    }
}
