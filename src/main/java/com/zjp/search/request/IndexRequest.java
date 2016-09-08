package com.zjp.search.request;

import com.zjp.search.bean.DocSource;
import com.zjp.search.bean.IMappingType;

import java.util.List;

/**
 * ������������oooo������������
 * ��������������������
 * ���������ߩ��������ߩ�
 * ����������������������
 * ����������������������
 * ���������ש������ס���
 * ����������������������
 * �������������ߡ�������
 * ����������������������
 * ����������������������
 * ������������������stay hungry stay foolish
 * ������������������Code is far away from bug with the animal protecting
 * ��������������������������
 * �������������������������ǩ�
 * ����������������������������
 * �������������������ש�����
 * �������������ϩϡ����ϩ�
 * �������������ߩ������ߩ�
 * �����������������թ�����������
 * Module Desc:com.zjp.search.request
 * User: zjprevenge
 * Date: 2016/9/7
 * Time: 17:39
 */

public class IndexRequest {

    /**
     * ��������
     */
    private String index;

    /**
     * �������ݼ���
     */
    private List<DocSource> sources;

    /**
     * ��������������
     */
    private Class<? extends IMappingType> dataType;

    public IndexRequest() {
    }

    public IndexRequest(String index) {
        this.index = index;
    }

    public IndexRequest(String index, List<DocSource> sources) {
        this.index = index;
        this.sources = sources;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public List<DocSource> getSources() {
        return sources;
    }

    public void setSources(List<DocSource> sources) {
        this.sources = sources;
    }

    public Class<? extends IMappingType> getDataType() {
        return dataType;
    }

    public void setDataType(Class<? extends IMappingType> dataType) {
        this.dataType = dataType;
    }
}
