package com.kenzie.capstone.service.dependency;

import com.kenzie.capstone.service.PlantLambdaService;

import com.kenzie.capstone.service.dao.PlantDao;
import dagger.Module;
import dagger.Provides;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Module(includes = DaoModule.class)
public class ServiceModule {

    @Singleton
    @Provides
    @Inject
    public PlantLambdaService providePlantListLambdaService(@Named("PlantDao") PlantDao plantDao) {
        return new PlantLambdaService(plantDao);
    }
}

