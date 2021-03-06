/******************************************************************************* 
 * Copyright (c) 2009 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Red Hat, Inc. - initial API and implementation 
 ******************************************************************************/ 
package org.jboss.tools.jst.web.kb.el;

import org.eclipse.core.resources.IFile;
import org.jboss.tools.common.el.core.resolver.ELContext;
import org.jboss.tools.common.el.ui.ca.ELProposalProcessor;
import org.jboss.tools.jst.web.kb.PageContextFactory;

/**
 * @author Alexey Kazakov
 */
public abstract class KbELProposalProcessor extends ELProposalProcessor {

	/* (non-Javadoc)
	 * @see org.jboss.tools.common.el.ui.ca.ELProposalProcessor#getELContext(org.eclipse.core.resources.IFile)
	 */
	@Override
	protected ELContext getELContext(IFile file) {
		return PageContextFactory.createPageContext(file);
	}
}