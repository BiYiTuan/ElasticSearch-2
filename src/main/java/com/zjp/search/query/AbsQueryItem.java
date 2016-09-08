package com.zjp.search.query;

import com.zjp.search.enums.BoolQueryType;
import com.zjp.search.enums.QueryWay;

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
 * Module Desc:com.zjp.search.query
 * User: zjprevenge
 * Date: 2016/9/8
 * Time: 9:45
 */

public abstract class AbsQueryItem implements IQueryItem {

    protected BoolQueryType queryType;

    protected QueryWay queryWay;

    protected String fieldName;

    protected String fieldValue;

    public AbsQueryItem() {
    }

    /**
     * Ĭ���ṩ must term ��ѯ
     *
     * @param fieldName
     * @param fieldValue
     */
    public AbsQueryItem(String fieldName, String fieldValue) {
        this(BoolQueryType.MUST, QueryWay.TERM, fieldName, fieldValue);
    }

    /**
     * ������
     *
     * @param queryType  ��ѯ����
     * @param queryWay   ��ѯ��ʽ
     * @param fieldName  �ֶ�����
     * @param fieldValue ��ѯ�ֶ�ֵ
     */
    public AbsQueryItem(BoolQueryType queryType,
                        QueryWay queryWay,
                        String fieldName,
                        String fieldValue) {
        this.queryType = queryType;
        this.queryWay = queryWay;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

    public BoolQueryType getQueryType() {
        return queryType;
    }

    public void setQueryType(BoolQueryType queryType) {
        this.queryType = queryType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public QueryWay getQueryWay() {
        return queryWay;
    }

    public void setQueryWay(QueryWay queryWay) {
        this.queryWay = queryWay;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    /**
     * ��ȡ��ѯ��bool����
     *
     * @return
     */
    public BoolQueryType boolQueryType() {
        return getQueryType();
    }

}
