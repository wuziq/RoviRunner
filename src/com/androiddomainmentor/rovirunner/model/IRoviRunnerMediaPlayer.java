package com.androiddomainmentor.rovirunner.model;

import java.io.FileDescriptor;
import java.io.IOException;

import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.widget.MediaController.MediaPlayerControl;

public interface IRoviRunnerMediaPlayer extends MediaPlayerControl
{

    void setOnPreparedListener( OnPreparedListener listener );

    void setOnCompletionListener( OnCompletionListener listener );

    void setOnErrorListener( OnErrorListener listener );

    void setDataSource( FileDescriptor fileDescriptor,
                        long startOffset,
                        long length ) throws IllegalArgumentException, IllegalStateException, IOException;

    void prepareAsync();

}
