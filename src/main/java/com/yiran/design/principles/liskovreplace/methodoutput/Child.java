package com.yiran.design.principles.liskovreplace.methodoutput;

import java.util.HashMap;

/**
 * Created by Ale on 2021/3/1
 */
public class Child extends Base{
    @Override
    public HashMap method() {
        return new HashMap();
    }
}
