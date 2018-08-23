package com.dnsoft.JavaEEChapter18.core.dao;

import com.dnsoft.JavaEEChapter18.core.pojo.BaseDict;

import java.util.List;

public interface BaseDictDao {
    // 根据类别代码查询数据字典
    public List<BaseDict> selectBaseDictByTypeCode(String typecode);
}
