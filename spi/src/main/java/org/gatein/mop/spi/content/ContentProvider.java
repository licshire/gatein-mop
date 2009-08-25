/**
 * Copyright (C) 2009 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.gatein.mop.spi.content;

import java.util.List;

/**
 * @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a>
 * @version $Revision$
 */
public interface ContentProvider<S> {

  /**
   * <p>Returns the state wrapper associated with the specified content or null if no relationship can be
   * done with the specifiec content. When the <tt>GetState</tt> response is returned with a null state
   * it means that the content is found but is stateless.</p>
   *
   * @param contentId the content id
   * @return the content state
   */
  GetState getState(String contentId);

  /**
   * Combines several states into a single state representation.
   *
   * @param states the various states to combine
   * @return the combined state
   */
  S combine(List<S> states);

}
