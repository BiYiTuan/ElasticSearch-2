package com.zjp.search.query;

import com.zjp.search.enums.BoolQueryType;
import org.elasticsearch.index.query.QueryBuilder;

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
 * Time: 9:42
 */

public interface IQueryItem {

    /**
     * ��ȡ��ѯ��bool����
     *
     * @return
     */
    BoolQueryType boolQueryType();

    /**
     * ��ȡqueryBuilder
     *
     * @return
     */
    QueryBuilder buildQuery();
}
