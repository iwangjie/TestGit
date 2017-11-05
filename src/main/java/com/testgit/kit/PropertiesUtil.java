package com.testgit.kit;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;

/**
 * @author wangjiepc
 * @create 2017-11-05 1:35
 * @desc 配置文件工具类
 * @email wangchenmo1025@gmail.com
 **/
public class PropertiesUtil {

    private static HashMap<String,Properties> propertiesHashMap = new HashMap<>();
    private static HashMap<String,Long> propertiesTimeHashMap = new HashMap<>();

    /**
     *
     */
    public static void checkProprietsTime(String pname){
        String path = PropertiesUtil.class.getResource("/prop/"+pname+".properties").getPath();
        File file = new File(path);
        long lastModified = file.lastModified();

    }

    /**
     * 获取配置文件值
     * @param pname
     * @param pvalue
     * @return
     */
    public String getPro(String pname,String pvalue) throws FileNotFoundException {
        String path = PropertiesUtil.class.getResource("/prop/"+pname+".properties").getPath();
        File file = new File(path);
       // long lastModified = file.lastModified();
//        //检查缓存中是否存在
//        if(propertiesHashMap.containsKey(pname)){
//            //检查是否修改过
//            if(null != propertiesTimeHashMap.get(pname)&&propertiesTimeHashMap.get(pname).equals(lastModified)){
//                return (String)propertiesHashMap.get(pname).get(pvalue);
//            }
//        }

        Properties pro = new Properties();
        //InputStream resourceAsStream = PropertiesUtil.class.getResourceAsStream("/prop/"+pname+".properties");
        FileInputStream resourceAsStream = new FileInputStream(file);
        try {
            pro.load(resourceAsStream);
            pro.clone();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //缓存
        //propertiesHashMap.put(pname,pro);
        //propertiesTimeHashMap.put(pname,lastModified);
        return pro.getProperty(pvalue);
    }


}
