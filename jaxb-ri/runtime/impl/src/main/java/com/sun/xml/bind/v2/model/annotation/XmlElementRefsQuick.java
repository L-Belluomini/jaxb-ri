/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Distribution License v. 1.0, which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: BSD-3-Clause
 */

package com.sun.xml.bind.v2.model.annotation;

import java.lang.annotation.Annotation;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;


/**
 * <p><b>Auto-generated, do not edit.</b></p>
 * 
 */
final class XmlElementRefsQuick
    extends Quick
    implements XmlElementRefs
{

    private final XmlElementRefs core;

    public XmlElementRefsQuick(Locatable upstream, XmlElementRefs core) {
        super(upstream);
        this.core = core;
    }

    protected Annotation getAnnotation() {
        return core;
    }

    protected Quick newInstance(Locatable upstream, Annotation core) {
        return new XmlElementRefsQuick(upstream, ((XmlElementRefs) core));
    }

    public Class<XmlElementRefs> annotationType() {
        return XmlElementRefs.class;
    }

    public XmlElementRef[] value() {
        return core.value();
    }

}
