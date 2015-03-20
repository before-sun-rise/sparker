package com.sparker.data;

import com.sparker.model.Credential;
import com.sparker.model.WebLink;

/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 *          <p/>
 *          Creation Date: 2015/03/20
 * @since 1.0.0
 */
public interface WebsiteRepository {

    boolean persistLink(Credential credential, WebLink webLink);

    boolean deleteLink(Credential credential, Long linkId);

    WebLink renderLink(Credential credential, Long linkId);

    WebLink updateLink(Credential credential, WebLink updateLink);

    void rankLink(Long linkId, boolean isUpRank);
}
