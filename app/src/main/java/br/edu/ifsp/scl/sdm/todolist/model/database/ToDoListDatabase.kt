package br.edu.ifsp.scl.sdm.todolist.model.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.edu.ifsp.scl.sdm.todolist.model.dao.TaskDao
import br.edu.ifsp.scl.sdm.todolist.model.entity.Task

@Database(entities = [Task::class], version = 1)//tomar cuidado com a versao do banco de dados, aqui que atualiza ela
abstract class ToDoListDatabase: RoomDatabase() {
    companion object {
        const val TO_DO_LIST_DATABASE = "toDoListDatabase"//nome do banco de dados
    }
    abstract fun getTaskDao(): TaskDao
}