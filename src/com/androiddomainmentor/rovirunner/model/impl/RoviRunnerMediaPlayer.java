package com.androiddomainmentor.rovirunner.model.impl;

import java.io.IOException;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;

import com.androiddomainmentor.rovirunner.model.IRoviRunnerMediaPlayer;

public class RoviRunnerMediaPlayer implements IRoviRunnerMediaPlayer
{
    private MediaPlayer m_player = null;
    private Context m_context;
    
    public RoviRunnerMediaPlayer(Context context)
    {
        m_context = context;
        m_player = new MediaPlayer();
    }

    @Override
    public boolean canPause()
    {
        return true;
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
        return m_player.getCurrentPosition();
    }

    @Override
    public int getDuration()
    {
        return m_player.getDuration();
    }

    @Override
    public boolean isPlaying()
    {
        return m_player.isPlaying();
    }

    @Override
    public void pause()
    {
        m_player.pause();
    }

    @Override
    public void seekTo( int pos )
    {
        m_player.seekTo(pos);
    }

    @Override
    public void start()
    {
        AssetFileDescriptor afd;
        try
        {
            afd = m_context.getAssets().openFd("get_lucky_30s.mp3");
            m_player.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            m_player.prepare();
            m_player.start();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}