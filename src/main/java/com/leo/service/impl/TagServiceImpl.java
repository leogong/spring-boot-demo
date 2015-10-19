package com.leo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.leo.dao.TagMapper;
import com.leo.dataobject.TagDO;
import com.leo.service.TagService;

/**
 * UserInfoServiceImpl Created by leo on 10/20/15.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    public TagDO get(Long id) {
        return tagMapper.findById(id);
    }

}
