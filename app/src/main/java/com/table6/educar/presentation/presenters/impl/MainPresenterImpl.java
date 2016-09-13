package com.table6.educar.presentation.presenters.impl;

import com.table6.educar.domain.executor.Executor;
import com.table6.educar.domain.executor.MainThread;
import com.table6.educar.domain.interactors.SampleInteractor;
import com.table6.educar.presentation.presenters.base.AbstractPresenter;
import com.table6.educar.presentation.presenters.MainPresenter;

/**
 * Created by dmilicic on 12/13/15.
 */
public class MainPresenterImpl extends AbstractPresenter implements MainPresenter,
        SampleInteractor.Callback {

    private MainPresenter.View mView;

    public MainPresenterImpl(Executor executor,
                             MainThread mainThread,
                             View view) {
        super(executor, mainThread);
        mView = view;
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void onError(String message) {

    }
}
