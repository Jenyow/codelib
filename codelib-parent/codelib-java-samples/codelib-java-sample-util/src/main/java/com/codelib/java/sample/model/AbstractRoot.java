package com.codelib.java.sample.model;

/**
 * 
 * @author Zhan Yao
 *
 * 2017年11月7日
 */
public abstract class AbstractRoot<T> {
    
    private T t;
    
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    
    /**
     * 添加叶子节点
     * @param leaf
     */
    public abstract void add(Leaf<T> leaf);

    /**
     * 删除叶子节点
     * @param t
     */
    public abstract void romove(Leaf<T> t);
    
}
