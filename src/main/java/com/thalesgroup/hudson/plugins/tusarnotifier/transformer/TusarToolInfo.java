/*******************************************************************************
 * Copyright (c) 2010 Thales Corporate Services SAS                             *
 *                                                                              *
 * Permission is hereby granted, free of charge, to any person obtaining a copy *
 * of this software and associated documentation files (the "Software"), to deal*
 * in the Software without restriction, including without limitation the rights *
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell    *
 * copies of the Software, and to permit persons to whom the Software is        *
 * furnished to do so, subject to the following conditions:                     *
 *                                                                              *
 * The above copyright notice and this permission notice shall be included in   *
 * all copies or substantial portions of the Software.                          *
 *                                                                              *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR   *
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,     *
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE  *
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER       *
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,*
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN    *
 * THE SOFTWARE.                                                                *
 *******************************************************************************/

package com.thalesgroup.hudson.plugins.tusarnotifier.transformer;

import com.thalesgroup.dtkit.metrics.hudson.api.type.MetricsType;

import java.io.File;
import java.io.Serializable;

/**
 * @author Gregory Boissinot
 */
public class TusarToolInfo implements Serializable {

    private File cusXSLFile;

    private final MetricsType metricsType;

    private final File outputDir;

    private final String expandedPattern;

    private final long buildTime;

    public TusarToolInfo(MetricsType metricsType, File outputDir, String expandedPattern, long buildTime) {
        this.metricsType = metricsType;
        this.outputDir = outputDir;
        this.expandedPattern = expandedPattern;
        this.buildTime = buildTime;
    }

    public void setCusXSLFile(File cusXSLFile) {
        this.cusXSLFile = cusXSLFile;
    }

    public File getCusXSLFile() {
        return cusXSLFile;
    }

    public MetricsType getMetricsType() {
        return metricsType;
    }

    public File getOutputDir() {
        return outputDir;
    }

    public String getExpandedPattern() {
        return expandedPattern;
    }

    public long getBuildTime() {
        return buildTime;
    }
}
