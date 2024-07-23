/*[INCLUDE-IF Sidecar18-SE]*/
/*
 * Copyright IBM Corp. and others 2004
 *
 * This program and the accompanying materials are made available under
 * the terms of the Eclipse Public License 2.0 which accompanies this
 * distribution and is available at https://www.eclipse.org/legal/epl-2.0/
 * or the Apache License, Version 2.0 which accompanies this distribution and
 * is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * This Source Code may also be made available under the following
 * Secondary Licenses when the conditions for such availability set
 * forth in the Eclipse Public License, v. 2.0 are satisfied: GNU
 * General Public License, version 2 with the GNU Classpath
 * Exception [1] and GNU General Public License, version 2 with the
 * OpenJDK Assembly Exception [2].
 *
 * [1] https://www.gnu.org/software/classpath/license.html
 * [2] https://openjdk.org/legal/assembly-exception.html
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0 OR GPL-2.0-only WITH Classpath-exception-2.0 OR GPL-2.0-only WITH OpenJDK-assembly-exception-1.0
 */
package com.ibm.dtfj.image;

/**
 * Represents the state of a CPU or FPU register
 */
public interface ImageRegister {

    /**
     * Get the name of the register.
     *
     * @return The conventional name of the register
     */
    public String getName();

    /**
     * Get the value of the register.
     *
     * @return An integral or floating point type which contains the value of the register. The returned value may be
     * an instance of any subclass of Number. On 32-bit and 31-bit platforms the value is usually an Integer, and on
     * 64-bit platforms the value is usually a Long. On x86 architectures with MMX, the XMM registers are returned as
     * BigInteger.
     * @throws CorruptDataException
     */
    public Number getValue() throws CorruptDataException;

}
