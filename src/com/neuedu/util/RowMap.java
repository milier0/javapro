package com.neuedu.util;

import java.sql.ResultSet;

/**
 * Created by Neuedu on 2020/2/20.
 */
public interface RowMap<T> {
    T rowMapping(ResultSet rs);
}
