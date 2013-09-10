package com.androiddomainmentor.rovirunner.model;

/*
 * This is a streaming source's interface.  Use this to do things like pass 
 * user credentials, execute playback, and pass target BPM.
 */
public interface IStreamingSource
{
    // returns a unique ID for this streaming source
    public String getID();
    
    // returns the "regular name" of this source, e.g., "Pandora" or "Spotify"
    public String getName();
    
    // set target BPM
    public void setTargetBPM( int targetBPM );
    
    // set user credentials (we might need more than username/password, so maybe use a struct instead)
    public void setCredentials( String username, 
                                String password );

    // not sure how this will work.  hook up in impl?  or return audio stream for caller to hook up?
    public void play();
}
