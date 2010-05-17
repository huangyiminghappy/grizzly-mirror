/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright 2010 Sun Microsystems, Inc. All rights reserved.
 * 
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License. You can obtain
 * a copy of the License at https://glassfish.dev.java.net/public/CDDL+GPL.html
 * or glassfish/bootstrap/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at glassfish/bootstrap/legal/LICENSE.txt.
 * Sun designates this particular file as subject to the "Classpath" exception
 * as provided by Sun in the GPL Version 2 section of the License file that
 * accompanied this code.  If applicable, add the following below the License
 * Header, with the fields enclosed by brackets [] replaced by your own
 * identifying information: "Portions Copyrighted [year]
 * [name of copyright owner]"
 * 
 * Contributor(s):
 * 
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */

package com.sun.grizzly.http;

/**
 * Maintains semantic state necessary to proper HTTP processing.
 */
class ProcessingState {

    /**
     * <p>
     * This flag controls the semantics of the Connection response header.
     * </p>
     */
    public boolean keepAlive = true;

    /**
     * <p>
     * Indicates if an error occurred during request/response processing.
     * </p>
     */
    public boolean error;

    /**
     * <p>
     * Flag indicating that the request was made using the HTTP/1.1 protocol.
     * </p>
     */
    public boolean http11 = true;

    /**
     * <p>
     * Flag indicating that the request was made using the HTTP/0.9 protocol.
     * </p>
     */
    public boolean http09 = false;


    /**
     * <p>
     * Content delimitation for the request.  If <code>false</code>, the
     * connection will be closed at the end of the request.
     * </p>
     */
    public boolean contentDelimitation = true;


    /**
     * <p>
     * Resets values to their initial states.
     * </p>
     */
    public void recycle() {
        keepAlive = true;
        error = false;
        http11 = true;
        http09 = false;
        contentDelimitation = true;
    }

}
