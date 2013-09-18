package com.androiddomainmentor.rovirunner.view.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ExpandableListView;

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
    private ExpandableListView m_expListStreamMusic;

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
        m_expListStreamMusic = (ExpandableListView)findViewById( R.id.expandableListView_internet_music );
        
        // set event handlers
        m_buttonPlayLocalMusic.setOnClickListener( this );
        
        m_expListStreamMusic.setAdapter( m_presenter.getStreamingSourcesAdapter() );
        
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
        case R.id.expandableListView_internet_music:
            // TODO [2013-09-08 KW] do something
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
