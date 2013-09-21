package com.androiddomainmentor.rovirunner.view.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;

import com.androiddomainmentor.rovirunner.R;
import com.androiddomainmentor.rovirunner.presenter.IMediaPlayerPresenter;
import com.androiddomainmentor.rovirunner.presenter.impl.MediaPlayerPresenter;
import com.androiddomainmentor.rovirunner.view.IMediaPlayerView;

public class MediaPlayerActivity extends Activity implements IMediaPlayerView
{
    private IMediaPlayerPresenter m_presenter;
    private MediaController m_mediaController;
    private TextView m_artistText;
    private TextView m_songText;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );

        // instantiate presenter
        m_presenter = new MediaPlayerPresenter( this, 
                                                getApplicationContext() );

        // set layout
        setContentView( R.layout.mediaplayer_view );

        // assign layout elements
        m_mediaController = (MediaController)findViewById( R.id.media_controller );
        m_artistText = (TextView)findViewById( R.id.artist_text_view );
        m_songText = (TextView)findViewById( R.id.song_text_view );

        // hook up media player to media control
        m_mediaController.setMediaPlayer( m_presenter.getMediaPlayerControl() );
        m_mediaController.setAnchorView( getCurrentFocus() );
        
        // TODO [2013-09-21 KW]:  for now, play a song
        m_presenter.playRandomSong();
    }

    @Override
    public void setArtistText( String artistName )
    {
        m_artistText.setText( artistName );
    }

    @Override
    public void setSongText( String songName )
    {
        m_songText.setText( songName );
    }

    
    // TODO [2013-09-18 KW]:  implement lifecycle events
    @Override
    protected void onDestroy()
    {
        // TODO Auto-generated method stub
        super.onDestroy();
    }

    @Override
    protected void onPause()
    {
        // TODO Auto-generated method stub
        super.onPause();
    }

    @Override
    protected void onRestart()
    {
        // TODO Auto-generated method stub
        super.onRestart();
    }

    @Override
    protected void onResume()
    {
        // TODO Auto-generated method stub
        super.onResume();
    }

    @Override
    protected void onStart()
    {
        // TODO Auto-generated method stub
        super.onStart();
    }

    @Override
    protected void onStop()
    {
        // TODO Auto-generated method stub
        super.onStop();
    }

}
