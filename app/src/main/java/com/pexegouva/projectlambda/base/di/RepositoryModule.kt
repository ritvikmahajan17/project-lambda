package com.pexegouva.projectlambda.base.di

import com.pexegouva.projectlambda.features.login.LoginDataStoreFactory
import com.pexegouva.projectlambda.features.login.LoginRepository
import com.pexegouva.projectlambda.features.login.LoginService
import org.koin.core.module.Module
import org.koin.dsl.module

val repositoryModule: Module = module {
  single {
    LoginRepository(loginDataStoreFactory = get())
  }

  single {
    LoginDataStoreFactory(service = get())
  }

  single {
    LoginService()
  }
}
