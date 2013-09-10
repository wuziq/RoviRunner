package com.androiddomainmentor.rovirunner.presenter.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.widget.ExpandableListAdapter;
import android.widget.SimpleExpandableListAdapter;
import android.widget.Toast;

import com.androiddomainmentor.rovirunner.R;
import com.androiddomainmentor.rovirunner.model.IStreamingSourcesManager;
import com.androiddomainmentor.rovirunner.model.impl.StreamingSourcesManager;
import com.androiddomainmentor.rovirunner.presenter.IMainActivityPresenter;
import com.androiddomainmentor.rovirunner.view.IMainActivityView;

public class MainActivityPresenter implements IMainActivityPresenter
{
    private IMainActivityView m_view;
    private IStreamingSourcesManager m_streamingSourcesMgr;

    public MainActivityPresenter( IMainActivityView view )
    {
        m_view = view;
        m_streamingSourcesMgr = new StreamingSourcesManager();
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

    @Override
    public ExpandableListAdapter getStreamingSourcesAdapter()
    {
        // refer to:  http://blog.denevell.org/android-SimpleExpandableListAdapter-example.html
        
        // keys for our maps we'll be creating
        final String KEY_GROUP_NAME = "GROUP_NAME";
        final String KEY_CHILD_NAME = "STREAM_SOURCE";
        
        // we only have one parent
        List<Map<String, String>> listOfParents = new ArrayList<Map<String, String>>();
        Map<String, String> parents = new HashMap<String, String>();
        parents.put( KEY_GROUP_NAME, "Stream music from..." );
        listOfParents.add( parents );

        // that one parent has children; each child needs to be its own map, which may 
        // seem interesting, but it's required by SimpleExpandableListAdapter
        List<List<Map<String, String>>> listOfChildLists = new ArrayList<List<Map<String, String>>>();
        List<Map<String, String>> children = new ArrayList<Map<String, String>>();
        for ( String value : m_streamingSourcesMgr.getAvailableStreamingSources().values() )
        {
            Map<String, String> child = new HashMap<String, String>();
            child.put( KEY_CHILD_NAME, value );
            children.add( child );
        }
        listOfChildLists.add( children );
        
        ExpandableListAdapter adapter = new SimpleExpandableListAdapter( m_view.getContextFromActivity(),
                                                                         listOfParents,
                                                                         R.layout.streaming_sources_group_view,
                                                                         new String[] { KEY_GROUP_NAME },
                                                                         new int[] { R.id.streaming_sources_group_name },
                                                                         listOfChildLists,
                                                                         R.layout.streaming_sources_row_view,
                                                                         new String[] { KEY_CHILD_NAME },
                                                                         new int[] { R.id.streaming_sources_row_name } );
        
        return adapter;
    }
}
