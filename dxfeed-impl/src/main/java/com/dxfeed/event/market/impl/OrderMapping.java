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
package com.dxfeed.event.market.impl;

import com.devexperts.qd.DataRecord;
import com.devexperts.qd.ng.RecordCursor;
import com.devexperts.qd.util.MappingUtil;
import com.devexperts.qd.util.ShortString;
import com.devexperts.util.TimeUtil;

public class OrderMapping extends OrderBaseMapping {
// BEGIN: CODE AUTOMATICALLY GENERATED: DO NOT MODIFY. IT IS REGENERATED BY com.dxfeed.api.codegen.ImplCodeGen
    private final int iIndex;
    private final int iTime;
    private final int iSequence;
    private final int iTimeNanoPart;
    private final int iActionTime;
    private final int iOrderId;
    private final int iAuxOrderId;
    private final int iPrice;
    private final int iSize;
    private final int iExecutedSize;
    private final int iCount;
    private final int iFlags;
    private final int iTradeId;
    private final int iTradePrice;
    private final int iTradeSize;
    private final int iMarketMaker;
    private final int iIcebergPeakSize;
    private final int iIcebergHiddenSize;
    private final int iIcebergExecutedSize;
    private final int iIcebergFlags;

    public OrderMapping(DataRecord record) {
        super(record);
        iIndex = MappingUtil.findIntField(record, "Index", true);
        iTime = MappingUtil.findIntField(record, "Time", true);
        iSequence = MappingUtil.findIntField(record, "Sequence", true);
        iTimeNanoPart = MappingUtil.findIntField(record, "TimeNanoPart", false);
        iActionTime = MappingUtil.findIntField(record, "ActionTime", false);
        iOrderId = MappingUtil.findIntField(record, "OrderId", false);
        iAuxOrderId = MappingUtil.findIntField(record, "AuxOrderId", false);
        iPrice = findIntField("Price", true);
        iSize = findIntField("Size", true);
        iExecutedSize = findIntField("ExecutedSize", false);
        iCount = findIntField("Count", false);
        iFlags = MappingUtil.findIntField(record, "Flags", true);
        iTradeId = MappingUtil.findIntField(record, "TradeId", false);
        iTradePrice = findIntField("TradePrice", false);
        iTradeSize = findIntField("TradeSize", false);
        iMarketMaker = MappingUtil.findIntField(record, "MMID", false);
        iIcebergPeakSize = findIntField("IcebergPeakSize", false);
        iIcebergHiddenSize = findIntField("IcebergHiddenSize", false);
        iIcebergExecutedSize = findIntField("IcebergExecutedSize", false);
        iIcebergFlags = MappingUtil.findIntField(record, "IcebergFlags", false);
        putNonDefaultPropertyName("MMID", "MarketMaker");
    }

    public int getIndex(RecordCursor cursor) {
        return getInt(cursor, iIndex);
    }

    public void setIndex(RecordCursor cursor, int index) {
        setInt(cursor, iIndex, index);
    }

    public long getTimeMillis(RecordCursor cursor) {
        return getInt(cursor, iTime) * 1000L;
    }

    public void setTimeMillis(RecordCursor cursor, long time) {
        setInt(cursor, iTime, TimeUtil.getSecondsFromTime(time));
    }

    public int getTimeSeconds(RecordCursor cursor) {
        return getInt(cursor, iTime);
    }

    public void setTimeSeconds(RecordCursor cursor, int time) {
        setInt(cursor, iTime, time);
    }

    public int getSequence(RecordCursor cursor) {
        return getInt(cursor, iSequence);
    }

    public void setSequence(RecordCursor cursor, int sequence) {
        setInt(cursor, iSequence, sequence);
    }

    public int getTimeNanoPart(RecordCursor cursor) {
        if (iTimeNanoPart < 0)
            return 0;
        return getInt(cursor, iTimeNanoPart);
    }

    public void setTimeNanoPart(RecordCursor cursor, int timeNanoPart) {
        if (iTimeNanoPart < 0)
            return;
        setInt(cursor, iTimeNanoPart, timeNanoPart);
    }

    public long getActionTimeMillis(RecordCursor cursor) {
        if (iActionTime < 0)
            return 0;
        return getLong(cursor, iActionTime);
    }

    public void setActionTimeMillis(RecordCursor cursor, long actionTime) {
        if (iActionTime < 0)
            return;
        setLong(cursor, iActionTime, actionTime);
    }

    public int getActionTimeSeconds(RecordCursor cursor) {
        if (iActionTime < 0)
            return 0;
        return TimeUtil.getSecondsFromTime(getLong(cursor, iActionTime));
    }

    public void setActionTimeSeconds(RecordCursor cursor, int actionTime) {
        if (iActionTime < 0)
            return;
        setLong(cursor, iActionTime, actionTime * 1000L);
    }

    public long getOrderId(RecordCursor cursor) {
        if (iOrderId < 0)
            return 0;
        return getLong(cursor, iOrderId);
    }

    public void setOrderId(RecordCursor cursor, long orderId) {
        if (iOrderId < 0)
            return;
        setLong(cursor, iOrderId, orderId);
    }

    public long getAuxOrderId(RecordCursor cursor) {
        if (iAuxOrderId < 0)
            return 0;
        return getLong(cursor, iAuxOrderId);
    }

    public void setAuxOrderId(RecordCursor cursor, long auxOrderId) {
        if (iAuxOrderId < 0)
            return;
        setLong(cursor, iAuxOrderId, auxOrderId);
    }

    public double getPrice(RecordCursor cursor) {
        return getAsDouble(cursor, iPrice);
    }

    public void setPrice(RecordCursor cursor, double price) {
        setAsDouble(cursor, iPrice, price);
    }

    public int getPriceDecimal(RecordCursor cursor) {
        return getAsTinyDecimal(cursor, iPrice);
    }

    public void setPriceDecimal(RecordCursor cursor, int price) {
        setAsTinyDecimal(cursor, iPrice, price);
    }

    public long getPriceWideDecimal(RecordCursor cursor) {
        return getAsWideDecimal(cursor, iPrice);
    }

    public void setPriceWideDecimal(RecordCursor cursor, long price) {
        setAsWideDecimal(cursor, iPrice, price);
    }

    public int getSize(RecordCursor cursor) {
        return getAsInt(cursor, iSize);
    }

    public void setSize(RecordCursor cursor, int size) {
        setAsInt(cursor, iSize, size);
    }

    public long getSizeLong(RecordCursor cursor) {
        return getAsLong(cursor, iSize);
    }

    public void setSizeLong(RecordCursor cursor, long size) {
        setAsLong(cursor, iSize, size);
    }

    public double getSizeDouble(RecordCursor cursor) {
        return getAsDouble(cursor, iSize);
    }

    public void setSizeDouble(RecordCursor cursor, double size) {
        setAsDouble(cursor, iSize, size);
    }

    public int getSizeDecimal(RecordCursor cursor) {
        return getAsTinyDecimal(cursor, iSize);
    }

    public void setSizeDecimal(RecordCursor cursor, int size) {
        setAsTinyDecimal(cursor, iSize, size);
    }

    public long getSizeWideDecimal(RecordCursor cursor) {
        return getAsWideDecimal(cursor, iSize);
    }

    public void setSizeWideDecimal(RecordCursor cursor, long size) {
        setAsWideDecimal(cursor, iSize, size);
    }

    public double getExecutedSize(RecordCursor cursor) {
        if (iExecutedSize < 0)
            return Double.NaN;
        return getAsDouble(cursor, iExecutedSize);
    }

    public void setExecutedSize(RecordCursor cursor, double executedSize) {
        if (iExecutedSize < 0)
            return;
        setAsDouble(cursor, iExecutedSize, executedSize);
    }

    public int getExecutedSizeDecimal(RecordCursor cursor) {
        if (iExecutedSize < 0)
            return 0;
        return getAsTinyDecimal(cursor, iExecutedSize);
    }

    public void setExecutedSizeDecimal(RecordCursor cursor, int executedSize) {
        if (iExecutedSize < 0)
            return;
        setAsTinyDecimal(cursor, iExecutedSize, executedSize);
    }

    public long getExecutedSizeWideDecimal(RecordCursor cursor) {
        if (iExecutedSize < 0)
            return 0;
        return getAsWideDecimal(cursor, iExecutedSize);
    }

    public void setExecutedSizeWideDecimal(RecordCursor cursor, long executedSize) {
        if (iExecutedSize < 0)
            return;
        setAsWideDecimal(cursor, iExecutedSize, executedSize);
    }

    public int getCount(RecordCursor cursor) {
        if (iCount < 0)
            return 0;
        return getAsInt(cursor, iCount);
    }

    public void setCount(RecordCursor cursor, int count) {
        if (iCount < 0)
            return;
        setAsInt(cursor, iCount, count);
    }

    public long getCountLong(RecordCursor cursor) {
        if (iCount < 0)
            return 0;
        return getAsLong(cursor, iCount);
    }

    public void setCountLong(RecordCursor cursor, long count) {
        if (iCount < 0)
            return;
        setAsLong(cursor, iCount, count);
    }

    public double getCountDouble(RecordCursor cursor) {
        if (iCount < 0)
            return Double.NaN;
        return getAsDouble(cursor, iCount);
    }

    public void setCountDouble(RecordCursor cursor, double count) {
        if (iCount < 0)
            return;
        setAsDouble(cursor, iCount, count);
    }

    public int getCountDecimal(RecordCursor cursor) {
        if (iCount < 0)
            return 0;
        return getAsTinyDecimal(cursor, iCount);
    }

    public void setCountDecimal(RecordCursor cursor, int count) {
        if (iCount < 0)
            return;
        setAsTinyDecimal(cursor, iCount, count);
    }

    public long getCountWideDecimal(RecordCursor cursor) {
        if (iCount < 0)
            return 0;
        return getAsWideDecimal(cursor, iCount);
    }

    public void setCountWideDecimal(RecordCursor cursor, long count) {
        if (iCount < 0)
            return;
        setAsWideDecimal(cursor, iCount, count);
    }

    public int getFlags(RecordCursor cursor) {
        return getInt(cursor, iFlags);
    }

    public void setFlags(RecordCursor cursor, int flags) {
        setInt(cursor, iFlags, flags);
    }

    public long getTradeId(RecordCursor cursor) {
        if (iTradeId < 0)
            return 0;
        return getLong(cursor, iTradeId);
    }

    public void setTradeId(RecordCursor cursor, long tradeId) {
        if (iTradeId < 0)
            return;
        setLong(cursor, iTradeId, tradeId);
    }

    public double getTradePrice(RecordCursor cursor) {
        if (iTradePrice < 0)
            return Double.NaN;
        return getAsDouble(cursor, iTradePrice);
    }

    public void setTradePrice(RecordCursor cursor, double tradePrice) {
        if (iTradePrice < 0)
            return;
        setAsDouble(cursor, iTradePrice, tradePrice);
    }

    public int getTradePriceDecimal(RecordCursor cursor) {
        if (iTradePrice < 0)
            return 0;
        return getAsTinyDecimal(cursor, iTradePrice);
    }

    public void setTradePriceDecimal(RecordCursor cursor, int tradePrice) {
        if (iTradePrice < 0)
            return;
        setAsTinyDecimal(cursor, iTradePrice, tradePrice);
    }

    public long getTradePriceWideDecimal(RecordCursor cursor) {
        if (iTradePrice < 0)
            return 0;
        return getAsWideDecimal(cursor, iTradePrice);
    }

    public void setTradePriceWideDecimal(RecordCursor cursor, long tradePrice) {
        if (iTradePrice < 0)
            return;
        setAsWideDecimal(cursor, iTradePrice, tradePrice);
    }

    public double getTradeSize(RecordCursor cursor) {
        if (iTradeSize < 0)
            return Double.NaN;
        return getAsDouble(cursor, iTradeSize);
    }

    public void setTradeSize(RecordCursor cursor, double tradeSize) {
        if (iTradeSize < 0)
            return;
        setAsDouble(cursor, iTradeSize, tradeSize);
    }

    public int getTradeSizeDecimal(RecordCursor cursor) {
        if (iTradeSize < 0)
            return 0;
        return getAsTinyDecimal(cursor, iTradeSize);
    }

    public void setTradeSizeDecimal(RecordCursor cursor, int tradeSize) {
        if (iTradeSize < 0)
            return;
        setAsTinyDecimal(cursor, iTradeSize, tradeSize);
    }

    public long getTradeSizeWideDecimal(RecordCursor cursor) {
        if (iTradeSize < 0)
            return 0;
        return getAsWideDecimal(cursor, iTradeSize);
    }

    public void setTradeSizeWideDecimal(RecordCursor cursor, long tradeSize) {
        if (iTradeSize < 0)
            return;
        setAsWideDecimal(cursor, iTradeSize, tradeSize);
    }

    @Deprecated
    public String getMMIDString(RecordCursor cursor) {
        if (iMarketMaker < 0)
            return null;
        return ShortString.decode(getInt(cursor, iMarketMaker));
    }

    @Deprecated
    public void setMMIDString(RecordCursor cursor, String _MMID) {
        if (iMarketMaker < 0)
            return;
        setInt(cursor, iMarketMaker, (int) ShortString.encode(_MMID));
    }

    @Deprecated
    public int getMMID(RecordCursor cursor) {
        if (iMarketMaker < 0)
            return 0;
        return getInt(cursor, iMarketMaker);
    }

    @Deprecated
    public void setMMID(RecordCursor cursor, int _MMID) {
        if (iMarketMaker < 0)
            return;
        setInt(cursor, iMarketMaker, _MMID);
    }

    public String getMarketMakerString(RecordCursor cursor) {
        if (iMarketMaker < 0)
            return null;
        return ShortString.decode(getInt(cursor, iMarketMaker));
    }

    public void setMarketMakerString(RecordCursor cursor, String marketMaker) {
        if (iMarketMaker < 0)
            return;
        setInt(cursor, iMarketMaker, (int) ShortString.encode(marketMaker));
    }

    public int getMarketMaker(RecordCursor cursor) {
        if (iMarketMaker < 0)
            return 0;
        return getInt(cursor, iMarketMaker);
    }

    public void setMarketMaker(RecordCursor cursor, int marketMaker) {
        if (iMarketMaker < 0)
            return;
        setInt(cursor, iMarketMaker, marketMaker);
    }

    public double getIcebergPeakSize(RecordCursor cursor) {
        if (iIcebergPeakSize < 0)
            return Double.NaN;
        return getAsDouble(cursor, iIcebergPeakSize);
    }

    public void setIcebergPeakSize(RecordCursor cursor, double icebergPeakSize) {
        if (iIcebergPeakSize < 0)
            return;
        setAsDouble(cursor, iIcebergPeakSize, icebergPeakSize);
    }

    public int getIcebergPeakSizeDecimal(RecordCursor cursor) {
        if (iIcebergPeakSize < 0)
            return 0;
        return getAsTinyDecimal(cursor, iIcebergPeakSize);
    }

    public void setIcebergPeakSizeDecimal(RecordCursor cursor, int icebergPeakSize) {
        if (iIcebergPeakSize < 0)
            return;
        setAsTinyDecimal(cursor, iIcebergPeakSize, icebergPeakSize);
    }

    public long getIcebergPeakSizeWideDecimal(RecordCursor cursor) {
        if (iIcebergPeakSize < 0)
            return 0;
        return getAsWideDecimal(cursor, iIcebergPeakSize);
    }

    public void setIcebergPeakSizeWideDecimal(RecordCursor cursor, long icebergPeakSize) {
        if (iIcebergPeakSize < 0)
            return;
        setAsWideDecimal(cursor, iIcebergPeakSize, icebergPeakSize);
    }

    public double getIcebergHiddenSize(RecordCursor cursor) {
        if (iIcebergHiddenSize < 0)
            return Double.NaN;
        return getAsDouble(cursor, iIcebergHiddenSize);
    }

    public void setIcebergHiddenSize(RecordCursor cursor, double icebergHiddenSize) {
        if (iIcebergHiddenSize < 0)
            return;
        setAsDouble(cursor, iIcebergHiddenSize, icebergHiddenSize);
    }

    public int getIcebergHiddenSizeDecimal(RecordCursor cursor) {
        if (iIcebergHiddenSize < 0)
            return 0;
        return getAsTinyDecimal(cursor, iIcebergHiddenSize);
    }

    public void setIcebergHiddenSizeDecimal(RecordCursor cursor, int icebergHiddenSize) {
        if (iIcebergHiddenSize < 0)
            return;
        setAsTinyDecimal(cursor, iIcebergHiddenSize, icebergHiddenSize);
    }

    public long getIcebergHiddenSizeWideDecimal(RecordCursor cursor) {
        if (iIcebergHiddenSize < 0)
            return 0;
        return getAsWideDecimal(cursor, iIcebergHiddenSize);
    }

    public void setIcebergHiddenSizeWideDecimal(RecordCursor cursor, long icebergHiddenSize) {
        if (iIcebergHiddenSize < 0)
            return;
        setAsWideDecimal(cursor, iIcebergHiddenSize, icebergHiddenSize);
    }

    public double getIcebergExecutedSize(RecordCursor cursor) {
        if (iIcebergExecutedSize < 0)
            return Double.NaN;
        return getAsDouble(cursor, iIcebergExecutedSize);
    }

    public void setIcebergExecutedSize(RecordCursor cursor, double icebergExecutedSize) {
        if (iIcebergExecutedSize < 0)
            return;
        setAsDouble(cursor, iIcebergExecutedSize, icebergExecutedSize);
    }

    public int getIcebergExecutedSizeDecimal(RecordCursor cursor) {
        if (iIcebergExecutedSize < 0)
            return 0;
        return getAsTinyDecimal(cursor, iIcebergExecutedSize);
    }

    public void setIcebergExecutedSizeDecimal(RecordCursor cursor, int icebergExecutedSize) {
        if (iIcebergExecutedSize < 0)
            return;
        setAsTinyDecimal(cursor, iIcebergExecutedSize, icebergExecutedSize);
    }

    public long getIcebergExecutedSizeWideDecimal(RecordCursor cursor) {
        if (iIcebergExecutedSize < 0)
            return 0;
        return getAsWideDecimal(cursor, iIcebergExecutedSize);
    }

    public void setIcebergExecutedSizeWideDecimal(RecordCursor cursor, long icebergExecutedSize) {
        if (iIcebergExecutedSize < 0)
            return;
        setAsWideDecimal(cursor, iIcebergExecutedSize, icebergExecutedSize);
    }

    public int getIcebergFlags(RecordCursor cursor) {
        if (iIcebergFlags < 0)
            return 0;
        return getInt(cursor, iIcebergFlags);
    }

    public void setIcebergFlags(RecordCursor cursor, int icebergFlags) {
        if (iIcebergFlags < 0)
            return;
        setInt(cursor, iIcebergFlags, icebergFlags);
    }
// END: CODE AUTOMATICALLY GENERATED
}
