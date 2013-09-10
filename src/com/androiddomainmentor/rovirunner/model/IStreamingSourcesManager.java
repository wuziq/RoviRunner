package com.androiddomainmentor.rovirunner.model;

import java.util.Map;

/*
 * This interface is for the thing that manages what streaming sources are 
 * available to choose from.  It should do two main things:
 * 
 * 1.  Provide a list of available streaming sources.
 * 2.  Provide an instance of a streaming source.
 */
public interface IStreamingSourcesManager
{
    // returns a list of available streaming sources
    public Map<String, String> getAvailableStreamingSources();
    
    // returns an instance of a streaming source
    public IStreamingSource getStreamingSource( String id );
}
