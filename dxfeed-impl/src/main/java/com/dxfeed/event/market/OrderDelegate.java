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
import com.dxfeed.event.IndexedEventSource;
import com.dxfeed.event.market.impl.OrderMapping;

import java.util.EnumSet;

public final class OrderDelegate extends OrderBaseDelegateImpl<Order> {
// BEGIN: CODE AUTOMATICALLY GENERATED: DO NOT MODIFY. IT IS REGENERATED BY com.dxfeed.api.codegen.ImplCodeGen
    private final OrderMapping m;

    public OrderDelegate(DataRecord record, QDContract contract, EnumSet<EventDelegateFlags> flags) {
        super(record, contract, flags);
        m = record.getMapping(OrderMapping.class);
    }

    @Override
    public OrderMapping getMapping() {
        return m;
    }

    @Override
    public Order createEvent() {
        return new Order();
    }

    @Override
    public Order getEvent(Order event, RecordCursor cursor) {
        super.getEvent(event, cursor);
        event.setEventFlags(cursor.getEventFlags());
        event.setIndex(((long) getSource().id() << 32) | (m.getIndex(cursor) & 0xFFFFFFFFL));
        event.setTimeSequence((((long) m.getTimeSeconds(cursor)) << 32) | (m.getSequence(cursor) & 0xFFFFFFFFL));
        event.setTimeNanoPart(m.getTimeNanoPart(cursor));
        event.setActionTime(m.getActionTimeMillis(cursor));
        event.setOrderId(m.getOrderId(cursor));
        event.setAuxOrderId(m.getAuxOrderId(cursor));
        event.setPrice(m.getPrice(cursor));
        event.setSizeAsDouble(m.getSizeDouble(cursor));
        event.setExecutedSize(m.getExecutedSize(cursor));
        event.setCount(m.getCount(cursor));
        event.setFlags(m.getFlags(cursor));
        event.setTradeId(m.getTradeId(cursor));
        event.setTradePrice(m.getTradePrice(cursor));
        event.setTradeSize(m.getTradeSize(cursor));
        event.setMarketMaker(m.getMarketMakerString(cursor));
        return event;
    }

    @Override
    public RecordCursor putEvent(Order event, RecordBuffer buf) {
        RecordCursor cursor = super.putEvent(event, buf);
        cursor.setEventFlags(event.getEventFlags());
        int index = (int) event.getIndex();
        m.setIndex(cursor, index);
        m.setTimeSeconds(cursor, (int) (event.getTimeSequence() >>> 32));
        m.setSequence(cursor, (int) event.getTimeSequence());
        m.setTimeNanoPart(cursor, event.getTimeNanoPart());
        m.setActionTimeMillis(cursor, event.getActionTime());
        m.setOrderId(cursor, event.getOrderId());
        m.setAuxOrderId(cursor, event.getAuxOrderId());
        m.setPrice(cursor, event.getPrice());
        m.setSizeDouble(cursor, event.getSizeAsDouble());
        m.setExecutedSize(cursor, event.getExecutedSize());
        m.setCount(cursor, (int) event.getCount());
        m.setFlags(cursor, event.getFlags());
        m.setTradeId(cursor, event.getTradeId());
        m.setTradePrice(cursor, event.getTradePrice());
        m.setTradeSize(cursor, event.getTradeSize());
        m.setMarketMakerString(cursor, event.getMarketMaker());
        if (index < 0)
            throw new IllegalArgumentException("Invalid index to publish");
        if ((event.getEventFlags() & (OrderBase.SNAPSHOT_END | OrderBase.SNAPSHOT_SNIP)) != 0 && index != 0)
            throw new IllegalArgumentException("SNAPSHOT_END and SNAPSHOT_SNIP orders must have index == 0");
        if (event.getOrderSide() == Side.UNDEFINED && event.hasSize())
            throw new IllegalArgumentException("only empty orders can have side == UNDEFINED");
        return cursor;
    }

    @Override
    public IndexedEventSource getSource() {
        return m.getRecordSource();
    }
// END: CODE AUTOMATICALLY GENERATED
}
