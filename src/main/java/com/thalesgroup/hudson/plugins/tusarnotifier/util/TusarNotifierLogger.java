/*******************************************************************************
 * Copyright (c) 2010 Thales Corporate Services SAS                             *
 * Author : Gregory Boissinot, Guillaume Tanier                                 *
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

package com.thalesgroup.hudson.plugins.tusarnotifier.util;

import com.google.inject.Inject;
import hudson.model.BuildListener;

import java.io.Serializable;


public class TusarNotifierLogger implements Serializable {

    private BuildListener buildListener;

    @Inject
    @SuppressWarnings("unused")
    void set(BuildListener buildListener) {
        this.buildListener = buildListener;
    }

    /**
     * Log an info output to the given logger
     *
     * @param message The message to be outputted
     */
    public void info(String message) {
        buildListener.getLogger().println("[tusarNotifier] [INFO] - " + message);
    }


    /**
     * Log an error output to the given logger
     *
     * @param message The message to be outputted
     */
    public void error(String message) {
        buildListener.getLogger().println("[tusarNotifier] [ERROR] - " + message);
    }

    /**
     * Log a warning output to the given logger
     *
     * @param message The message to be outputted
     */
    public void warning(String message) {
        buildListener.getLogger().println("[tusarNotifier] [WARNING] - " + message);
    }


}
