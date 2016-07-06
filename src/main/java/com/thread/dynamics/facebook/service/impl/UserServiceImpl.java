package com.thread.dynamics.facebook.service.impl;

import com.thread.dynamics.facebook.resource.UserResource;
import com.thread.dynamics.facebook.service.BaseService;
import com.thread.dynamics.facebook.service.UserService;

/**
 * The Class UserServiceImpl.
 */
public class UserServiceImpl extends BaseService<UserResource> implements UserService {

    /**
     * Instantiates a new user service impl.
     */
    public UserServiceImpl() {
        super(UserResource.class);
    }


}
