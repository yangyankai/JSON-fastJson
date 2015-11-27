package com.yangyankai.myapplication;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试 json 的使用方法
 * Created by yangyankai on 2015/11/27.
 */
//1. JavaBean                   Person person = JSON.parseObject(jsonString, Person.class);
//2. List<JavaBean>             List<Person> listPerson =JSON.parseArray(jsonString, Person.class);
//3. List<String>               List<String> listString = JSON.parseArray(jsonString, String.class);
//4. List<Map<String,Object>>   List<Map<String, Object>> listMap = JSON.parseObject(jsonString, new TypeReference<List<Map<String,Object>>>(){});  (注意：此处可看出fastjson反射机制比gson更准确， id = 1001 通过fastjson反射仍是 id = 1001 , 而通过gson反射结果 为 id =1001.0 ,


public class Test {
    public static void main(String args[]) {
//        parseArrary();
        parseObject();
    }

    private static void parseObject() {

        Singer person = new Singer("yyy", "fastjson");

//这里将javabean转化成json字符串

        String jsonString = JSON.toJSONString(person);

//这里将json字符串转化成javabean对象,

       Singer person2 = JSON.parseObject(jsonString, Singer.class);
        person2.toString();

    }

    private static void parseArrary() {
        String jsonStr = "{\"JACKIE_ZHANG\":\"张学友\",\"ANDY_LAU\":\"刘德华\",\"LIMING\":\"黎明\",\"Aaron_Kwok\":\"郭富城\"}";
        JSONObject jsonObject = JSONObject.parseObject(jsonStr);

        for (java.util.Map.Entry<String, Object> entry : jsonObject.entrySet()) {
            System.out.print(entry.getKey() + "  :  " + entry.getValue() + "\n");
            System.out.println();//用来换行
        }
    }
}
//public class Test {
//    private static SerializeConfig mapping = new SerializeConfig(); static {
//        mapping.put(Date.class, new SimpleDateFormatSerializer("yyyy-MM-dd HH:mm:ss"));
//    }
//
//    public static void main(String[] args) {
//        Foo f1 = new Foo();
//        Date date = new Date();
//        String text = JSON.toJSONString(date, mapping);
//        System.out.println(text);
//        System.out.println(JSON.toJSONString(f1, true));
//        String x2 =JSON.toJSONString(f1, mapping);
//        System.out.println(x2);
//    }
//
//    public static void json2List(){
//        //List -> JSON array
//        List<Bar> barList = new ArrayList<Bar>();
//        barList.add(new Bar());
//        barList.add(new Bar());
//        barList.add(new Bar());
//        String json= JSON.toJSONString(barList, true);
//        System.out.println(json);
//        //JSON array -> List
//        List<Bar> barList1 = JSON.parseArray(json,Bar.class);
//        for (Bar bar : barList1) {
//            System.out.println(bar.toString());
//        }
//    }
//
//    public static void json2Map(){
//        //Map -> JSON
//        Map<String,Bar> map = new HashMap<String, Bar>();
//        map.put("a",new Bar());
//        map.put("b",new Bar());
//        map.put("c",new Bar());
//        String json = JSON.toJSONString(map,true);
//        System.out.println(json);
//        //JSON -> Map
//        Map<String,Bar> map1 = (Map<String,Bar>)JSON.parse(json);
//        for (String key : map1.keySet()) {
//            System.out.println(key+":"+map1.get(key));
//        }
//    }
//
//    public static void array2JSON(){
//        String[] arr_String    = {"a","b","c"};
//        String json_arr_String = JSON.toJSONString(arr_String,true);
//        System.out.println(json_arr_String);
//        JSONArray jsonArray = JSON.parseArray(json_arr_String);
//        for (Object o : jsonArray) {
//            System.out.println(o);
//        }
//        System.out.println(jsonArray);
//    }
//    public static void array2JSON2(){
//        Bar[] arr_Bar    = {new Bar(),new Bar(),new Bar()};
//        String json_arr_Bar = JSON.toJSONString(arr_Bar,true);
//        System.out.println(json_arr_Bar);
//        JSONArray jsonArray = JSON.parseArray(json_arr_Bar);
//        for (Object o : jsonArray) {
//            System.out.println(o);
//        }
//        System.out.println(jsonArray);
//    }
//
//    public static void map2JSON(){
//        Map map = new HashMap();
//        map.put("a","aaa");
//        map.put("b","bbb");
//        map.put("c","ccc");
//        String json=JSON.toJSONString(map);
//        System.out.println(json);
//        Map map1 = JSON.parseObject(json);
//        for (Object o : map.entrySet()) {
//            Map.Entry<String,String> entry = (Map.Entry<String,String>)o;
//            System.out.println(entry.getKey()+"--->"+entry.getValue());
//        }
//    }
//}