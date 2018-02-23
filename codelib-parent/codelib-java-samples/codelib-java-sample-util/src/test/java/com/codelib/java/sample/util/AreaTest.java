package com.codelib.java.sample.util;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;

import com.codelib.java.sample.model.AbstractRoot;
import com.codelib.java.sample.model.Area;
import com.codelib.java.sample.model.Person;

public class AreaTest {

    @Before
    public void setUp() throws Exception {
    }

    /**
     * 读文件
     */
    @Test
    public void test() {
        String path = "E:/workspace/QMWorkspace/perfectGen/trunck/documentation/area.txt";
        String provincePatternStr = "(\\d+)(.+)";
        String cityPatternStr = "\\S(\\d+)(.+)";
        String areaPatternStr = "\\S{2}(\\d+)(.+)";
        
        BufferedReader br = null;
        String s = null;
        List<Area> list = new ArrayList<>();
        String code = null;
        String pCode = null;
        String proviceCode = null;
        String cityCode = null;
        
        File file = new File(path);
        List<String> values = new ArrayList<>();
        try{
            br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            // 读文件
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                Area area = new Area();
                if (s.matches(provincePatternStr)) {
                    // 一级
                    values = AreaUtil.getArea(s, provincePatternStr);
                    code = values.get(0);
                    proviceCode = code;
                    pCode = code.substring(0, 1);
                    area.setType("1");
                } else if (s.matches(cityPatternStr)) {
                    // 二级
                    values = AreaUtil.getArea(s, cityPatternStr);
                    code = values.get(0);
                    cityCode = code;
                    pCode = proviceCode;
                    area.setType("2");
                } else {
                    // 三级
                    values = AreaUtil.getArea(s, areaPatternStr);
                    code = values.get(0);
                    pCode = cityCode;
                    area.setType("3");
                }
                area.setCode(code);
                area.setpCode(pCode);
                area.setName(StringUtils.strip(values.get(1)));
                list.add(area);
            }
            // 打印sql
            for (Area a : list) {
                StringBuilder builder = new StringBuilder();
                builder.append("INSERT INTO `perfectgendb`.`ready_area` (`AREA_ID`, `PARENT_ID`, `AREA_NAME`, `AREA_CODE`, `AREA_TYPE`, `ORDER_NO`, `IS_ENABLED`, `MEMO`) VALUES ('");
                builder.append(a.getCode());
                builder.append("','");
                builder.append(a.getpCode());
                builder.append("','");
                builder.append(a.getName());
                builder.append("','");
                builder.append(a.getCode());
                builder.append("','");
                builder.append(a.getType());
                builder.append("','");
                builder.append("0");
                builder.append("','");
                builder.append("1");
                builder.append("','');");
                System.out.println(builder.toString());
            }
        }catch(Exception e){
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    @Test
    public void testMatch0() {
        try {
            String patternStr = "(\\d+)(.+)";
            String ip = "110000     北京市";
            Pattern pattern = Pattern.compile(patternStr);
            Matcher matcher = pattern.matcher(ip);
            List<String> values = new ArrayList<>();
            assertTrue(matcher.matches());
            for (int i = 1; i <= matcher.groupCount(); i++) {
                String groupi = matcher.group(i);
                values.add(groupi);
            }
            System.out.println(values.toString());
            System.out.println(values.get(0));
            System.out.println(StringUtils.strip(values.get(1)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testMatch1() {
        try {
            String patternStr = "\\S{1}(\\d+)(.+)";
            String s = "　110100         　市辖区";
            List<String> values = AreaUtil.getArea(s, patternStr);
            
            System.out.println(values.toString());
            System.out.println(values.get(0));
            System.out.println(StringUtils.strip(values.get(1)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testMatch2() {
        try {
            String patternStr = "\\S{2}(\\d+)(.+)";
            String ip = "　　110101     　　东城区";
            Pattern pattern = Pattern.compile(patternStr);
            Matcher matcher = pattern.matcher(ip);
            List<String> values = new ArrayList<>();
            assertTrue(matcher.matches());
            for (int i = 1; i <= matcher.groupCount(); i++) {
                String groupi = matcher.group(i);
                values.add(groupi);
            }
            System.out.println(values.toString());
            System.out.println(values.get(0));
            System.out.println(StringUtils.strip(values.get(1)));
            System.out.println(ip.matches(patternStr));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testMatch3() {
        try {
            String provincePatternStr = "(\\d+)(.+)";
            String cityPatternStr = "\\S(\\d+)(.+)";
            String areaPatternStr = "\\S{2}(\\d+)(.+)";
            String provinceStr = "110000     北京市";
            String cityStr = "　110100         　市辖区";
            String areaStr = "　　110101     　　东城区";
            System.out.println("provice:");
            System.out.println(provinceStr.matches(provincePatternStr));
            System.out.println(provinceStr.matches(cityPatternStr));
            System.out.println(provinceStr.matches(areaPatternStr));
            System.out.println("city:");
            System.out.println(cityStr.matches(provincePatternStr));
            System.out.println(cityStr.matches(cityPatternStr));
            System.out.println(cityStr.matches(areaPatternStr));
            System.out.println("area:");
            System.out.println(areaStr.matches(provincePatternStr));
            System.out.println(areaStr.matches(cityPatternStr));
            System.out.println(areaStr.matches(areaPatternStr));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
