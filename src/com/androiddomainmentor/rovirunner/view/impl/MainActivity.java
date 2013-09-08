package com.androiddomainmentor.rovirunner.view.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.androiddomainmentor.rovirunner.R;
import com.androiddomainmentor.rovirunner.presenter.IMainActivityPresenter;
import com.androiddomainmentor.rovirunner.presenter.impl.MainActivityPresenter;
import com.androiddomainmentor.rovirunner.view.IMainActivityView;

public class MainActivity extends Activity implements
                                          IMainActivityView,
                                          OnClickListener
{
    private IMainActivityPresenter m_presenter;
    private Button m_buttonPlayLocalMusic;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        
        // instantiate presenter
        m_presenter = new MainActivityPresenter( this );
        
        // set layout
        setContentView( R.layout.activity_main );
        
        // assign layout stuff to our members
        m_buttonPlayLocalMusic = (Button)findViewById( R.id.button_play_local_music );
        
        // set event handlers
        m_buttonPlayLocalMusic.setOnClickListener( this );

        // TODO [2013-09-07 KW] set up expandable list view
    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu )
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.main,
                                   menu );
        return true;
    }

    // our click handler
    @Override
    public void onClick( View v )
    {
        switch ( v.getId() )
        {
        case R.id.button_play_local_music:
            m_presenter.playLocalMusic();
            break;
        default:
            // shouldn't get here
            break;
        }
    }

    @Override
    public Context getContextFromActivity()
    {
        return getApplicationContext();
    }

}
