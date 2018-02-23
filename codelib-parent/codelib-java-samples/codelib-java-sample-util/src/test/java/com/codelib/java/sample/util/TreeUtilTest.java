package com.codelib.java.sample.util;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.codelib.java.sample.model.Leaf;
import com.codelib.java.sample.model.Person;
import com.codelib.java.sample.model.AbstractRoot;

/**
 * 
 * @author Zhan Yao
 *
 * 2017年11月7日
 */
public class TreeUtilTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test() {
        Person person1 = new Person("1", "一", "");
        Person person2 = new Person("11", "一一", "1");
        Person person3 = new Person("12", "一二", "1");
        Person person4 = new Person("113", "一一三", "11");
        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        AbstractRoot<Person> tree = TreeUtil.getTree(list, "id", "pid", "");
        System.out.println(tree);
    }
    
    

    @Test
    public void testMenthod() throws Exception {
        Person person = new Person("1", "张", "");
        Class<? extends Person> clasz = person.getClass();
        Method method = clasz.getMethod("getId");
        String id = (String) method.invoke(person);
        System.out.println(id);
    }
    
    @Test
    public void testField() throws Exception {
        Person person = new Person("1", "张", "");
        Class<? extends Person> clasz = person.getClass();
        Field field = clasz.getDeclaredField("id");
        field.setAccessible(true);
        String id = (String) field.get(person);
        System.out.println(id);
    }
}
