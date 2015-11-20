package com.leo.service.impl;

import com.leo.dao.PreferenceMapper;
import com.leo.dataobject.PreferenceDO;
import com.leo.service.PreferenceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by leo on 11/19/15.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PreferenceServiceImpl implements PreferenceService {

    @Resource
    private PreferenceMapper preferenceMapper;

    // @Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = Exception.class)
    public PreferenceDO findPreferenceByoId(String oId) {
        return preferenceMapper.findById(oId);
    }

    public PreferenceDO getPreference() {
        return findPreferenceByoId("preference");
    }

    public PreferenceDO getReplyNotificationTemplate() {
        return findPreferenceByoId("replyNotificationTemplate");
    }
}
