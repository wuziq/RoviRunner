package com.androiddomainmentor.rovirunner.presenter.impl;

import android.widget.MediaController.MediaPlayerControl;

import com.androiddomainmentor.rovirunner.model.IRoviRunnerMediaPlayer;
import com.androiddomainmentor.rovirunner.presenter.IMediaPlayerPresenter;
import com.androiddomainmentor.rovirunner.view.IMediaPlayerView;

public class MediaPlayerPresenter implements IMediaPlayerPresenter
{
    private IRoviRunnerMediaPlayer m_mediaPlayer;

    public MediaPlayerPresenter( IMediaPlayerView mediaPlayerActivity )
    {
        // TODO Auto-generated constructor stub
    }

    @Override
    public MediaPlayerControl getMediaPlayerControl()
    {
        return m_mediaPlayer;
    }

}
