package com.zjp.search.bean;

import java.util.Map;

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
 * Module Desc:com.zjp.search.bean
 * User: zjprevenge
 * Date: 2016/9/7
 * Time: 17:31
 */

public class DocSource {

    //�ĵ����
    private String id;

    //����
    private Map<String, String> data;

    //���������ĵ�
    private IMappingType document;

    public DocSource() {
    }

    public DocSource(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, String> getData() {
        return data;
    }

    public void setData(Map<String, String> data) {
        this.data = data;
    }

    public IMappingType getDocument() {
        return document;
    }

    public void setDocument(IMappingType document) {
        this.document = document;
    }
}
