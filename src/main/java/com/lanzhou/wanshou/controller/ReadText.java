package com.lanzhou.wanshou.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadText {

    private static final String fileName = "C:/Users/lf199/Desktop/area.json";
    private static Map<String, String> province = new HashMap<String, String>(); //省份
    private Map<String, List<String>> city = new HashMap<String, List<String>>(); //市
    private Map<String, List<String>> country = new HashMap<String, List<String>>(); //县 区

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://47.99.169.254:3306/lanzhou_wanshoushi";
    static String P_URL = "insert into d_province (p_id,province_name) value ";
    static String CITY_URL = "insert into d_city (city_id,p_id,city_name) value ";
    static String COUNTRY_URL = "insert into d_country (country_id,city_id,p_id,country_name) value ";

    public static void main(String[] args) {
        BufferedReader br = null;
        StringBuffer sb = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "utf8"));
            sb = new StringBuffer();
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        JSONArray jsonArray = JSONArray.parseArray(new String(sb));
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject obj = (JSONObject) jsonArray.get(i);
            String id = String.valueOf(obj.get("id"));
            String name = (String) obj.get("name");
            String pId = id.substring(0, 2) + "0000";
            String cityId = id.substring(0, 4) + "00";

            if (id.endsWith("0000")) { //标注为省级别
                // P_URL += "(" + pId + ", '" + name.trim() + "'),";
            } else if (id.endsWith("00")) {  //标记为市级别
                CITY_URL += "(" + cityId + "," + pId + "," + "'" + name.trim() + "'),";
            } else if (id.startsWith("110") || id.startsWith("120") || id.startsWith("310") || id.startsWith("500")) {
                CITY_URL += "(" + id + "," + pId + "," + "'" + name.trim() + "'),";
            } else {
                COUNTRY_URL += "(" + id + "," + cityId + "," + pId + ",'" + name.trim() + "'),";
            }

        }
        //System.out.println(P_URL);
        // System.out.println(CITY_URL);
       System.out.println(COUNTRY_URL);
    }


}
