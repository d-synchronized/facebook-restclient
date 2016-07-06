package com.thread.dynamics.facebook.service.impl;

import com.thread.dynamics.facebook.resource.AuthResource;
import com.thread.dynamics.facebook.service.AuthService;
import com.thread.dynamics.facebook.service.BaseService;

/**
 * The Class AuthServiceImpl.
 */
public class AuthServiceImpl extends BaseService<AuthResource> implements AuthService {

    /**
     * Instantiates a new auth service impl.
     */
    public AuthServiceImpl() {
        super(AuthResource.class);
    }

}
