package com.zjp.search.bean;

import java.lang.reflect.Field;

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
 * Time: 17:27
 */

public interface IMappingType {

    /**
     * �ĵ���id
     *
     * @return
     */
    String getDocId();

    /**
     * �����ĵ�����Ҫ������field,ͨ�������ȡ
     *
     * @return
     */
    Field[] fields();
}
