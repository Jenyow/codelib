package com.codelib.java.sample.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Zhan Yao
 *
 * 2017年11月7日
 */
public class Leaf<T> extends AbstractRoot<T> {
    
    private List<AbstractRoot> list;  

    public Leaf() {
        super();
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Leaf<T> t) {
        list.add(t);
    }

    @Override
    public void romove(Leaf<T> t) {
        list.remove(t);
    }

    public List<AbstractRoot> getList() {
        return list;
    }

    public void setList(List<AbstractRoot> list) {
        this.list = list;
    }

}
