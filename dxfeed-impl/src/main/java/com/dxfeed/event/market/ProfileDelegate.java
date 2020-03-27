/*
 * !++
 * QDS - Quick Data Signalling Library
 * !-
 * Copyright (C) 2002 - 2020 Devexperts LLC
 * !-
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file, You can obtain one at
 * http://mozilla.org/MPL/2.0/.
 * !__
 */
package com.dxfeed.event.market;

import com.devexperts.qd.DataRecord;
import com.devexperts.qd.QDContract;
import com.devexperts.qd.ng.RecordBuffer;
import com.devexperts.qd.ng.RecordCursor;
import com.dxfeed.api.impl.EventDelegateFlags;
import com.dxfeed.event.market.impl.ProfileMapping;

import java.util.EnumSet;

public final class ProfileDelegate extends MarketEventDelegateImpl<Profile> {
// BEGIN: CODE AUTOMATICALLY GENERATED: DO NOT MODIFY. IT IS REGENERATED BY com.dxfeed.api.codegen.ImplCodeGen
    private final ProfileMapping m;

    public ProfileDelegate(DataRecord record, QDContract contract, EnumSet<EventDelegateFlags> flags) {
        super(record, contract, flags);
        m = record.getMapping(ProfileMapping.class);
    }

    @Override
    public ProfileMapping getMapping() {
        return m;
    }

    @Override
    public Profile createEvent() {
        return new Profile();
    }

    @Override
    public Profile getEvent(Profile event, RecordCursor cursor) {
        super.getEvent(event, cursor);
        event.setHigh52WeekPrice(m.getHighPrice52(cursor));
        event.setLow52WeekPrice(m.getLowPrice52(cursor));
        event.setHighLimitPrice(m.getHighLimitPrice(cursor));
        event.setLowLimitPrice(m.getLowLimitPrice(cursor));
        event.setHaltStartTime(m.getHaltStartTimeMillis(cursor));
        event.setHaltEndTime(m.getHaltEndTimeMillis(cursor));
        event.setFlags(m.getFlags(cursor));
        event.setDescription(m.getDescription(cursor));
        event.setStatusReason(m.getStatusReason(cursor));
        return event;
    }

    @Override
    public RecordCursor putEvent(Profile event, RecordBuffer buf) {
        RecordCursor cursor = super.putEvent(event, buf);
        m.setHighPrice52(cursor, event.getHigh52WeekPrice());
        m.setLowPrice52(cursor, event.getLow52WeekPrice());
        m.setHighLimitPrice(cursor, event.getHighLimitPrice());
        m.setLowLimitPrice(cursor, event.getLowLimitPrice());
        m.setHaltStartTimeMillis(cursor, event.getHaltStartTime());
        m.setHaltEndTimeMillis(cursor, event.getHaltEndTime());
        m.setFlags(cursor, event.getFlags());
        m.setDescription(cursor, event.getDescription());
        m.setStatusReason(cursor, event.getStatusReason());
        return cursor;
    }
// END: CODE AUTOMATICALLY GENERATED
}
