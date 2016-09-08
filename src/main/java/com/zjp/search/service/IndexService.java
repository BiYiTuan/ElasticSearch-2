package com.zjp.search.service;

import com.alibaba.fastjson.JSON;
import com.zjp.search.annotation.Doc;
import com.zjp.search.bean.DocSource;
import com.zjp.search.bean.IMappingType;
import com.zjp.search.request.IndexRequest;
import org.apache.commons.lang3.StringUtils;
import org.elasticsearch.action.admin.indices.exists.indices.IndicesExistsRequest;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
 * Module Desc:com.zjp.search.service
 * User: zjprevenge
 * Date: 2016/9/7
 * Time: 18:10
 */
@Service
public class IndexService {

    private static final Logger log = LoggerFactory.getLogger(IndexService.class);

    @Resource
    private TransportClient client;

    @Resource
    private MappingService mappingService;

    /**
     * ��������
     *
     * @param request
     */
    public void createIndex(IndexRequest request) throws Exception {
        Class<? extends IMappingType> dataType = request.getDataType();
        List<DocSource> sources = request.getSources();
        Doc doc = dataType.getAnnotation(Doc.class);
        String index = StringUtils.isNoneBlank(doc.index()) ? doc.index() : dataType.getSimpleName();
        String type = StringUtils.isNoneBlank(doc.type()) ? doc.type() : dataType.getSimpleName();

        //�������ڣ�ɾ������
        if (isIndexExist(index)) {
            deleteIndex(index);
        }
        //�ĵ����ݲ�Ϊ��
        if (sources != null && !sources.isEmpty()) {
            //��������
            client.admin().indices().prepareCreate(index).execute().actionGet();
            //����mapping
            if (mappingService.isTypeExists(index, type)) {
                mappingService.createIndexEmpty(dataType);
            }
            //����������������
            BulkRequestBuilder bulk = client.prepareBulk();
            for (DocSource source : sources) {
                org.elasticsearch.action.index.IndexRequest indexRequest = client.prepareIndex(index, type, source.getId())
                        .setSource(JSON.toJSONString(source.getDocument())).request();
                bulk.add(indexRequest);
            }
            BulkResponse responses = bulk.execute().actionGet();
            if (responses.hasFailures()) {
                log.warn("bulk create index error...");
            }
        }
    }

    /**
     * ɾ������
     *
     * @param index ����
     * @return
     */
    public boolean deleteIndex(String index) {
        return client.admin()
                .indices()
                .prepareDelete(index)
                .execute()
                .actionGet()
                .isAcknowledged();
    }

    /**
     * ��֤�����Ƿ����
     *
     * @param index ����
     * @return
     */
    public boolean isIndexExist(String index) {
        return client.admin()
                .indices()
                .exists(new IndicesExistsRequest(index))
                .actionGet()
                .isExists();
    }

    /**
     * ����ĵ�
     *
     * @param request
     */
    public void addDoc(IndexRequest request) {
        Class<? extends IMappingType> dataType = request.getDataType();
        List<DocSource> sources = request.getSources();
        Doc doc = dataType.getAnnotation(Doc.class);
        String index = StringUtils.isNoneBlank(doc.index()) ? doc.index() : dataType.getSimpleName();
        String type = StringUtils.isNoneBlank(doc.type()) ? doc.type() : dataType.getSimpleName();
        BulkRequestBuilder bulk = client.prepareBulk();
        for (DocSource source : sources) {
            bulk.add(client.prepareIndex(index, type, source.getId())
                    .setSource(JSON.toJSONString(source)));
        }
        bulk.execute().actionGet();
    }

    /**
     * �����ĵ�
     *
     * @param request
     */
    public void updateDoc(IndexRequest request) {
        Class<? extends IMappingType> dataType = request.getDataType();
        List<DocSource> sources = request.getSources();
        Doc doc = dataType.getAnnotation(Doc.class);
        String index = StringUtils.isNoneBlank(doc.index()) ? doc.index() : dataType.getSimpleName();
        String type = StringUtils.isNoneBlank(doc.type()) ? doc.type() : dataType.getSimpleName();
        BulkRequestBuilder bulk = client.prepareBulk();
        for (DocSource source : sources) {
            bulk.add(client.prepareUpdate(index, type, source.getId())
                    .setDoc(JSON.toJSONString(source)));
        }
        bulk.execute().actionGet();
    }

    /**
     * ɾ�������ĵ�
     *
     * @param index    ����
     * @param typeName ����
     * @param docId    �ĵ�id
     */
    public void deleteDoc(String index, String typeName, String docId) {
        client.prepareDelete(index, typeName, docId)
                .execute()
                .actionGet();
    }

    /**
     * ����ɾ���ĵ�
     *
     * @param index    ����
     * @param typeName ����
     * @param docIds   �ĵ�id����
     */
    public void batchDeleteDoc(String index, String typeName, List<String> docIds) {
        BulkRequestBuilder bulk = client.prepareBulk();
        for (String docId : docIds) {
            bulk.add(client.prepareDelete(index, typeName, docId));
        }
        bulk.execute().actionGet();
    }
}
