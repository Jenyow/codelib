package com.codelib.java.sample.util;

import java.lang.reflect.Field;
import java.util.List;

import com.codelib.java.sample.model.AbstractRoot;
import com.codelib.java.sample.model.Leaf;

/**
 * 
 * @author Zhan Yao
 *
 * 2017年11月7日
 */
public class TreeUtil {

    /**
     * 根据 idName 和 parentIdName 生成树
     * @param list 需要生成树的数据
     * @param idName id的属性名
     * @param pIdName pId的属性名
     * @param rootPIdValue 一级pId的值
     * @return 树结构的数据
     */
    public static <T> AbstractRoot<T> getTree(List<T> list, String idName, String pIdName, Object rootPIdValue) {
        AbstractRoot<T> root = new Leaf<>();
        for (T t : list) {
            Class<? extends Object> clasz = t.getClass();
            try {
                Field pIdfield = clasz.getDeclaredField(pIdName);
                // 设置允许获取私有成员变量
                pIdfield.setAccessible(true);
                Object pId = pIdfield.get(t);
                if (pId == null || pId.equals(rootPIdValue)) {
                    Leaf<T> leaf = new Leaf<>();
                    Field idfield = clasz.getDeclaredField(idName);
                    // 设置允许获取私有成员变量
                    idfield.setAccessible(true);
                    Object id = idfield.get(t);
                    leaf.setT(t);
                    getChild(list, idName, pIdName, leaf, id);
                    root.add(leaf);
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return root;
    }

    private static <T> void getChild(List<T> list, String idName, String pIdName, Leaf<T> branch, Object pId) throws Exception {
        for (T t : list) {
            Class<? extends Object> clasz = t.getClass();
            Field pIdfield = clasz.getDeclaredField(pIdName);
            // 设置允许获取私有成员变量
            pIdfield.setAccessible(true);
            Object tPId = pIdfield.get(t);
            if (pId.equals(tPId)) {
                Leaf<T> leaf = new Leaf<>();
                Field idfield = clasz.getDeclaredField(idName);
                // 设置允许获取私有成员变量
                idfield.setAccessible(true);
                Object id = idfield.get(t);
                leaf.setT(t);
                getChild(list, idName, pIdName, leaf, id);
                branch.add(leaf);
            }
        }
    }
    
}
