package com.sparker.data;

import com.sparker.model.Credential;

/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 *          <p/>
 *          Creation Date: 2015/03/20
 * @since 1.0.0
 */
public interface AccountRepository {

    Credential create(Credential credential);

    boolean delete(Long credentialId);

    Credential login(Credential credential);

    Credential update(Credential credential);
}
