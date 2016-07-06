package com.thread.dynamics.facebook.service.impl;

import com.thread.dynamics.facebook.resource.FeedResource;
import com.thread.dynamics.facebook.service.BaseService;
import com.thread.dynamics.facebook.service.FeedService;

/**
 * The Class FeedServiceImpl.
 */
public class FeedServiceImpl extends BaseService<FeedResource> implements FeedService {

    /**
     * Instantiates a new feed service impl.
     *
     * @param clazz the clazz
     */
    public FeedServiceImpl(Class<FeedResource> clazz) {
        super(clazz);
    }

}
