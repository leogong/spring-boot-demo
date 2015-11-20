package com.leo.service;

import com.leo.dataobject.PreferenceDO;

/**
 * PreferenceService Created by leo on 11/19/15.
 */
public interface PreferenceService {

    PreferenceDO findPreferenceByoId(String oId);

    PreferenceDO getPreference();

    PreferenceDO getReplyNotificationTemplate();
}
