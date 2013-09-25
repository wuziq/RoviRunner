package com.androiddomainmentor.rovirunner.model.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.androiddomainmentor.rovirunner.model.IStreamingSource;
import com.androiddomainmentor.rovirunner.model.IStreamingSourcesManager;

public class StreamingSourcesManager implements IStreamingSourcesManager
{

    @Override
    public Map<String, String> getAvailableStreamingSources()
    {
        // TODO [2013-09-08 KW]:  implement this; fake data for now
        // TODO [2013-09-08 KW]:  how to preserve order? 
        Map<String, String> fakeSources = new HashMap<String, String>();
        fakeSources.put( UUID.randomUUID().toString(), "di.fm" );
        fakeSources.put( UUID.randomUUID().toString(), "Pandora" );
        fakeSources.put( UUID.randomUUID().toString(), "Songza" );
        fakeSources.put( UUID.randomUUID().toString(), "Spotify" );
        
        return fakeSources;
    }

    @Override
    public IStreamingSource getStreamingSource( String id )
    {
        // TODO [2013-09-08 KW]:  implement this
        return null;
    }

}
