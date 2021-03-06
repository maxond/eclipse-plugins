/*******************************************************************************
 * Copyright (c) 2014 Liviu Ionescu.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Liviu Ionescu - initial implementation.
 *******************************************************************************/

package ilg.gnumcueclipse.packs.core.tree;

public class TreePreOrderIterator extends AbstractTreePreOrderIterator {

	public TreePreOrderIterator() {
		super();
	}

	@Override
	public boolean isIterable(Leaf node) {
		return true;
	}

	@Override
	public boolean isLeaf(Leaf node) {
		return false;
	}
}
