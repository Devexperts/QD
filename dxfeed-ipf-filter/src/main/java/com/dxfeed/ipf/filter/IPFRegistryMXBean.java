/*
 * !++
 * QDS - Quick Data Signalling Library
 * !-
 * Copyright (C) 2002 - 2021 Devexperts LLC
 * !-
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file, You can obtain one at
 * http://mozilla.org/MPL/2.0/.
 * !__
 */
package com.dxfeed.ipf.filter;

/**
 * Registry of dynamic IPF filters.
 *
 * @dgen.annotate method {}
 */
public interface IPFRegistryMXBean {
    /**
     * The number of registered dynamic IPF filters
     */
    public int getRegisteredFiltersCount();

    /**
     * All registered dynamic IPF filters
     */
    public String[] getRegisteredFilters();

    /**
     * Report stats for all registered dynamic IPF filters
     */
    public String reportStats();

    /**
     * Forces update of a dynamic filter with the given filter specification
     *
     * @param filterSpec Filter specification string
     */
    public String forceUpdate(String filterSpec);
}
