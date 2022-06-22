package com.example.sqlroom

class UserRepository (private val userDao: UserDao) {

    val selectUser = userDao.selectUsers()

    fun addUser(usuario: Usuario){
        userDao.addUser(usuario)
    }
}