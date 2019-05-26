/**
 * Copyright (C): 恒大集团©版权所有 Evergrande Group
 * FileName: PageMybaitsHelper
 * Author:   liangyijie
 * Date:     2017-11-8 17:41
 * Description: Mybatis分页辅助类
 */
package com.evergrande.qms.mybaits;


import com.evergrande.qms.common.context.ContextManager;
import com.evergrande.qms.common.model.PageData;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * Mybatis分页辅助类
 * @author liangyijie
 * @create 2017-11-8
 * @since 1.0.0
 */
public class PageMybaitsHelper {

    /**
     * 开始分页
     *
     * @param pageNum
     * @param pageSize
     */
    public static void startPage(int pageNum, int pageSize) {
        Page page = com.github.pagehelper.PageHelper.startPage(pageNum, pageSize);
        ContextManager.setValue("pager", page);
    }

    /**
     * 结束分页并返回结果，该方法必须被调用，否则localPage会一直保存下去，直到下一次startPage
     *
     * @return
     */
    public static PageData endPage() {
        Page page = ContextManager.getValue("pager");
        PageData pageData = new PageData();
        pageData.setPageSize(page.getPageSize());
        pageData.setCurrentPageNumber(page.getPageNum());
        pageData.setItems(page.getResult());
        pageData.setTotal((int) page.getTotal());
        return pageData;
    }

    /**
     * 结束分页并返回结果，该方法必须被调用，否则localPage会一直保存下去，直到下一次startPage
     * @param list 二次封装结果
     * @return
     */
    public static PageData endPage(List<?> list) {
        Page page = ContextManager.getValue("pager");
        PageData pageData = new PageData();
        pageData.setPageSize(page.getPageSize());
        pageData.setCurrentPageNumber(page.getPageNum());
        pageData.setItems(list);
        pageData.setTotal((int) page.getTotal());
        return pageData;
    }
}
