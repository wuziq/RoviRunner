package com.androiddomainmentor.rovirunner.presenter.impl;

import android.widget.Toast;

import com.androiddomainmentor.rovirunner.presenter.IMainActivityPresenter;
import com.androiddomainmentor.rovirunner.view.IMainActivityView;

public class MainActivityPresenter implements IMainActivityPresenter
{
    private IMainActivityView m_view;

    public MainActivityPresenter( IMainActivityView view )
    {
        m_view = view;
    }

    @Override
    public void playLocalMusic()
    {
        // TODO [2013-09-07 KW]: implement this
        Toast.makeText( m_view.getContextFromActivity(),
                        "OONTZ OONTZ OONTZ OONTZ",
                        Toast.LENGTH_LONG )
             .show();
    }
}
