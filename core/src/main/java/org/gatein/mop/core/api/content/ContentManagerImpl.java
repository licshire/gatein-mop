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
package org.gatein.mop.core.api.content;

import org.gatein.mop.api.content.ContentManager;
import org.gatein.mop.api.content.Content;
import org.gatein.mop.api.content.ContentType;
import org.chromattic.api.ChromatticSession;

/**
 * @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a>
 * @version $Revision$
 */
public class ContentManagerImpl implements ContentManager {

  /** . */
  final ContentManagerRegistry contentManagers;

  /** . */
  final CustomizationContextProviderRegistry customizationContextResolvers;

  /** . */
  private final ChromatticSession session;

  public ContentManagerImpl(
    ContentManagerRegistry contentManagers,
    CustomizationContextProviderRegistry customizationContextResolvers,
    ChromatticSession session) {

    //
    this.contentManagers = contentManagers;
    this.session = session;
    this.customizationContextResolvers = customizationContextResolvers;
  }

  public <S> Content<S> getContent(ContentType<S> contentType, String contentId) {
    throw new UnsupportedOperationException();
  }

  public Content<?> getContent(String mimeType, String contentId) {
    throw new UnsupportedOperationException();
  }
}