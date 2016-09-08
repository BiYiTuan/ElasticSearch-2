package com.zjp.search.enums;

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
 * Module Desc:com.zjp.search.enums
 * User: zjprevenge
 * Date: 2016/9/7
 * Time: 16:28
 */

public enum FieldType {

    STRING("string"),
    DOUBLE("double"),
    NESTED("nested"),
    OBJECT("object"),
    BOOLEAN("boolean"),
    INTEGER("integer"),
    DATE("date"),
    LONG("long");

    private String typeValue;

    FieldType(String typeValue) {
        this.typeValue = typeValue;
    }

    public String getTypeValue() {
        return typeValue;
    }
}
