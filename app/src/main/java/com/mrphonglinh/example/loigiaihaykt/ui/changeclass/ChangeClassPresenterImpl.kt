package com.mrphonglinh.example.loigiaihaykt.ui.changeclass

import com.mrphonglinh.example.loigiaihaykt.network.ApiClient
import com.mrphonglinh.example.loigiaihaykt.network.ApiService

class ChangeClassPresenterImpl : ChangeClassContract.ChangeClassPresenter {
    var view: ChangeClassContract.ChangeClassView? = null
    var apiService: ApiService? = null

    constructor(view: ChangeClassContract.ChangeClassView) {
        this.view = view
        this.apiService = ApiClient.create()
    }

    override fun loadListClass() {
        //Single<ResponseTag>
    }

    /*
    @Override
    public void getMovies() {
        getObservable().subscribeWith(getObserver());
    }

      public Observable<MovieResponse> getObservable(){
        return NetworkClient.getRetrofit().create(NetworkInterface.class)
                            .getMovies("004cbaf19212094e32aa9ef6f6577f22")
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread());
    }

    public DisposableObserver<MovieResponse> getObserver(){
        return new DisposableObserver<MovieResponse>() {

            @Override
            public void onNext(@NonNull MovieResponse movieResponse) {
                Log.d(TAG,"OnNext"+movieResponse.getTotalResults());
                mvi.displayMovies(movieResponse);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.d(TAG,"Error"+e);
                e.printStackTrace();
                mvi.displayError("Error fetching Movie Data");
            }

            @Override
            public void onComplete() {
                Log.d(TAG,"Completed");
            }
        };
    }*/
}