package com.zhao.springAnnotation.annotation;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @创建人 zhaohuan
 * @邮箱 1101006260@qq.com
 * @创建时间 2018-07-24 16:24
 * @描述    注解配置扫描：过滤器
 * @see com.zhao.springAnnotation.annotation.TestConfiguration
 */
public class MyTypeFilter implements TypeFilter{
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        System.out.println("------metadata start------");
        Resource resource = metadataReader.getResource();
        System.out.println(annotationMetadata.getClass());
        System.out.println(classMetadata.getClass());
        System.out.println(resource);
        System.out.println("------metadata end------");
        return true;
    }
}
