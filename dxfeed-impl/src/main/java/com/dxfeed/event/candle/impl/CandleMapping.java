/*
 * !++
 * QDS - Quick Data Signalling Library
 * !-
 * Copyright (C) 2002 - 2018 Devexperts LLC
 * !-
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file, You can obtain one at
 * http://mozilla.org/MPL/2.0/.
 * !__
 */
package com.dxfeed.event.candle.impl;

import com.devexperts.qd.DataRecord;
import com.devexperts.qd.ng.RecordCursor;
import com.devexperts.qd.util.Decimal;
import com.devexperts.qd.util.MappingUtil;
import com.devexperts.util.TimeUtil;

public class CandleMapping extends CandleEventMapping {
// BEGIN: CODE AUTOMATICALLY GENERATED: DO NOT MODIFY. IT IS REGENERATED BY com.dxfeed.api.codegen.ImplCodeGen
    private final int iTime;
    private final int iSequence;
    private final int iCount;
    private final boolean vCountIsDecimal;
    private final int iOpen;
    private final int iHigh;
    private final int iLow;
    private final int iClose;
    private final int iVolume;
    private final int iVWAP;
    private final int iBidVolume;
    private final int iAskVolume;
    private final int iOpenInterest;
    private final int iImpVolatility;

    public CandleMapping(DataRecord record) {
        super(record);
        iTime = MappingUtil.findIntField(record, "Time", true);
        iSequence = MappingUtil.findIntField(record, "Sequence", true);
        iCount = MappingUtil.findIntField(record, "Count", false);
        vCountIsDecimal = MappingUtil.isDecimalField(record, iCount);
        iOpen = findIntField("Open", true);
        iHigh = findIntField("High", true);
        iLow = findIntField("Low", true);
        iClose = findIntField("Close", true);
        iVolume = findIntField("Volume", false);
        iVWAP = findIntField("VWAP", false);
        iBidVolume = findIntField("Bid.Volume", false);
        iAskVolume = findIntField("Ask.Volume", false);
        iOpenInterest = MappingUtil.findIntField(record, "OpenInterest", false);
        iImpVolatility = MappingUtil.findIntField(record, "ImpVolatility", false);
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

    public long getCount(RecordCursor cursor) {
        if (iCount < 0)
            return 0;
        if (vCountIsDecimal) {
            return (long) Decimal.toDouble(getInt(cursor, iCount));
        } else {
            return getInt(cursor, iCount);
        }
    }

    public void setCount(RecordCursor cursor, long count) {
        if (iCount < 0)
            return;
        if (vCountIsDecimal) {
            setInt(cursor, iCount, Decimal.composeDecimal(count, 0));
        } else {
            setInt(cursor, iCount, (int) count);
        }
    }

    public double getCountDouble(RecordCursor cursor) {
        if (iCount < 0)
            return Double.NaN;
        if (vCountIsDecimal) {
            return Decimal.toDouble(getInt(cursor, iCount));
        } else {
            return getInt(cursor, iCount);
        }
    }

    public void setCountDouble(RecordCursor cursor, double count) {
        if (iCount < 0)
            return;
        if (vCountIsDecimal) {
            setInt(cursor, iCount, Decimal.compose(count));
        } else {
            setInt(cursor, iCount, (int) count);
        }
    }

    public int getCountDecimal(RecordCursor cursor) {
        if (iCount < 0)
            return 0;
        if (vCountIsDecimal) {
            return getInt(cursor, iCount);
        } else {
            return Decimal.composeDecimal(getInt(cursor, iCount), 0);
        }
    }

    public void setCountDecimal(RecordCursor cursor, int count) {
        if (iCount < 0)
            return;
        if (vCountIsDecimal) {
            setInt(cursor, iCount, count);
        } else {
            setInt(cursor, iCount, (int) Decimal.toDouble(count));
        }
    }

    public double getOpen(RecordCursor cursor) {
        return getAsDouble(cursor, iOpen);
    }

    public void setOpen(RecordCursor cursor, double open) {
        setAsDouble(cursor, iOpen, open);
    }

    public int getOpenDecimal(RecordCursor cursor) {
        return getAsTinyDecimal(cursor, iOpen);
    }

    public void setOpenDecimal(RecordCursor cursor, int open) {
        setAsTinyDecimal(cursor, iOpen, open);
    }

    public long getOpenWideDecimal(RecordCursor cursor) {
        return getAsWideDecimal(cursor, iOpen);
    }

    public void setOpenWideDecimal(RecordCursor cursor, long open) {
        setAsWideDecimal(cursor, iOpen, open);
    }

    public double getHigh(RecordCursor cursor) {
        return getAsDouble(cursor, iHigh);
    }

    public void setHigh(RecordCursor cursor, double high) {
        setAsDouble(cursor, iHigh, high);
    }

    public int getHighDecimal(RecordCursor cursor) {
        return getAsTinyDecimal(cursor, iHigh);
    }

    public void setHighDecimal(RecordCursor cursor, int high) {
        setAsTinyDecimal(cursor, iHigh, high);
    }

    public long getHighWideDecimal(RecordCursor cursor) {
        return getAsWideDecimal(cursor, iHigh);
    }

    public void setHighWideDecimal(RecordCursor cursor, long high) {
        setAsWideDecimal(cursor, iHigh, high);
    }

    public double getLow(RecordCursor cursor) {
        return getAsDouble(cursor, iLow);
    }

    public void setLow(RecordCursor cursor, double low) {
        setAsDouble(cursor, iLow, low);
    }

    public int getLowDecimal(RecordCursor cursor) {
        return getAsTinyDecimal(cursor, iLow);
    }

    public void setLowDecimal(RecordCursor cursor, int low) {
        setAsTinyDecimal(cursor, iLow, low);
    }

    public long getLowWideDecimal(RecordCursor cursor) {
        return getAsWideDecimal(cursor, iLow);
    }

    public void setLowWideDecimal(RecordCursor cursor, long low) {
        setAsWideDecimal(cursor, iLow, low);
    }

    public double getClose(RecordCursor cursor) {
        return getAsDouble(cursor, iClose);
    }

    public void setClose(RecordCursor cursor, double close) {
        setAsDouble(cursor, iClose, close);
    }

    public int getCloseDecimal(RecordCursor cursor) {
        return getAsTinyDecimal(cursor, iClose);
    }

    public void setCloseDecimal(RecordCursor cursor, int close) {
        setAsTinyDecimal(cursor, iClose, close);
    }

    public long getCloseWideDecimal(RecordCursor cursor) {
        return getAsWideDecimal(cursor, iClose);
    }

    public void setCloseWideDecimal(RecordCursor cursor, long close) {
        setAsWideDecimal(cursor, iClose, close);
    }

    public long getVolume(RecordCursor cursor) {
        if (iVolume < 0)
            return 0;
        return getAsLong(cursor, iVolume);
    }

    public void setVolume(RecordCursor cursor, long volume) {
        if (iVolume < 0)
            return;
        setAsLong(cursor, iVolume, volume);
    }

    public double getVolumeDouble(RecordCursor cursor) {
        if (iVolume < 0)
            return Double.NaN;
        return getAsDouble(cursor, iVolume);
    }

    public void setVolumeDouble(RecordCursor cursor, double volume) {
        if (iVolume < 0)
            return;
        setAsDouble(cursor, iVolume, volume);
    }

    public int getVolumeDecimal(RecordCursor cursor) {
        if (iVolume < 0)
            return 0;
        return getAsTinyDecimal(cursor, iVolume);
    }

    public void setVolumeDecimal(RecordCursor cursor, int volume) {
        if (iVolume < 0)
            return;
        setAsTinyDecimal(cursor, iVolume, volume);
    }

    public long getVolumeWideDecimal(RecordCursor cursor) {
        if (iVolume < 0)
            return 0;
        return getAsWideDecimal(cursor, iVolume);
    }

    public void setVolumeWideDecimal(RecordCursor cursor, long volume) {
        if (iVolume < 0)
            return;
        setAsWideDecimal(cursor, iVolume, volume);
    }

    public double getVWAP(RecordCursor cursor) {
        if (iVWAP < 0)
            return Double.NaN;
        return getAsDouble(cursor, iVWAP);
    }

    public void setVWAP(RecordCursor cursor, double _VWAP) {
        if (iVWAP < 0)
            return;
        setAsDouble(cursor, iVWAP, _VWAP);
    }

    public int getVWAPDecimal(RecordCursor cursor) {
        if (iVWAP < 0)
            return 0;
        return getAsTinyDecimal(cursor, iVWAP);
    }

    public void setVWAPDecimal(RecordCursor cursor, int _VWAP) {
        if (iVWAP < 0)
            return;
        setAsTinyDecimal(cursor, iVWAP, _VWAP);
    }

    public long getVWAPWideDecimal(RecordCursor cursor) {
        if (iVWAP < 0)
            return 0;
        return getAsWideDecimal(cursor, iVWAP);
    }

    public void setVWAPWideDecimal(RecordCursor cursor, long _VWAP) {
        if (iVWAP < 0)
            return;
        setAsWideDecimal(cursor, iVWAP, _VWAP);
    }

    public long getBidVolume(RecordCursor cursor) {
        if (iBidVolume < 0)
            return 0;
        return getAsLong(cursor, iBidVolume);
    }

    public void setBidVolume(RecordCursor cursor, long bidVolume) {
        if (iBidVolume < 0)
            return;
        setAsLong(cursor, iBidVolume, bidVolume);
    }

    public double getBidVolumeDouble(RecordCursor cursor) {
        if (iBidVolume < 0)
            return Double.NaN;
        return getAsDouble(cursor, iBidVolume);
    }

    public void setBidVolumeDouble(RecordCursor cursor, double bidVolume) {
        if (iBidVolume < 0)
            return;
        setAsDouble(cursor, iBidVolume, bidVolume);
    }

    public int getBidVolumeDecimal(RecordCursor cursor) {
        if (iBidVolume < 0)
            return 0;
        return getAsTinyDecimal(cursor, iBidVolume);
    }

    public void setBidVolumeDecimal(RecordCursor cursor, int bidVolume) {
        if (iBidVolume < 0)
            return;
        setAsTinyDecimal(cursor, iBidVolume, bidVolume);
    }

    public long getBidVolumeWideDecimal(RecordCursor cursor) {
        if (iBidVolume < 0)
            return 0;
        return getAsWideDecimal(cursor, iBidVolume);
    }

    public void setBidVolumeWideDecimal(RecordCursor cursor, long bidVolume) {
        if (iBidVolume < 0)
            return;
        setAsWideDecimal(cursor, iBidVolume, bidVolume);
    }

    public long getAskVolume(RecordCursor cursor) {
        if (iAskVolume < 0)
            return 0;
        return getAsLong(cursor, iAskVolume);
    }

    public void setAskVolume(RecordCursor cursor, long askVolume) {
        if (iAskVolume < 0)
            return;
        setAsLong(cursor, iAskVolume, askVolume);
    }

    public double getAskVolumeDouble(RecordCursor cursor) {
        if (iAskVolume < 0)
            return Double.NaN;
        return getAsDouble(cursor, iAskVolume);
    }

    public void setAskVolumeDouble(RecordCursor cursor, double askVolume) {
        if (iAskVolume < 0)
            return;
        setAsDouble(cursor, iAskVolume, askVolume);
    }

    public int getAskVolumeDecimal(RecordCursor cursor) {
        if (iAskVolume < 0)
            return 0;
        return getAsTinyDecimal(cursor, iAskVolume);
    }

    public void setAskVolumeDecimal(RecordCursor cursor, int askVolume) {
        if (iAskVolume < 0)
            return;
        setAsTinyDecimal(cursor, iAskVolume, askVolume);
    }

    public long getAskVolumeWideDecimal(RecordCursor cursor) {
        if (iAskVolume < 0)
            return 0;
        return getAsWideDecimal(cursor, iAskVolume);
    }

    public void setAskVolumeWideDecimal(RecordCursor cursor, long askVolume) {
        if (iAskVolume < 0)
            return;
        setAsWideDecimal(cursor, iAskVolume, askVolume);
    }

    public long getOpenInterest(RecordCursor cursor) {
        if (iOpenInterest < 0)
            return 0;
        return (long) Decimal.toDouble(getInt(cursor, iOpenInterest));
    }

    public void setOpenInterest(RecordCursor cursor, long openInterest) {
        if (iOpenInterest < 0)
            return;
        setInt(cursor, iOpenInterest, Decimal.composeDecimal(openInterest, 0));
    }

    public double getOpenInterestDouble(RecordCursor cursor) {
        if (iOpenInterest < 0)
            return Double.NaN;
        return Decimal.toDouble(getInt(cursor, iOpenInterest));
    }

    public void setOpenInterestDouble(RecordCursor cursor, double openInterest) {
        if (iOpenInterest < 0)
            return;
        setInt(cursor, iOpenInterest, Decimal.compose(openInterest));
    }

    public int getOpenInterestDecimal(RecordCursor cursor) {
        if (iOpenInterest < 0)
            return 0;
        return getInt(cursor, iOpenInterest);
    }

    public void setOpenInterestDecimal(RecordCursor cursor, int openInterest) {
        if (iOpenInterest < 0)
            return;
        setInt(cursor, iOpenInterest, openInterest);
    }

    public double getImpVolatility(RecordCursor cursor) {
        if (iImpVolatility < 0)
            return Double.NaN;
        return Decimal.toDouble(getInt(cursor, iImpVolatility));
    }

    public void setImpVolatility(RecordCursor cursor, double impVolatility) {
        if (iImpVolatility < 0)
            return;
        setInt(cursor, iImpVolatility, Decimal.compose(impVolatility));
    }

    public int getImpVolatilityDecimal(RecordCursor cursor) {
        if (iImpVolatility < 0)
            return 0;
        return getInt(cursor, iImpVolatility);
    }

    public void setImpVolatilityDecimal(RecordCursor cursor, int impVolatility) {
        if (iImpVolatility < 0)
            return;
        setInt(cursor, iImpVolatility, impVolatility);
    }
// END: CODE AUTOMATICALLY GENERATED
}
