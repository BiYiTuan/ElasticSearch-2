package com.zjp.search.annotation;

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
 * Time: 17:01
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Doc {

    /**
     * �ĵ�������index
     *
     * @return
     */
    String index() default "";

    /**
     * �ĵ�������type
     *
     * @return
     */
    String type() default "";
}
