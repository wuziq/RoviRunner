package com.androiddomainmentor.rovirunner.presenter.impl;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.RobolectricTestRunner;
import com.androiddomainmentor.rovirunner.presenter.IMediaPlayerPresenter;
import com.androiddomainmentor.rovirunner.view.IMediaPlayerView;
import android.test.mock.MockContext;

@RunWith( RobolectricTestRunner.class )
public class MediaPlayerPresenterTests
{
    IMediaPlayerPresenter m_presenter = null;
    IMediaPlayerView m_view = null;
    
    @Before
    public void setUp()
    {
        m_view = Mockito.mock( IMediaPlayerView.class );
        m_presenter = new MediaPlayerPresenter( m_view, new MockContext() );
    }
}
