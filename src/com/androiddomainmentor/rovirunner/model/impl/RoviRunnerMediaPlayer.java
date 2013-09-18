package com.androiddomainmentor.rovirunner.model.impl;

import android.media.MediaPlayer;

import com.androiddomainmentor.rovirunner.model.IRoviRunnerMediaPlayer;

public class RoviRunnerMediaPlayer implements IRoviRunnerMediaPlayer
{
    private MediaPlayer m_player = null;
    
    public RoviRunnerMediaPlayer()
    {
        // nothing yet
    }

    @Override
    public boolean canPause()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean canSeekBackward()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean canSeekForward()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getBufferPercentage()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getCurrentPosition()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getDuration()
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isPlaying()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void pause()
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void seekTo( int pos )
    {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void start()
    {
        // TODO Auto-generated method stub
        
    }
    
    
    
}
