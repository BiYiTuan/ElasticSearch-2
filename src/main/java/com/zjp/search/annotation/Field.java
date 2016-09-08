package com.zjp.search.annotation;

import com.zjp.search.enums.Analyzer;
import com.zjp.search.enums.FieldType;
import com.zjp.search.enums.Index;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

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
 * Module Desc:com.zjp.search.annotation
 * User: zjprevenge
 * Date: 2016/9/7
 * Time: 17:03
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Field {

    /**
     * �ֶ�����
     *
     * @return
     */
    String name() default "";

    /**
     * �ֶ�����
     *
     * @return
     */
    FieldType type() default FieldType.STRING;

    /**
     * �ִ�����Ĭ�ϲ��ִ�
     *
     * @return
     */
    Analyzer analyzer() default Analyzer.not_analyzed;

    /**
     * �Ƿ�洢��Ĭ��no or yes
     *
     * @return
     */
    String store() default "no";

    /**
     * �Ƿ���ֶν��з���
     * Ĭ�� not_analyzed��analyzed
     */
    Index index() default Index.not_analyzed;
}
