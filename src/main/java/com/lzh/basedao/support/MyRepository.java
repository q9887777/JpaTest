package com.lzh.basedao.support;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

@NoRepositoryBean
public interface MyRepository<T, ID extends Serializable>
        extends PagingAndSortingRepository<T, ID> {

    void sharedCustomMethod(ID id);

    Page<T> findByAuto(T example, Pageable pageable);
}