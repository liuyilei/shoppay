package com.fourkmiles.utils;

import java.util.List;
import java.util.Map;

/**
 * @description: 集合工具类
 * @author: liuyilei
 * @create: 2019-10-24 09:44
 **/
public class ListUtils {

    public List<?> emptyList(List<?> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list;
    }

    public Map<?,?> emptyMap(Map<?,?> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        return map;
    }
}
